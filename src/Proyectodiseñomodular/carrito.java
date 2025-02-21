package Proyectodiseñomodular;

import java.util.Scanner;

public class carrito {
    public static int MAX_PRODUCTOS = 100;
    public static String[] productos = new String[MAX_PRODUCTOS];
    public static double[] cantidades = new double[MAX_PRODUCTOS];
    public static double[] precios = new double[MAX_PRODUCTOS];
    public static int contador = 0;

    public static void seleccionarProducto() {
        if (contador < MAX_PRODUCTOS) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce el nombre del producto a comprar: ");
            String producto = scanner.nextLine();
            System.out.print("Introduce la cantidad: ");
            double cantidad = scanner.nextDouble();
            scanner.nextLine(); 

            int index = -1;
            for (int i = 0; i < Main.hierba.length; i++) {
                if (Main.hierba[i].equalsIgnoreCase(producto)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                productos[contador] = Main.hierba[index];
                cantidades[contador] = cantidad;
                precios[contador] = Main.precio[index];
                contador++;
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
        for (int i = 0; i < contador; i++) {
            if (productos[i].equalsIgnoreCase(producto)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < contador - 1; i++) {
                productos[i] = productos[i + 1];
                cantidades[i] = cantidades[i + 1];
                precios[i] = precios[i + 1];
            }
            contador--;
            System.out.println("Producto eliminado del carrito: " + producto);
        } else {
            System.out.println("Producto no encontrado en el carrito: " + producto);
        }
    }

    public static void finalizarCompra() {
        double total = 0;
        System.out.println("Resumen de la compra:");
        for (int i = 0; i < contador; i++) {
            double subtotal = cantidades[i] * precios[i];
            total += subtotal;
            System.out.println(productos[i] + " - Cantidad: " + cantidades[i] + " - Subtotal: " + subtotal + "€");
        }
        System.out.println("Total de la compra: " + total + "€");
    }
}