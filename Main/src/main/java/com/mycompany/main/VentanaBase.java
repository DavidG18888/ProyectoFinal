/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import javax.swing.JFrame;


/**
 *
 * @author DavidGomez
 */
public abstract  class VentanaBase extends JFrame {
    public VentanaBase(String titulo) {
        super(titulo);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 600); // Puedes ajustar esto
        setLocationRelativeTo(null);
    }

    public abstract void inicializar();

    public void mostrar() {
        setVisible(true);
    }
}
