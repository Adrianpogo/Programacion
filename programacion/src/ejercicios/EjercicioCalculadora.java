package ejercicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("     --->   M E N U   <---       ");

		ArrayList<Integer> calculadora = new ArrayList<Integer>();

		// Bucle principal del juego
		while (true) {
			int opcion = escogerOpcion(sc);
			if (opcion == 1) {
				añadirNumero(calculadora, sc);
			} else if (opcion == 2) {
				mostrarCalculadora(calculadora);
			} else if (opcion == 3) {
				
				int operacion = escogerOperacion(sc);
				if (operacion == 1) {
					sumaNumeros(calculadora);
				} else if (operacion == 2) {
					restaNumeros(calculadora);
				} else if (operacion == 3) {
					multiplicacionNumeros(calculadora);
				} else if (operacion == 4) {
					divisionNumeros(calculadora);
				} else if (operacion == 5) {
					exponenteNumeros(calculadora);
				} else {
					System.out.println("\nVolviendo al menú ...");
				}
				
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
		System.out.println("1. Añadir número a la calculadora");
		System.out.println("2. Mostrar números de la calculadora");
		System.out.println("3. Escoger operación");
		System.out.println("4. Salir del programa");
		System.out.println("--------------------------------");
		System.out.println();
		System.out.print("Seleccione una opción --> ");

		// Try-catch para comprobar que se ingresa un número, si no es así vuelve a
		// pedir una opción
		try {
			int opcion = sc.nextInt();
			// Comprueba que la opción es un número entre 1 y 4, si no es así vuelve a pedir
			// una opción
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

	// Función para escoger la opción del menú, devuelve un valor (la opción)
	public static int escogerOperacion(Scanner sc) {
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("1. Sumar números");
		System.out.println("2. Restar números");
		System.out.println("3. Multiplicar números");
		System.out.println("4. Dividir números");
		System.out.println("5. Exponente de los números");
		System.out.println("6. Salir del programa");
		System.out.println("--------------------------------");
		System.out.println();
		System.out.print("Seleccione una operación --> ");

		// Try-catch para comprobar que se ingresa un número, si no es así vuelve a
		// pedir una opción
		try {
			int opcion = sc.nextInt();
			// Comprueba que la opción es un número entre 1 y 4, si no es así vuelve a pedir
			// una opción
			if (opcion >= 1 && opcion <= 6) {
				return opcion;
			} else {
				System.err.println("ERROR: La opción debe ser un número entre 1 y 6");
				return escogerOperacion(sc);
			}
		} catch (InputMismatchException e) {
			sc.nextLine();
			System.err.println("ERROR: Por favor, ingrese un número entero. " + e);
			return escogerOperacion(sc);
		}
	}

	// Función para mostrar los números de la calculdora
	public static void mostrarCalculadora(ArrayList<Integer> calculadora) {
		// Comprobación de si el ArrayList está vacio
    	if (calculadora.isEmpty()) {
            System.out.println("\nLa lista de la calculadora está VACIA");
        } else {
            System.out.println("\nSu lista de la calculadora hasta el momento:");
            System.out.println();
            // Recorremos el ArrayList imprimiendo cada elemento en una linea precedido de un índice
            for (int i = 1; i <= calculadora.size(); i++) {
                System.out.print(calculadora.get(i - 1) + " , ");
            }
        }
	}

	// Función para añadir un número a la calculadora
	public static void añadirNumero(ArrayList<Integer> calculadora, Scanner sc) {
        System.out.print("\nIntroduce el número que quieres AÑADIR: ");

        try {
        	int numero = sc.nextInt();
        	calculadora.add(numero);
		} catch (InputMismatchException e) {
			sc.nextLine(); 
			System.out.println("ERROR: Solo puede ingresar números" + e);
		}
		
	}

	// Función para sumar los números de la calculadora
	public static void sumaNumeros(ArrayList<Integer> calculadora) {

	}

	// Función para hacer el exponente los números de la calculadora
	public static void exponenteNumeros(ArrayList<Integer> calculadora) {

	}

	// Función para dividir los números de la calculadora
	public static void divisionNumeros(ArrayList<Integer> calculadora) {

	}

	// Función para multiplicar los números de la calculadora
	public static void multiplicacionNumeros(ArrayList<Integer> calculadora) {

	}

	// Función para restar los números de la calculadora
	public static void restaNumeros(ArrayList<Integer> calculadora) {

	}

}
