package ejerciciosT2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgendaTelefonica {

	public enum opcionesAgenda {
		AÑADIR_NUMERO("1"), BUSCAR_NUMERO("2"), ELIMINAR_NUMERO("3"), MOSTRAR_AGENDA("4"), SALIR("5");

		String valor;

		opcionesAgenda(String valor) {
			this.valor = valor;
		}

		public String getValor() {
			return valor;
		}

		public static opcionesAgenda valor(int opcion) {
			switch (opcion) {
			case 1:
				return AÑADIR_NUMERO;
			case 2:
				return BUSCAR_NUMERO;
			case 3:
				return ELIMINAR_NUMERO;
			case 4:
				return MOSTRAR_AGENDA;
			case 5:
				return SALIR;
			default:
				break;
			}
			return null;
		}
	}

	public static void main(String[] args) {

		HashMap<String, ArrayList<Integer>> agenda = new HashMap<String, ArrayList<Integer>>();
		Scanner sc = new Scanner(System.in);

		boolean finalizar = false;

		while (!finalizar) {
			try {
				mostrarMenu();
				opcionesAgenda opcion = opcionesAgenda.valor(sc.nextInt());
				sc.nextLine();

				switch (opcion) {
				case AÑADIR_NUMERO:
					añadirNumero(agenda, sc);
					break;

				case BUSCAR_NUMERO:
					buscarNumero(agenda, sc);
					break;

				case ELIMINAR_NUMERO:
					eliminarNumero(agenda, sc);
					break;

				case MOSTRAR_AGENDA:
					mostrarNumeros(agenda);
					break;

				case SALIR:
					System.out.println("\n ¡Hasta la próxima!");
					finalizar = true;
					break;

				default:
					break;
				}

			} catch (Exception e) {
				sc.nextLine();
				System.out.println(" ERROR: no es una opción " + e);
			}

		}
	}

	// Función para mostrar el menú
	public static void mostrarMenu() {
		System.out.println();
		System.out.println(" +-----------------------------------------+");
		System.out.println(" | 1. Añadir un nuevo número de teléfono   |");
		System.out.println(" | 2. Buscar un número de teléfono         |");
		System.out.println(" | 3. Eliminar un número de teléfono       |");
		System.out.println(" | 4. Mostrar agenda                       |");
		System.out.println(" | 5. Salir de la agenda                   |");
		System.out.println(" +-----------------------------------------+");
		System.out.print("\n Escriba la opción que desea --> ");

	}

	// Función para añadir un nuevo número
	public static void añadirNumero(HashMap<String, ArrayList<Integer>> agenda, Scanner sc) {

		// Pedimos al usuario que introduzca el número de telefono y el usuario hasta
		// que sean correctos

		int numero = pedirNumero(sc);
		sc.nextLine();
		System.out.print("\n Introduce el nombre del titular --> ");
		String titular = sc.nextLine().toUpperCase();

		if (!yaExiste(agenda, numero)) {
			// Comprueba si el usuario es nuevo o ya existe
			// Si es nuevo se añade con su nueva lista de numeros de telefonos
			// Si ya esiste se añade el nuevo numero
			if (agenda.containsKey(titular)) {
				agenda.get(titular).add(numero);
				System.out.println("\n Operación realizada correctamente");

			} else {
				ArrayList<Integer> nuevoUsuario = new ArrayList<Integer>();
				nuevoUsuario.add(numero);
				agenda.put(titular, nuevoUsuario);
				System.out.println("\n Operación realizada correctamente");
			}

		} else {
			System.out.println("\n Ya existe este número de telefono");
		}

	}

	// Función para buscar un número
	public static void buscarNumero(HashMap<String, ArrayList<Integer>> agenda, Scanner sc) {
		// Comprobamos si la agenda está vacia para realizar o no la operación
		if (agenda.isEmpty()) {
			System.out.println(" La agenda está vacia, agrege número primero ");
		} else {

			// Pedimos al usuario que introduzca el número de telefono para buscar hasta que
			// tenga el formato correcto

			int numero = pedirNumero(sc);
			// Comprobamos que exsiste el número recorriendo el diccionario
			// Si existe devolvemos el usuario al que corresponde el número

			for (String clave : agenda.keySet()) {
				if (agenda.get(clave).contains(numero)) {
					System.out.println(" El número: " + numero + " corresponde al usuario --> " + clave);

				} else {
					System.out.println(" Ningún usuario posee el número marcado");
				}
			}
		}

	}

	// Función para eliminar un número
	public static void eliminarNumero(HashMap<String, ArrayList<Integer>> agenda, Scanner sc) {

		// Comprobamos si la agenda está vacia para realizar o no la operación
		if (agenda.isEmpty()) {
			System.out.println(" La agenda está vacia, agrege número primero");
		} else {

			// Pedimos al usuario que introduzca el número de telefono para borrar hasta que
			// tenga el formato correcto

			int numero = pedirNumero(sc);

			// Recorremos el diccionario, cuando encontramos el número de telefono lo
			// eliminamos
			// Si el número erá el último número del usuario, este también se borrará
			for (String clave : agenda.keySet()) {

				if (agenda.get(clave).contains(numero)) {
					agenda.get(clave).remove(agenda.get(clave).indexOf(numero));
					// Si la clave no tiene valores podemos borrar la clave directamente
					if (agenda.get(clave).isEmpty()) {
						agenda.remove(clave);
					}
					System.out.println("\n Operación realizada correctamente");

				} else {
					System.out.println("\n Ningún usuario posee el número marcado");

				}
			}

		}

	}

	// Función para mostrar los número de un usuario
	public static void mostrarNumeros(HashMap<String, ArrayList<Integer>> agenda) {
		for (String clave : agenda.keySet()) {
			System.out.println(" Usuario: " + clave + " --> " + agenda.get(clave));
		}
	}

	// Función para pedir un número al usuario
	public static int pedirNumero(Scanner sc) {
		boolean correcto = false;
		do {
			try {
				System.out.print("\n Introduce el número para operar --> ");
				int numero = sc.nextInt();
				if (numero < 1000000000 && numero > 99999999) {
					return numero;

				} else {
					System.out.println(" El número introducido está fuera de rangos, vuelva a intentarlo ");
					return pedirNumero(sc);
				}

			} catch (InputMismatchException e) {
				System.out.println(" ERROR: tipo de dato incorrecto " + e);
				sc.nextLine();
				return pedirNumero(sc);
			}
		} while (!correcto);
	}

	// Función para comprobar que un número ya existe
	public static boolean yaExiste(HashMap<String, ArrayList<Integer>> agenda, int numero) {
		for (String clave : agenda.keySet()) {
			if (agenda.get(clave).contains(numero)) {
				return true;
			}
		}
		return false;
	}

}
