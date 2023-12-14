package ejerciciosT2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import ejerciciosT2.AgendaTelefonica.opcionesAgenda;

public class RegistroArticulo {

	public enum opcionesAgenda {
		AÑADIR_ARTICULO("1"), BUSCAR_ARTICULO("2"), ELIMINAR_ARTICULO("3"), ACTUALIZAR_ARTICULO("4"), SALIR("5");

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
				return AÑADIR_ARTICULO;
			case 2:
				return BUSCAR_ARTICULO;
			case 3:
				return ELIMINAR_ARTICULO;
			case 4:
				return ACTUALIZAR_ARTICULO;
			case 5:
				return SALIR;
			default:
				break;
			}
			return null;
		}
	}

	public static void main(String[] args) {

		HashMap<String, Integer> inventario = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);

		boolean finalizar = false;

		while (!finalizar) {

			try {
				mostrarMenu(inventario);

				opcionesAgenda opcion = opcionesAgenda.valor(sc.nextInt());
				sc.nextLine();

				switch (opcion) {
				case AÑADIR_ARTICULO:
					System.out.println("\n        >>>> AÑADIENDO ARTÍCULO <<<<");
					añadirArticulo(inventario, sc);
					break;

				case BUSCAR_ARTICULO:
					System.out.println("\n         >>>> BUSCANDO ARTÍCULO <<<<");
					buscarArticulo(inventario, sc);
					break;

				case ACTUALIZAR_ARTICULO:
					System.out.println("\n       >>>> ACTUALIZANDO ARTÍCULO <<<<");
					actualizarArticulo(inventario, sc);
					break;

				case ELIMINAR_ARTICULO:
					System.out.println("\n        >>>> ELIMINANDO ARTÍCULO <<<<");
					eliminarArticulo(inventario, sc);
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
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// Función para mostrar el menú
	public static void mostrarMenu(HashMap<String, Integer> inventario) {
		System.out.println("\n +-----------------------------------------+");
		System.out.println(" |             T I E N D A                 |");
		System.out.println(" +-----------------------------------------+");
		System.out.println(" | 1. Añadir un artículo                   |");
		System.out.println(" | 2. Buscar un artículo                   |");
		System.out.println(" | 3. Eliminar un artículo                 |");
		System.out.println(" | 4. Actualizar un artículo               |");
		System.out.println(" | 5. Salir de la tienda                   |");
		System.out.println(" +-----------------------------------------+");
		mostrarInventario(inventario);
		System.out.print("\n Escriba la opción que desea --> ");

	}

	// Función para añadir un artítculo
	public static void añadirArticulo(HashMap<String, Integer> inventario, Scanner sc) {
		String articulo;
		articulo = pedirPalabra(sc);
		// Se comprueba si existe o no ese artículo en el inventario
		// Si existe añadimos uno a su cantidad, si no existe lo añadimos con cantidad 1

		if (!inventario.containsKey(articulo)) {
			inventario.put(articulo, 1);
		} else {
			inventario.put(articulo, (inventario.get(articulo) + 1));
		}

	}

	// Función para buscar un artículo
	public static void buscarArticulo(HashMap<String, Integer> inventario, Scanner sc) {
		String articulo;
		articulo = pedirPalabra(sc);
		// Se comprueba si existe o no ese artículo en el inventario
		// Si existe devovlemos la cantidad del artículo
		if (inventario.containsKey(articulo)) {
			System.out.println("\n Para el artículo --> " + articulo + ", el stock es: " + inventario.get(articulo));
		} else {
			System.out.println("\n No existe este artículo en el inventario");
		}
	}

	// Función para actualizar un artículo
	public static void actualizarArticulo(HashMap<String, Integer> inventario, Scanner sc) {
		String articulo;
		String nuevoArticulo;
		int nuevaCantidad;
		articulo = pedirPalabra(sc);
		// Se comprueba si existe o no ese artículo en el inventario
		// Si existe solicitamos un nuevo nombre de artículo y su cantidad
		// Añadimos los nuevos datos y eliminamos el artículo anterior
		if (inventario.containsKey(articulo)) {
			System.out.println("\n Introduce los nuevos datos del artículo");
			nuevoArticulo = pedirPalabra(sc);
			System.out.print("\n Cantidad del artículo: ");
			nuevaCantidad = sc.nextInt();
			inventario.put(nuevoArticulo, nuevaCantidad);
			inventario.remove(articulo);
		} else {
			System.out.println("\n No existe este artículo en el inventario");
		}
	}

	// Función para eliminar un artículo
	public static void eliminarArticulo(HashMap<String, Integer> inventario, Scanner sc) {
		String articulo;
		articulo = pedirPalabra(sc);
		// Se comprueba si existe o no ese artículo en el inventario
		// Si existe borramos el artículo
		if (inventario.containsKey(articulo)) {
			inventario.remove(articulo);
		} else {
			System.out.println("\n No existe este artículo en el inventario");
		}
	}

	// Función para mostrar el inventario
	public static void mostrarInventario(HashMap<String, Integer> inventario) {
		System.out.println("\n +-----------------------------------------+");
		System.out.println(" |           I N V E N T A R I O           |");
		System.out.println(" +-----------------------------------------+");
		for (String clave : inventario.keySet()) {
			System.out.println(" " + clave + " : " + inventario.get(clave));
		}
		System.out.println(" +-----------------------------------------+");
	}

	// Función para pedir al usuario una palabra
	public static String pedirPalabra(Scanner sc) {
		String articulo;
		try {
			// Se pide una palabra al usuario, se comprueba si contiene solo caracteres
			System.out.print("\n Nombre del artículo: ");
			articulo = sc.nextLine().toUpperCase();
			if (esPalabra(articulo)) {
				return articulo;
			}
		} catch (Exception e) {
			System.out.println(" ERROR: " + e);
			sc.nextLine();
			return pedirPalabra(sc);
		}
		System.out.println("\n No has introducido una palabra correcta, prueba de nuevo");
		return pedirPalabra(sc);
	}

	// Función para comprobar que una palabra contiene solo letras
	public static boolean esPalabra(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			if (!Character.isLetter(cadena.charAt(i))) {
				return false;
			}
		}
		return true;

	}

}
