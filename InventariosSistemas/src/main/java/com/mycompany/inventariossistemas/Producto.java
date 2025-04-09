/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariossistemas;



/**
 *
 * @author DavidGomez
 */

public abstract class Producto {
    // Atributos del producto
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor de la clase Producto, inicializa nombre, precio y cantidad
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Metodo que obtiene el nombre del producto
    public String getNombre() { return nombre; }

    // Metodo que establece el nombre del producto
    public void setNombre(String nombre) { this.nombre = nombre; }

    // Metodo que obtiene el precio del producto
    public double getPrecio() { return precio; }

    // Metodo que establece el precio del producto
    public void setPrecio(double precio) { this.precio = precio; }

    // Metodo que obtiene la cantidad disponible del producto
    public int getCantidad() { return cantidad; }

    // Metodo que establece la cantidad del producto
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    // Metodo abstracto que devuelve la categoria del producto
    public abstract String getCategoria();
}