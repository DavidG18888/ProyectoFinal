/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariossistemas;

/**
 *
 * @author Ingrid
 */

public class Tecnologia extends Producto {

    // Constructor que inicializa el producto con su nombre, precio y cantidad
    public Tecnologia(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);  // Llama al constructor de la clase base (Producto)
    }

    // Metodo que devuelve la categoria del producto
    public String getCategoria() {
        return "Tecnologia";  // Retorna el nombre de la categoria
    }
}