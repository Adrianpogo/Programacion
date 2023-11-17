package juegos;

import java.util.ArrayList;
import java.util.Scanner;

public class AhorcadoArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Lista con las letras de la palabra seleccionada
		ArrayList<Character> palabraAleatoria = generarPalabra(sc);
		// Lista con las letras que introduce el usuario
		ArrayList<Character> listaCaracteres = new ArrayList<Character>();
		// Array para mostrar el progreso de la palabra a adivinar
		char[]palabraAdivinada = new char[palabraAleatoria.size()];
		rellenarPalabraAdivinada(palabraAdivinada);
		
		int vidas = 6;
		boolean acierto = false;
		
		// Mientras que tengamos vidas se ejecuta el juego, a no ser que la palabra sea adivinada
		while(vidas != 0) {
			// Mostramos el progreso de la palabra y nuestro alfabeto hasta el momento
			System.out.print("\nLa palabra para adivinar es --> " + String.valueOf(palabraAdivinada));
			System.out.print( " (" + palabraAdivinada.length + ") caracteres");
			System.out.println("\nTus letras hasta ahora son: " + listaCaracteres.toString() ); 
			System.out.println("Te quedan " + vidas + " vidas");
			
			//Pedirmos una letra y comprobamos si la palabra la contiene, ademas comprobamos si la palabra está completa
			System.out.print("\nIntroduce una letra --> ");
			char letra = pedirLetra(listaCaracteres, sc);
			if (comprobarLetra(palabraAleatoria, palabraAdivinada, letra)) {
				if(esIgual(palabraAdivinada)) {
					System.out.print("\n¡ENHORABUENA, HAS GANADO! --> La palabra oculta era: " + String.valueOf(palabraAdivinada));
					break;
				}
			}else {
				System.out.println("No contiene esta letra, has perdido una vida...");
				vidas --;
			}
		}
		System.out.print("\n¡TE HAS QUEDADO SIN VIDAS! --> La palabra oculta era: " + String.valueOf(palabraAdivinada));
	}
	


	//Función para introducir una palabra para la lista de palabras
	public static String pedirPalabra(Scanner sc) {
		String palabra =sc.nextLine();
		
		try {
			if(palabra.matches("[a-zA-Z]+")) {
				return palabra;
			}else {
				System.err.print("La palabra debe contener solo letras --> ");
				return pedirPalabra(sc);
			}
		} catch (Exception e) {
			sc.nextLine();
			System.err.println("ERROR: " + e);
			return pedirPalabra(sc);
		}		
	}
	
	// Función para escoger aleatoriamente una palabra de una lista de 4 palabras aleatorias 
	// Devuelve la palabra como un AList de caracteres
	public static ArrayList<Character> generarPalabra (Scanner sc) {
		ArrayList<String> listaPalabras = new ArrayList<String>();
		for (int i = 0 ; i < 4 ; i++) {
			System.out.print("Introduce una palabra --> ");
			listaPalabras.add(pedirPalabra(sc));
		}
		ArrayList<Character> palabraAdivinar = new ArrayList<Character>();
		String palabra = listaPalabras.get((int) (Math.random()*4));
		for(int i = 0; i < palabra.length(); i++) {
			palabraAdivinar.add(palabra.charAt(i));
		}
		return palabraAdivinar;
	}
	
	// Función para imprimir la palabra
	public static void imprimirPalabra (char[]palabraAdivinada) {
		for (int i = 0; i < palabraAdivinada.length; i++) {
			System.out.print(palabraAdivinada[i]);
		}
	}
	
	// Inicializamos el valor de los caracteres de la lista como "_"
	public static void rellenarPalabraAdivinada (char[]palabraAdivinada) {
		for (int i = 0; i < palabraAdivinada.length; i++) {
			palabraAdivinada[i] = '_';
		}
	}

	// Función para introducir una letra, comprueba si es o no repetida, si no lo es la guarda en la lista de letras
	public static char pedirLetra(ArrayList<Character> listaCaracteres, Scanner sc) {
		char letra ;
		String entrada = sc.nextLine().toLowerCase();
		
		// Comprobamos que lo que recibimos es un solo caracter
		// que el caracter sea una letra y que ademas no sea repetida
		if(entrada.length()==1 && Character.isLetter(entrada.charAt(0))) {
			letra = entrada.charAt(0);
			if(!listaCaracteres.contains(letra)) {
				listaCaracteres.add(letra);
				return letra;
			}else {
				System.err.print("\nLetra repetita, prueba con otra -->");
				return pedirLetra(listaCaracteres, sc);
			}
			
		}else {
			System.err.print("\nDebe ingresar solo una letra -->");
			return pedirLetra(listaCaracteres, sc);
		}
		
		
	}
	
	// Función para comprobar si una letra esta contenida en la palabra oculta
	// Si contiene la letra, la añadimos en la lista de la palabra del usuario
	public static boolean comprobarLetra (ArrayList<Character> palabraAleatoria, char[]palabraAdivinada, char letra) {
		if(palabraAleatoria.contains(letra)) {
			for (int i = 0; i < palabraAleatoria.size(); i++) {
				if (palabraAleatoria.get(i).equals(letra)) {
					palabraAdivinada[i] = letra;
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
	// Comprobar si las palabras ha sido adivinda (si no contiene ningun "_")
	public static boolean esIgual(char[]palabraAdivinada) {
		for( int i = 0 ; i<palabraAdivinada.length; i++) {
			if (palabraAdivinada[i]=='_') {
				return false;
			}
		}
		return true;
	}
}
