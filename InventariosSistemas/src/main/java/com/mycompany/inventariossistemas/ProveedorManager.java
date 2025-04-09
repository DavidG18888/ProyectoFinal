/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariossistemas;


/**
 *
 * @author DavidGomez
 */

import java.util.*;

public class ProveedorManager {
    // Lista que guarda los proveedores
    private List<Proveedor> proveedores = new ArrayList<>();

    // Metodo que agrega un proveedor a la lista
    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    // Metodo que elimina un proveedor por nombre
    public void eliminarProveedor(String nombre) {
        // Si se encuentra y elimina el proveedor, muestra un mensaje
        if (proveedores.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre))) {
            System.out.println("Proveedor eliminado.");
        } else {
            System.out.println("Proveedor no encontrado.");
        }
    }

    // Metodo que muestra la lista de proveedores
    public void mostrarProveedores() {
        // Si no hay proveedores, muestra un mensaje
        if (proveedores.isEmpty()) {
            System.out.println("No hay proveedores.");
            return;
        }
        // Muestra el nombre de cada proveedor en la lista
        for (Proveedor p : proveedores) {
            System.out.println("Proveedor: " + p.getNombre());
        }
    }
}