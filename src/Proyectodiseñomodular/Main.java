package Proyectodiseñomodular;

import java.util.Scanner;

public class Main {
    public static String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
    public static String[] origen = { "Mexico", "Andorra", "Marrueco", "Palestina" };
    public static double[] precio = { 1.70, 4.20, 2.47, 1.33 };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre, lugar;
        double cantidad;
        int opcion;

        while (true) {
            System.out.println("Buenos dias! Que quieres hacer hoy?");
            System.out.println("1. Buscar por nombre");
            System.out.println("2. Buscar por origen");
            System.out.println("3. Ordenar por precio de menor a mayor");
            System.out.println("4. Ordenar por precio de mayor a menor");
            System.out.println("5. Seleccionar productos para comprar");
            System.out.println("6. Eliminar elemento del carrito");
            System.out.println("7. Finalizar compra");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre a buscar: ");
                    nombre = scanner.nextLine();
                    buscar.buscarPorNombre(nombre);
                    break;
                case 2:
                    System.out.print("Introduce el origen a buscar: ");
                    lugar = scanner.nextLine();
                    buscar.buscarPorOrigen(lugar);
                    break;
                case 3:
                    System.out.println("Ordenando por precio de menor a mayor...");
                    ordenar.ordenarPorPrecioAscendente();
                    break;
                case 4:
                    System.out.println("Ordenando por precio de mayor a menor...");
                    ordenar.ordenarPorPrecioDescendente();
                    break;
                case 5:
                    System.out.println("Selecciona productos para comprar...");
                    // Codigo para seleccionar productos
                    break;
                case 6:
                    System.out.println("Eliminando elemento del carrito...");
                    // Codigo para eliminar elemento del carrito
                    break;
                case 7:
                    System.out.println("Finalizando compra...");
                    // Codigo para finalizar la compra y que salga el total de la compra
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }
        }
    }
}