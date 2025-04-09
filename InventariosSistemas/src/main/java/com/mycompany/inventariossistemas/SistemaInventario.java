/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariossistemas;


/**
 *
 * @author DavidGomez
 */


import java.util.Scanner;

public class SistemaInventario {
    // Atributos del sistema de inventario
    private Inventario inventario = new Inventario();  // Objeto para manejar el inventario
    private ProveedorManager proveedorManager = new ProveedorManager();  // Objeto para manejar los proveedores
    private Scanner scanner = new Scanner(System.in);  // Escaner para leer la entrada del usuario

    // Metodo principal para iniciar el sistema
    public void iniciar() {
        int opcion;
        do {
            // Muestra el menu principal
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Gestionar producto");
            System.out.println("3. Ver productos");
            System.out.println("4. Agregar proveedor");
            System.out.println("5. Eliminar proveedor");
            System.out.println("6. Ver proveedores");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            // Lee la opcion del usuario
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Intenta de nuevo.");
                opcion = -1;  // Si la entrada no es un numero, asigna -1
            }

            // Ejecuta la opcion seleccionada por el usuario
            switch (opcion) {
                case 1 -> agregarProducto();  // Llama al metodo para agregar un producto
                case 2 -> gestionarProducto();  // Llama al metodo para gestionar un producto
                case 3 -> inventario.mostrarProductos();  // Muestra los productos del inventario
                case 4 -> {  // Agrega un proveedor
                    System.out.print("Nombre del proveedor: ");
                    String nombre = scanner.nextLine();
                    proveedorManager.agregarProveedor(new Proveedor(nombre));
                }
                case 5 -> {  // Elimina un proveedor
                    System.out.print("Nombre del proveedor a eliminar: ");
                    String nombre = scanner.nextLine();
                    proveedorManager.eliminarProveedor(nombre);
                }
                case 6 -> proveedorManager.mostrarProveedores();  // Muestra la lista de proveedores
                case 0 -> System.out.println("Saliendo...");  // Sale del sistema
                default -> System.out.println("Opcion invalida.");  // Opcion invalida
            }
        } while (opcion != 0);  // El ciclo continua hasta que el usuario elija la opcion 0
    }

    // Metodo para agregar un producto al inventario
    private void agregarProducto() {
        System.out.println("--- Categorias: 1. Ropa  2. Tecnologia  3. Hogar ---");
        String categoria = scanner.nextLine();  // Lee la categoria del producto
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();  // Lee el nombre del producto
        System.out.print("Precio del producto: ");
        double precio = Double.parseDouble(scanner.nextLine());  // Lee el precio del producto
        System.out.print("Cantidad de productos: ");
        int cantidad = Integer.parseInt(scanner.nextLine());  // Lee la cantidad del producto

        // Crea el producto segun la categoria seleccionada
        Producto producto = switch (categoria) {
            case "1" -> new Ropa(nombre, precio, cantidad);  // Si la categoria es 1, crea un objeto Ropa
            case "2" -> new Tecnologia(nombre, precio, cantidad);  // Si la categoria es 2, crea un objeto Tecnologia
            case "3" -> new Hogar(nombre, precio, cantidad);  // Si la categoria es 3, crea un objeto Hogar
            default -> null;  // Si la categoria no es valida, asigna null
        };

        // Si el producto no es null, lo agrega al inventario
        if (producto != null) {
            inventario.agregarProducto(producto);
            System.out.println("Producto agregado con exito");
        } else {
            System.out.println("Categoria invalida");  // Si la categoria es invalida, muestra un mensaje
        }
    }

    // Metodo para gestionar un producto (eliminar, aumentar, disminuir cantidad, modificar precio)
    private void gestionarProducto() {
        System.out.println("--- Gestionar Producto ---");
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();  // Lee el nombre del producto
        System.out.println("1. Eliminar");
        System.out.println("2. Aumentar cantidad");
        System.out.println("3. Disminuir cantidad");
        System.out.println("4. Modificar precio");
        String opcion = scanner.nextLine();  // Lee la opcion seleccionada

        // Realiza la accion segun la opcion seleccionada
        switch (opcion) {
            case "1" -> {  // Elimina el producto
                if (inventario.eliminarProducto(nombre)) {
                    System.out.println("Producto eliminado");
                } else {
                    System.out.println("Producto no encontrado");
                }
            }
            case "2" -> {  // Aumenta la cantidad del producto
                System.out.print("Cantidad a aumentar: ");
                int cant = Integer.parseInt(scanner.nextLine());
                inventario.gestionarCantidad(nombre, true, cant);
            }
            case "3" -> {  // Disminuye la cantidad del producto
                System.out.print("Cantidad a disminuir: ");
                int cant = Integer.parseInt(scanner.nextLine());
                inventario.gestionarCantidad(nombre, false, cant);
            }
            case "4" -> {  // Modifica el precio del producto
                System.out.print("Nuevo precio: ");
                double precio = Double.parseDouble(scanner.nextLine());
                if (inventario.modificarPrecioProducto(nombre, precio)) {
                    System.out.println("Precio actualizado");
                } else {
                    System.out.println("Producto no encontrado");
                }
            }
            default -> System.out.println("Opcion invalida");  // Opcion invalida
        }
    }
}