package Proyectodiseñomodular;

public class buscar {

    public static void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < Main.hierba.length; i++) {
            if (Main.hierba[i].toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println("Producto encontrado: " + Main.hierba[i] + ", Origen: " + Main.origen[i] + ", Precio: " + Main.precio[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    public static void buscarPorOrigen(String lugar) {
        boolean encontrado = false;
        for (int i = 0; i < Main.origen.length; i++) {
            if (Main.origen[i].toLowerCase().contains(lugar.toLowerCase())) {
                System.out.println("Producto encontrado: " + Main.hierba[i] + ", Origen: " + Main.origen[i] + ", Precio: " + Main.precio[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }
}