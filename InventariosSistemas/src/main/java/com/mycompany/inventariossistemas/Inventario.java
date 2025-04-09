/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariossistemas;


/**
 *
 * @author Ingrid
 */

import java.util.*;

public class Inventario {
    // Lista que guarda los productos
    private List<Producto> productos = new ArrayList<>();

    // Agrega un producto al inventario
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Elimina un producto por nombre
    public boolean eliminarProducto(String nombre) {
        return productos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
    }

    // Muestra todos los productos del inventario
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario");
            return;
        }
        // Muestra la informacion de cada producto
        for (Producto p : productos) {
            System.out.printf("%s | %s | Precio: %.2f | Cantidad: %d\n",
                    p.getCategoria(), p.getNombre(), p.getPrecio(), p.getCantidad());
            // Muestra advertencia si la cantidad es baja
            if (p.getCantidad() < 5) {
                System.out.println("️| Advertencia: Inventario bajo! | ");
            }
        }
    }

    // Modifica el nombre de un producto
    public boolean modificarNombreProducto(String nombreActual, String nuevoNombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreActual)) {
                producto.setNombre(nuevoNombre);
                return true;
            }
        }
        return false;
    }

    // Modifica el precio de un producto
    public boolean modificarPrecioProducto(String nombre, double nuevoPrecio) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                producto.setPrecio(nuevoPrecio);
                return true;
            }
        }
        return false;
    }

    // Gestiona la cantidad de un producto (aumenta o disminuye)
    public void gestionarCantidad(String nombre, boolean aumentar, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                // Calcula la nueva cantidad
                int nuevaCantidad = aumentar ? producto.getCantidad() + cantidad : producto.getCantidad() - cantidad;
                // Actualiza la cantidad sin que sea negativa
                producto.setCantidad(Math.max(0, nuevaCantidad));
                System.out.println("Cantidad actualizada - Nueva cantidad: " + producto.getCantidad());
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }
}