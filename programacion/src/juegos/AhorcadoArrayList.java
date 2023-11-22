package juegos;

import java.util.ArrayList;
import java.util.Scanner;

public class AhorcadoArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Lista con las letras de la palabra seleccionada
		ArrayList<Character> palabraAleatoria = generarPalabra(sc);
		// Lista con las letras que introduce el usuario
		ArrayList<Character> listaCaracteres = new ArrayList<Character>();
		// Lista para mostrar el progreso de la palabra a adivinar
		ArrayList<Character> palabraAdivinada = new ArrayList<Character>();
		rellenarPalabraAdivinada(palabraAdivinada, palabraAleatoria.size());

		int vidas = 6;
		boolean acierto = false;

		// Mientras que tengamos vidas se ejecuta el juego, a no ser que la palabra sea
		// adivinada
		while (vidas != 0) {
			// Mostramos el progreso de la palabra y nuestro alfabeto hasta el momento
			System.out.print("\nLa palabra para adivinar es --> ");
			imprimirPalabra(palabraAdivinada);
			System.out.print(" (" + palabraAdivinada.size() + ") caracteres");
			System.out.println("\nTus letras hasta ahora son: " + listaCaracteres.toString());
			System.out.println("Te quedan " + vidas + " vidas");

			// Pedimos una letra y comprobamos si la palabra la contiene, además comprobamos
			// si la palabra está completa
			System.out.print("\nIntroduce una letra --> ");
			char letra = pedirLetra(listaCaracteres, sc);
			if (comprobarLetra(palabraAleatoria, palabraAdivinada, letra)) {
				if (esIgual(palabraAdivinada)) {
					System.out.print("\n¡ENHORABUENA, HAS GANADO! --> La palabra oculta era: ");
					imprimirPalabra(palabraAdivinada);
					break;
				}
			} else {
				System.out.println("No contiene esta letra, has perdido una vida...");
				vidas--;
			}
		}
		
		if (vidas==0) {
			System.out.print("\n¡TE HAS QUEDADO SIN VIDAS! --> La palabra oculta era: ");
			imprimirPalabra(palabraAdivinada);
		}
		
	}

	// Función para pedir una palabra por pantalla
	public static String pedirPalabra(Scanner sc) {
		String palabra;
		
		try {
			palabra = sc.nextLine();
			while(!soloLetras(palabra)) {
				System.err.println("La palabra solo debe contener letras...");
				System.out.print("Vuelva a intentarlo -->");
				return pedirPalabra(sc);
			}
			return palabra;
			
		} catch (Exception e) {
			sc.nextLine();
			System.err.println("ERROR: " + e);
			return pedirPalabra(sc);
		}
	}
	
	// Función para comprobar que una palabra solo se compone de letras
	public static boolean soloLetras (String palabra) {
		for (int i = 0 ; i < palabra.length(); i++) {
			if (!Character.isLetter(palabra.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	
	// Función para escoger aleatoriamente una palabra de una lista de 4 palabras
	// aleatorias. Para pedir la palabra llama a la función pedirPalabra
	// Devuelve la palabra como un ArrayList de caracteres
	public static ArrayList<Character> generarPalabra(Scanner sc) {
		ArrayList<String> listaPalabras = new ArrayList<String>();
		for (int i = 0; i < 4; i++) {
			System.out.print("Introduce una palabra --> ");
			listaPalabras.add(pedirPalabra(sc));
		}
		ArrayList<Character> palabraAleatoria = new ArrayList<Character>();
		String palabra = listaPalabras.get((int) (Math.random() * 4));
		for (int i = 0; i < palabra.length(); i++) {
			palabraAleatoria.add(palabra.charAt(i));
		}
		return palabraAleatoria;
	}

	// Función para auxiliar imprimir la palabra cuando sea necesario
	public static void imprimirPalabra(ArrayList<Character> palabraAdivinada) {
		for (char c : palabraAdivinada) {
			System.out.print(c);
		}
	}

	// Función para inicializar el valor de los caracteres de la lista como "_"
	public static void rellenarPalabraAdivinada(ArrayList<Character> palabraAdivinada, int length) {
		for (int i = 0; i < length; i++) {
			palabraAdivinada.add('_');
		}
	}

	// Función para introducir una letra, comprueba si es o no repetida, si no lo es
	// la guarda en la lista de letras
	public static char pedirLetra(ArrayList<Character> listaCaracteres, Scanner sc) {
		char letra;
		String entrada = sc.nextLine().toLowerCase();

		// Comprobamos que lo que recibimos es un solo caracter
		// que el caracter sea una letra y que además no sea repetida
		if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
			letra = entrada.charAt(0);
			if (!listaCaracteres.contains(letra)) {
				listaCaracteres.add(letra);
				return letra;
			} else {
				System.err.print("\nLetra repetita, prueba con otra -->");
				return pedirLetra(listaCaracteres, sc);
			}

		} else {
			System.err.print("\nDebe ingresar solo una letra -->");
			return pedirLetra(listaCaracteres, sc);
		}
	}

	// Función para comprobar si una letra está contenida en la palabra oculta
	// Si contiene la letra, la añadimos en la lista de la palabra del usuario
	// Y sustituimos su valor en el ArrayList de la palabraAdivinada
	public static boolean comprobarLetra(ArrayList<Character> palabraAleatoria, ArrayList<Character> palabraAdivinada,
			char letra) {
		boolean acierto = false;
		for (int i = 0; i < palabraAleatoria.size(); i++) {
			if (palabraAleatoria.get(i).equals(letra)) {
				palabraAdivinada.set(i, letra);
				acierto = true;
			}
		}
		return acierto;
	}

	// Comprobar si la palabra ha sido adivinada (si no contiene ningún "_")
	public static boolean esIgual(ArrayList<Character> palabraAdivinada) {
		return !palabraAdivinada.contains('_');
	}
}
