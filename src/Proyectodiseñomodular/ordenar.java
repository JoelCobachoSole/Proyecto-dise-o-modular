package Proyectodiseñomodular;

public class ordenar {
    public static String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
    public static String[] origen = { "Mexico", "Andorra", "Marrueco", "Palestina" };
    public static double[] precio = { 1.70, 4.20, 2.47, 1.33 };

    public static void ordenarPorPrecioAscendente() {
        boolean ascendente = true;
        for (int i = 0; i < precio.length - 1; i++) {
            for (int j = i + 1; j < precio.length; j++) {
                if ((ascendente && precio[i] > precio[j]) || (!ascendente && precio[i] < precio[j])) {

                    double tempPrecio = precio[i];
                    precio[i] = precio[j];
                    precio[j] = tempPrecio;

                    String tempHierba = hierba[i];
                    hierba[i] = hierba[j];
                    hierba[j] = tempHierba;

                    String tempOrigen = origen[i];
                    origen[i] = origen[j];
                    origen[j] = tempOrigen;
                }
            }
        }
        System.out.println("Productos ordenados por precio ascendente: ");
        for (int i = 0; i < hierba.length; i++) {
            System.out.println(hierba[i] + " - " + origen[i] + " - " + precio[i]);
        }
    }

    public static void ordenarPorPrecioDescendente() {
        boolean ascendente = false;
        for (int i = 0; i < precio.length - 1; i++) {
            for (int j = i + 1; j < precio.length; j++) {
                if ((ascendente && precio[i] > precio[j]) || (!ascendente && precio[i] < precio[j])) {

                    double tempPrecio = precio[i];
                    precio[i] = precio[j]; 
                    precio[j] = tempPrecio;

                    String tempHierba = hierba[i];
                    hierba[i] = hierba[j];
                    hierba[j] = tempHierba;

                    String tempOrigen = origen[i];
                    origen[i] = origen[j];
                    origen[j] = tempOrigen;
                }
            }
        }
        System.out.println("Productos ordenados por precio descendente: ");
        for (int i = 0; i < hierba.length; i++) {
            System.out.println(hierba[i] + " - " + origen[i] + " - " + precio[i]);
        }
    }
}
