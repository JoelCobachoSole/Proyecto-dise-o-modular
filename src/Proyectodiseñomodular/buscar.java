package Proyectodiseñomodular;

public class buscar {

    public static void buscarPorNombre(String nombre) {
        boolean encontrado = false; // Variable para indicar si el producto fue encontrado
        
        for (int i = 0; i < Main.hierba.length; i++) {
            // Comparar el nombre del producto con los nombres en el array
            if (Main.hierba[i].toLowerCase().contains(nombre.toLowerCase())) {
                // Si se encuentra el producto, imprimir sus detalles
                System.out.println("Producto encontrado: " + Main.hierba[i] + ", Origen: " + Main.origen[i] + ", Precio: " + Main.precio[i]);
                encontrado = true; // Marcar que el producto fue encontrado
            }
        }
        // Si no se encontró el producto, imprimir un mensaje de error
        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    public static void buscarPorOrigen(String lugar) {
        boolean encontrado = false; 
        for (int i = 0; i < Main.origen.length; i++) {
            // Comparar el origen del producto con los orígenes en el array
            if (Main.origen[i].toLowerCase().contains(lugar.toLowerCase())) {
                // Si se encuentra el producto, imprimir sus detalles
                System.out.println("Producto encontrado: " + Main.hierba[i] + ", Origen: " + Main.origen[i] + ", Precio: " + Main.precio[i]);
                encontrado = true; // Marcar que el producto fue encontrado
            }
        }
        // Si no se encontró el producto, imprimir un mensaje de error
        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }
}