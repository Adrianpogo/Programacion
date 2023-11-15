package ejercicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioListaCompraEnumerados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("  --->   M E N U   <---   ");

		ArrayList<String> compra = new ArrayList<String>();
		boolean continuar = true;
		while (continuar) {
			try {
				menu();
				MenuListaCompra opcion = MenuListaCompra.valor(sc.nextInt());

				switch (opcion) {
				case AÑADIR_ELEMENTO:
					añadirElemento(compra, sc);
					break;
				case BORRAR_ELEMENTO:
					borrarElemento(compra, sc);
					break;
				case MOSTRAR_COMPRA:
					mostarCompra(compra);
					break;
				case SALIR:
					System.out.println("¡Hasta la próxima!");
					continuar=false;
					break;
				default:
					break;
				}
					
			} catch (Exception e) {
				sc.nextLine();
				System.err.println("ERROR: no es una opción " + e);	
			}
		}

	}

	//Función para visulizar el menú
	public static void menu () {
		 System.out.println();
	        System.out.println("--------------------------------");
	        System.out.println("1. Añadir producto a la cesta");
	        System.out.println("2. Eliminar producto de la cesta");
	        System.out.println("3. Mostrar productos de la cesta");
	        System.out.println("4. Salir del programa");
	        System.out.println("--------------------------------");
	        System.out.println();
	        System.out.print("Seleccione una opción --> ");
	}

	// Función para añadir un elemento (pasado por pantalla) al ArrayList de la
	// compra
	public static void añadirElemento(ArrayList<String> compra, Scanner sc) {
		System.out.print("\nIntroduce el elemento que quieres AÑADIR: ");
		sc.nextLine();
		String elemento = sc.nextLine().toUpperCase();
		if (soloLetras(elemento)) {
			// Si el elemento que queremos añadir ya existe vuelve al menú, si no se añade
			// al ArrayList
			if (compra.contains(elemento)) {
				System.err.println("ERROR: Ya tienes este elemento --> Volviendo al menú...");
			} else {
				compra.add(elemento);
			}
		} else {
			System.err.println("ERROR: Debe contener solo letras --> Volviendo al menú...");
		}

	}

	// Función para borrar un elemento (pasado por pantalla) al ArrayList de la
	// compra
	public static void borrarElemento(ArrayList<String> compra, Scanner sc) {
		// Comprobación de si el ArrayList está vacio
		if (compra.isEmpty()) {
			System.out.println("\nLa lista de la compra está VACIA");
		} else {
			System.out.print("\nIntroduce el elemento que quieres ELIMINAR: ");
			sc.nextLine();
			String elemento = sc.nextLine().toUpperCase();
			// Comprobamos si tenemos el elemento para borrarlo, si lo tenemos procedemos a
			// borrarlo
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
			// Recorremos el ArrayList imprimiendo cada elemento en una linea precedido de
			// un índice
			for (int i = 1; i <= compra.size(); i++) {
				System.out.println(i + ". " + compra.get(i - 1));
			}
		}

	}

	// Función auxiliar para comprobar que un elemento recibido por pantalla
	// contiene solo letras
	public static boolean soloLetras(String elemento) {
		return elemento.matches("[a-zA-Z]+");
	}

}
