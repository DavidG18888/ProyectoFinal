/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariossistemas;


/**
 *
 * @author Ingrid
 */


public class Proveedor {
    // Atributo que guarda el nombre del proveedor
    private String nombre;

    // Constructor que inicializa el nombre del proveedor
    public Proveedor(String nombre) {
        this.nombre = nombre;
    }

    // Metodo que obtiene el nombre del proveedor
    public String getNombre() {
        return nombre;
    }
}