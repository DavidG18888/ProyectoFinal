/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariossistemas;


/**
 *
 * @author Ingrid
 */


// Clase Hogar que hereda de Producto
public class Hogar extends Producto {

    // Constructor que llama al de Producto
    public Hogar(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    // Retorna la categoria del producto
    public String getCategoria() {
        return "Hogar";
    }
}