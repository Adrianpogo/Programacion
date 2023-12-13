package ejerciciosT1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EjercicioListaCompra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("     --->   M E N U   <---       ");

        ArrayList<String> compra = new ArrayList<String>();

        // Bucle principal del juego
        while (true) {
            int opcion = escogerOpcion(sc);
            if (opcion == 1) {
                añadirElemento(compra, sc);
            } else if (opcion == 2) {
                borrarElemento(compra, sc);
            } else if (opcion == 3) {
                mostarCompra(compra);
            } else {
                System.out.println("\nGracias por su visita, hasta la próxima !");
                System.out.println("-----------------------------------------");
                break;
            }
        }
    }

    // Función para escoger la opción del menú, devuelve un valor (la opción)
    public static int escogerOpcion(Scanner sc) {
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("1. Añadir producto a la cesta");
        System.out.println("2. Eliminar producto de la cesta");
        System.out.println("3. Mostrar productos de la cesta");
        System.out.println("4. Salir del programa");
        System.out.println("--------------------------------");
        System.out.println();
        System.out.print("Seleccione una opción --> ");

        // Try-catch para comprobar que se ingresa un número, si no es así vuelve a pedir una opción
        try {
            int opcion = sc.nextInt();
            // Comprueba que la opción es un número entre 1 y 4, si no es así vuelve a pedir una opción
            if (opcion >= 1 && opcion <= 4) {
                return opcion;
            } else {
                System.err.println("ERROR: La opción debe ser un número entre 1 y 4");
                return escogerOpcion(sc);
            }
        } catch (InputMismatchException e) {
            sc.nextLine(); 
            System.err.println("ERROR: Por favor, ingrese un número entero. " + e);
            return escogerOpcion(sc);
        }
    }

    // Función para añadir un elemento (pasado por pantalla) al ArrayList de la compra
    public static void añadirElemento(ArrayList<String> compra, Scanner sc) {
        System.out.print("\nIntroduce el elemento que quieres AÑADIR: ");
        sc.nextLine();
        String elemento = sc.nextLine().toUpperCase();
        if(soloLetras(elemento)) {
        	 // Si el elemento que queremos añadir ya existe vuelve al menú, si no se añade al ArrayList
            if (compra.contains(elemento)) {
                System.err.println("ERROR: Ya tienes este elemento --> Volviendo al menú...");
            } else {
                compra.add(elemento);
            }
        } else {
        	System.err.println("ERROR: Debe contener solo letras --> Volviendo al menú...");
        }
       
    }

	// Función para borrar un elemento (pasado por pantalla) al ArrayList de la compra
    public static void borrarElemento(ArrayList<String> compra, Scanner sc) {
        // Comprobación de si el ArrayList está vacio
    	if (compra.isEmpty()) {
            System.out.println("\nLa lista de la compra está VACIA");
        } else {
            System.out.print("\nIntroduce el elemento que quieres ELIMINAR: ");
            sc.nextLine();
            String elemento = sc.nextLine().toUpperCase();
            // Comprobamos si tenemos el elemento para borrarlo, si lo tenemos procedemos a borrarlo
            if (!compra.contains(elemento)) {
                System.err.println("No tienes este elemento");
            } else {
                compra.remove(elemento);
            }
        }

    }

    // Función para mostrar el ArrayList de la compra
    public static void mostarCompra(ArrayList<String> compra) {
    	// Comprobación de si el ArrayList está vacio
    	if (compra.isEmpty()) {
            System.out.println("\nLa lista de la compra está VACIA");
        } else {
            System.out.println("\nSu lista de la compra hasta el momento:");
            System.out.println();
            // Recorremos el ArrayList imprimiendo cada elemento en una linea precedido de un índice
            for (int i = 1; i <= compra.size(); i++) {
                System.out.println(i + ". " + compra.get(i - 1));
            }
        }

    }
    
    // Función auxiliar para comprobar que un elemento recibido por pantalla contiene solo letras
    public static boolean soloLetras(String elemento) {
        return elemento.matches("[a-zA-Z]+");
	}
}
