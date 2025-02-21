package Proyectodiseñomodular;

public class buscar {
    public static String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
    public static String[] origen = { "Mexico", "Andorra", "Marrueco", "Palestina" };
    public static double[] precio = { 1.70, 4.20, 2.47, 1.33 };

    public static void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < hierba.length; i++) {
            if (hierba[i].toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println("Producto encontrado: " + hierba[i] + ", Origen: " + origen[i] + ", Precio: " + precio[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    public static void buscarPorOrigen(String lugar) {
        boolean encontrado = false;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i].toLowerCase().contains(lugar.toLowerCase())) {
                System.out.println("Producto encontrado: " + hierba[i] + ", Origen: " + origen[i] + ", Precio: " + precio[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }
}