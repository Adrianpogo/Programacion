package ejerciciosT2;

import java.util.HashMap;
import java.util.Scanner;

public class PalabrasMalsonantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> filtroPalabras = new HashMap<String, String>();
		generarFiltro(filtroPalabras);

		String[] palabras;
		int contador;

		do {
			palabras = pedirFrase(sc).toLowerCase().split(" ");
			contador = sustituirPalabra(filtroPalabras, palabras);
			System.out.println("\nNueva frase: ");
			imprimirFrase(palabras);
		} while (!esBaneado(contador));
		System.out.println("Ha sido usted baneado (más de 5 palabras malsonantes)");

	}

	// Función para pedir una frase al usuario
	public static String pedirFrase(Scanner sc) {
		try {
			System.out.println("\n___________________________________________");
			System.out.print("Frase: ");
			String frase = sc.nextLine();
			return frase;
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
			sc.nextLine();
			return pedirFrase(sc);
		}
	}

	// Función para sustituir una palabra malsonante, devuelve un contador con el numero de palabras malsonantes
	public static int sustituirPalabra(HashMap<String, String> filtroPalabras, String[] palabras) {
		int contador = 0 ;
		for (int i = 0; i<palabras.length; i++ ) {
			if (filtroPalabras.containsKey(palabras[i])) {
				palabras[i]= filtroPalabras.get(palabras[i]);
				contador ++;
			}
		}
		return contador;
	}

	// Función para imprimir la nueva frase
	public static void imprimirFrase(String[] palabras) {
		for (String palabra : palabras) {
			System.out.print(palabra + " ");
		}

	}
	
	// Función para saber si se bane a alguien
	public static boolean esBaneado (int contador) {
		if(contador < 5) {
			return false;
		}
		return true;
	}

	// Función que recoge las palabras malsonantes
	public static void generarFiltro(HashMap<String, String> filtroPalabras) {
		filtroPalabras.put("mierda", "*****");
		filtroPalabras.put("joder", "*****");
		filtroPalabras.put("coño", "*****");
		filtroPalabras.put("chocho", "*****");
		filtroPalabras.put("polla", "*****");
		filtroPalabras.put("pene", "*****");
		filtroPalabras.put("cojones", "*****");
		filtroPalabras.put("follar", "*****");
		filtroPalabras.put("sexo", "*****");
		filtroPalabras.put("anormal", "*****");
		filtroPalabras.put("gilipollas", "*****");
		filtroPalabras.put("cabron", "*****");
		filtroPalabras.put("cabrona", "*****");
		filtroPalabras.put("cachondo", "*****");
		filtroPalabras.put("cachonda", "*****");
		filtroPalabras.put("caca", "*****");
		filtroPalabras.put("culo", "*****");
		filtroPalabras.put("cagon", "*****");
		filtroPalabras.put("capullo", "*****");
		filtroPalabras.put("capulla", "*****");
		filtroPalabras.put("chingar", "*****");
		filtroPalabras.put("encular", "*****");
		filtroPalabras.put("facha", "*****");
		filtroPalabras.put("friki", "*****");
		filtroPalabras.put("fulano", "*****");
		filtroPalabras.put("fulana", "*****");
		filtroPalabras.put("gañan", "*****");
		filtroPalabras.put("gilipuertas", "*****");
		filtroPalabras.put("jodido", "*****");
		filtroPalabras.put("jodida", "*****");
		filtroPalabras.put("loco", "*****");
		filtroPalabras.put("loca", "*****");
		filtroPalabras.put("malparido", "*****");
		filtroPalabras.put("mamon", "*****");
		filtroPalabras.put("mamona", "*****");
		filtroPalabras.put("maricon", "*****");
		filtroPalabras.put("matar", "*****");
		filtroPalabras.put("negro", "*****");
		filtroPalabras.put("paja", "*****");
		filtroPalabras.put("payaso", "*****");
		filtroPalabras.put("payasa", "*****");
		filtroPalabras.put("puta", "*****");
	}
}
