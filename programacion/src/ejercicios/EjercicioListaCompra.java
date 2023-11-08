package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioListaCompra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println();
		System.out.println("     --->   M E N U   <---       ");
		
		ArrayList<String> compra = new ArrayList<String>();
		
		while (true) {
			int opcion = escogerOpcion(sc);
			
			if (opcion == 1) {
				añadirElemento(compra,sc);
			}else if (opcion == 2) {
				borrarElemento(compra,sc);
			}else if (opcion == 3) {
				mostarCompra(compra);
			}else {
				System.out.println("\nGracias por su visita, hasta la próxima !");
				System.out.println("-----------------------------------------");
				break;
			}
		}
	}

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

		// Añadir excepción para entrada del usuario
		int opcion = sc.nextInt();
		if (opcion >= 1 && opcion <= 4) {
			return opcion;
		}else {
			System.err.println("ERROR: La opción debe ser un número entre 1 y 4");
			return escogerOpcion(sc);
		}
	}

	public static void añadirElemento (ArrayList<String> compra, Scanner sc) {
		System.out.print("\nIntroduce el elemento que quieres AÑADIR: ");
		sc.nextLine();
		String elemento = sc.nextLine().toUpperCase();
		
		if (compra.contains(elemento)) {
			System.err.println("Ya tienes este elemento");
		}else {
			compra.add(elemento);
		}
	}
	
	public static void borrarElemento (ArrayList<String> compra, Scanner sc) {
		if (compra.isEmpty()) {
			System.out.println("\nLa lista de la compra está VACIA");
		}else {
			System.out.print("\nIntroduce el elemento que quieres ELIMINAR: ");
			sc.nextLine();
			String elemento = sc.nextLine().toUpperCase();
			
			if (!compra.contains(elemento)) {
				System.err.println("No tienes este elemento");
			}else {
				compra.remove(elemento);
			}
		}
		
	}
	
	public static void mostarCompra(ArrayList<String> compra) {
		if(compra.isEmpty()) {
			System.out.println("\nLa lista de la compra está VACIA");
		}else {
			System.out.println("\nSu lista de la compra hasta el momento:");
			System.out.println();
			for(int i = 1; i<=compra.size(); i++) {
				System.out.println(i +". " + compra.get(i-1));
			}
		}
		
		
	}
}
