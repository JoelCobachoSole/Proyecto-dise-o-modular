package Proyectodiseñomodular;

import java.util.Scanner;

public class carrito {
    public static int MAX_PRODUCTOS = 100; // Número máximo de productos en el carrito
    public static String[] productos = new String[MAX_PRODUCTOS]; 
    public static double[] cantidades = new double[MAX_PRODUCTOS]; 
    public static double[] precios = new double[MAX_PRODUCTOS]; 
    public static int contador = 0; // Contador para llevar la cuenta de los productos en el carrito

    public static void seleccionarProducto() {
        if (contador < MAX_PRODUCTOS) { // Verificar si hay espacio en el carrito
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce el nombre del producto a comprar: ");
            String producto = scanner.nextLine();
            System.out.print("Introduce la cantidad: ");
            double cantidad = scanner.nextDouble();
            scanner.nextLine(); 

            int index = -1;
            // Buscar el producto en el array de hierbas
            for (int i = 0; i < Main.hierba.length; i++) {
                if (Main.hierba[i].equalsIgnoreCase(producto)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) { // Si el producto se encuentra
                productos[contador] = Main.hierba[index]; // Añadir el nombre del producto al carrito
                cantidades[contador] = cantidad; // Añadir la cantidad al carrito
                precios[contador] = Main.precio[index]; // Añadir el precio al carrito
                contador++; // Incrementar el contador 
                System.out.println("Producto añadido al carrito: " + producto + " - Cantidad: " + cantidad + " - Precio: " + Main.precio[index] + "€");
            } else {
                System.out.println("Producto no encontrado.");
            }
        } else {
            System.out.println("El carrito está lleno. No se pueden añadir más productos."); 
        }
    }

    public static void eliminarProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del producto a eliminar: ");
        String producto = scanner.nextLine();

        int index = -1;
        // Buscar el producto en el carrito
        for (int i = 0; i < contador; i++) {
            if (productos[i].equalsIgnoreCase(producto)) {
                index = i;
                break;
            }
        }
        if (index != -1) { // Si el producto se encuentra
            // Desplazar los elementos del array para eliminar el producto
            for (int i = index; i < contador - 1; i++) {
                productos[i] = productos[i + 1];
                cantidades[i] = cantidades[i + 1];
                precios[i] = precios[i + 1];
            }
            contador--; // Decrementar el contador de productos en el carrito
            System.out.println("Producto eliminado del carrito: " + producto);
        } else {
            System.out.println("Producto no encontrado en el carrito: " + producto); 
        }
    }

    public static void finalizarCompra() {
        double total = 0;
        System.out.println("Resumen de la compra:");
        // Calcular el total de la compra
        for (int i = 0; i < contador; i++) {
            double subtotal = cantidades[i] * precios[i];
            total += subtotal;
            System.out.println(productos[i] + " - Cantidad: " + cantidades[i] + " - Subtotal: " + subtotal + "€");
        }
        System.out.println("Total de la compra: " + total + "€");
    }
}