package ejerciciosT1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("     --->   M E N U   <---       ");

		ArrayList<Integer> calculadora = new ArrayList<Integer>();
		boolean continuar = true;

		// Bucle principal del juego
		while (continuar) {
			int opcion = escogerOpcion(sc);
			
			switch (opcion) {
			case 1:
				añadirNumero(calculadora, sc);
				break;
				
			case 2:
				mostrarCalculadora(calculadora);
				break;
				
			case 3:
				int operacion = escogerOperacion(sc);
				switch(operacion) {
				case 1:
					sumaNumeros(calculadora);
					break;
					
				case 2:
					restaNumeros(calculadora);
					break;
					
				case 3:
					multiplicacionNumeros(calculadora);
					break;
					
				case 4:
					divisionNumeros(calculadora);
					break;
					
				case 5:
					exponenteNumeros(calculadora);
					break;
					
				default:
					System.out.println("\nVolviendo al menú ...");
				}
				break;
				
			default:
				System.out.println("\nGracias por su visita, hasta la próxima !");
				System.out.println("-----------------------------------------");
				continuar=false;
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
			System.err.println("ERROR: Por favor, ingrese un número. " + e);
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
		System.out.println("6. Volver al menú");
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
			// Recorremos el ArrayList imprimiendo cada elemento en una linea precedido de
			// un índice
			for (int i = 1; i <= calculadora.size(); i++) {
				System.out.print(calculadora.get(i - 1) + " | ");
			}
		}
	}

	// Función para añadir un número a la calculadora
	public static void añadirNumero(ArrayList<Integer> calculadora, Scanner sc) {
		System.out.print("\nIntroduce el número que quieres AÑADIR: ");

		// Comprobamos que se introduce un número entero y se añade a la calculadora
		try {
			int numero = sc.nextInt();
			calculadora.add(numero);
		} catch (InputMismatchException e) {
			sc.nextLine();
			System.err.println("ERROR: Solo puede ingresar números enteros " + e);
		}

	}

	// Función para sumar los números de la calculadora
	public static void sumaNumeros(ArrayList<Integer> calculadora) {
		// Si no tenemos elementos en la calculadora no podemos realizar la operación
		if (!calculadora.isEmpty()) {
			int resultado = calculadora.get(0);
			for (int i = 1; i < calculadora.size(); i++) {
				resultado += calculadora.get(i);
			}
			calculadora.clear();
			System.out.println("El resultado de la suma es: " + resultado);

		} else {
			System.out.println("No se puede hacer la operacion --> Calculadora VACIA");
		}

	}

	// Función para restar los números de la calculadora
	public static void restaNumeros(ArrayList<Integer> calculadora) {
		// Si no tenemos elementos en la calculadora podemos realizar la operación
		if (!calculadora.isEmpty()) {
			int resultado = calculadora.get(0);
			for (int i = 1; i < calculadora.size(); i++) {
				resultado -= calculadora.get(i);
			}
			calculadora.clear();
			System.out.println("El resultado de la resta es: " + resultado);

		} else {
			System.out.println("No se puede hacer la operacion --> Calculadora VACIA");
		}

	}

	// Función para multiplicar los números de la calculadora
	public static void multiplicacionNumeros(ArrayList<Integer> calculadora) {
		// Si no tenemos elementos en la calculadora o solo tenemos 1 no podemos realizar la operación
		if (calculadora.size() == 1 ) {
			System.out.println("¡Solo hay un número, ingrese al menos otro número mas!");
			
		} else if (!calculadora.isEmpty()) {
			long resultado = calculadora.get(0);
			for (int i = 1; i < calculadora.size(); i++) {
				resultado *= (long)calculadora.get(i);
			}
			calculadora.clear();
			System.out.println("El resultado de la multiplicación es: " + resultado);
		} else {
			System.out.println("No se puede hacer la operacion --> Calculadora VACIA");
		}
	}

	// Función para dividir los números de la calculadora
	public static void divisionNumeros(ArrayList<Integer> calculadora) {
		// Si no tenemos elementos en la calculadora o solo tenemos 1 no podemos realizar la operación
		if (calculadora.size() == 1 ) {
			System.out.println("¡Solo hay un número, ingrese al menos otro número mas!");
			
		} else if (!calculadora.isEmpty()) {
			double resultado = calculadora.get(0);
			for(int i = 1; i<calculadora.size();i++) {
				if(calculadora.get(i)==0) {
					resultado=-1;
					break;
				
				}else {
					resultado /= calculadora.get(i);
				}
			}
			calculadora.clear();
			if(resultado==-1) {
				System.out.println("ERROR: Hay una división entre 0");
			}else {
				System.out.println("El resultado de la división es: " + resultado);
			}
		} else {
			System.out.println("No se puede hacer la operacion --> Calculadora VACIA");
		}

	}

	// Función para hacer el exponente los números de la calculadora
	public static void exponenteNumeros(ArrayList<Integer> calculadora) {
		// Si no tenemos elementos en la calculadora o solo tenemos 1 no podemos realizar la operación
		if (calculadora.size() == 1) {
			System.out.println("¡Solo hay un número, ingrese al menos otro número mas!");
			
		} else if (!calculadora.isEmpty()) {
			double resultado = calculadora.get(0);
			for(int i = 1 ; i < calculadora.size();i++) {
				resultado = Math.pow(resultado, (double)calculadora.get(i));
			}
			calculadora.clear();
			System.out.println("El resultado de los exponentes es: " + resultado);
		} else {
			System.out.println("No se puede hacer la operacion --> Calculadora VACIA");
		}
	}
}
