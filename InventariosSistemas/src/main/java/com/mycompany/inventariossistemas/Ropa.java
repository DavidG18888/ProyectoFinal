/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariossistemas;

/**
 *
 * @author Ingrid
 */

public class Ropa extends Producto {
    // Constructor que llama al constructor de la clase Producto
    public Ropa(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    // Metodo que devuelve la categoria del producto (Ropa)
    public String getCategoria() {
        return "Ropa";
    }
}