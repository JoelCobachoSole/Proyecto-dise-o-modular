package Proyectodiseñomodular;

public class ordenar {

    public static void ordenarPorPrecioAscendente() {
        boolean ascendente = true;
        // Bucle para recorrer todos los elementos del array de precios
        for (int i = 0; i < Main.precio.length - 1; i++) {
            for (int j = i + 1; j < Main.precio.length; j++) {
                // Comparar precios y ordenar en orden ascendente
                if ((ascendente && Main.precio[i] > Main.precio[j]) || (!ascendente && Main.precio[i] < Main.precio[j])) {
                    // Intercambiar precios
                    double tempPrecio = Main.precio[i];
                    Main.precio[i] = Main.precio[j];
                    Main.precio[j] = tempPrecio;

                    // Intercambiar nombres de hierbas
                    String tempHierba = Main.hierba[i];
                    Main.hierba[i] = Main.hierba[j];
                    Main.hierba[j] = tempHierba;

                    // Intercambiar orígenes
                    String tempOrigen = Main.origen[i];
                    Main.origen[i] = Main.origen[j];
                    Main.origen[j] = tempOrigen;
                }
            }
        }
        System.out.println("Productos ordenados por precio ascendente: ");
        for (int i = 0; i < Main.hierba.length; i++) {
            System.out.println(Main.hierba[i] + " - " + Main.origen[i] + " - " + Main.precio[i]);
        }
    }

    public static void ordenarPorPrecioDescendente() {
        boolean ascendente = false;
        // Bucle para recorrer todos los elementos del array de precios
        for (int i = 0; i < Main.precio.length - 1; i++) {
            for (int j = i + 1; j < Main.precio.length; j++) {
                // Comparar precios y ordenar en orden descendente
                if ((ascendente && Main.precio[i] > Main.precio[j]) || (!ascendente && Main.precio[i] < Main.precio[j])) {
                    // Intercambiar precios
                    double tempPrecio = Main.precio[i];
                    Main.precio[i] = Main.precio[j];
                    Main.precio[j] = tempPrecio;

                    // Intercambiar nombres de hierbas
                    String tempHierba = Main.hierba[i];
                    Main.hierba[i] = Main.hierba[j];
                    Main.hierba[j] = tempHierba;

                    // Intercambiar orígenes
                    String tempOrigen = Main.origen[i];
                    Main.origen[i] = Main.origen[j];
                    Main.origen[j] = tempOrigen;
                }
            }
        }

        System.out.println("Productos ordenados por precio descendente: ");
        for (int i = 0; i < Main.hierba.length; i++) {
            System.out.println(Main.hierba[i] + " - " + Main.origen[i] + " - " + Main.precio[i]);
        }
    }
}