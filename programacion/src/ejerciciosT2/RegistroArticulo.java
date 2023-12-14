package ejerciciosT2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import ejerciciosT2.AgendaTelefonica.opcionesAgenda;

public class RegistroArticulo {

	public enum opcionesAgenda {
		AÑADIR_ARTICULO("1"), BUSCAR_ARTICULO("2"), ACTUALIZAR_ARTICULO("3"), ELIMINAR_ARTICULO("4"),SALIR("5");

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
				return ACTUALIZAR_ARTICULO;
			case 4:
				return ELIMINAR_ARTICULO;
			case 5 :
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
					añadirArticulo(inventario, sc);
					break;

				case BUSCAR_ARTICULO:
					buscarArticulo(inventario, sc);
					break;

				case ACTUALIZAR_ARTICULO:
					actualizarArticulo(inventario, sc);
					break;

				case ELIMINAR_ARTICULO:
					eliminarArticulo(inventario, sc);
					break;
					

				case SALIR:
					System.out.println("\n¡Hasta la próxima!");
					finalizar = true;
					break;

				default:
					break;
				}

			} catch (Exception e) {
				sc.nextLine();
				System.out.println("ERROR: no es una opción " + e);
			}

		}
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// Función para mostrar el menú
	public static void mostrarMenu(HashMap<String, Integer> inventario) {
		System.out.println("\n+-----------------------------------------+");
		System.out.println("|             T I E N D A                 |");
		System.out.println("+-----------------------------------------+");
		System.out.println("| 1. Añadir un artículo                   |");
		System.out.println("| 2. Buscar un artículo                   |");
		System.out.println("| 3. Eliminar un artículo                 |");
		System.out.println("| 4. Actualizar un artículo               |");
		System.out.println("| 5. Salir de la tienda                   |");
		System.out.println("+-----------------------------------------+");
		mostrarInventario(inventario);
		System.out.print("\nEscriba la opción que desea --> ");

	}
	
	// Función para añadir un artítculo
	public static void añadirArticulo (HashMap<String, Integer> inventario, Scanner sc) {
		String articulo;
		boolean valido = false;
		while (!valido) {
			
			try {
				// Se pide una palabra al usuario, se comprueba si contiene solo caracteres
				// Si es así se comprueba si existe o no ese artículo en el inventario
				// Si existe añadimos uno a su cantidad, si no existe lo añadimos con cantidad 1
				
				System.out.println("\nNombre del artículo:");
				articulo = sc.nextLine().toUpperCase();
				if(esPalabra(articulo)) {
					if(!inventario.containsKey(articulo)) {
						inventario.put(articulo, 1);
					}else {
						inventario.put(articulo, (inventario.get(articulo)+1));
					}
					valido=true;
				}else {
					System.out.println("\nNo has introducido una palabra correcta, prueba de nuevo");
					valido=false;
					
				}
			} catch (Exception e) {
				System.out.println("ERROR: " + e);
				valido=false;
			}
		}
	}
	
	// Función para buscar un artículo
	public static void buscarArticulo (HashMap<String, Integer> inventario, Scanner sc) {
		
	}
	
	// Función para actualizar un artículo
	public static void actualizarArticulo (HashMap<String, Integer> inventario, Scanner sc) {
		
	}
	
	// Función para eliminar un artículo
	public static void eliminarArticulo (HashMap<String, Integer> inventario, Scanner sc) {
		
	}
	
	// Función para mostrar el inventario
	public static void mostrarInventario (HashMap<String, Integer> inventario) {
		System.out.println("\n+-----------------------------------------+");
		System.out.println("|           I N V E N T A R I O           |");
		System.out.println("+-----------------------------------------+");
		for (String clave : inventario.keySet()) {
			System.out.println(clave + " : " + inventario.get(clave) ) ;
		}
		System.out.println("+-----------------------------------------+");
	}
	
	// Función para comprobar que una palabra contiene solo letras
	public static boolean esPalabra (String cadena) {
		for (int i = 0 ; i < cadena.length(); i++) {
			if (!Character.isLetter(cadena.charAt(i))) {
				return false;
			}
		}
		return true;
		
	}
	
	
}
