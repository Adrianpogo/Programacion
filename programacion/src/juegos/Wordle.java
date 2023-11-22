package juegos;

import java.util.ArrayList;
import java.util.Scanner;

public class Wordle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> palabras = new ArrayList<String>();

		String palabraDiaria = "texto";
		String palabraUsuario = "";
		int vidas = 6;
		
		System.out.println("-----------------------------");
		System.out.println("     --> W O R D L E <--     ");
		System.out.println("-----------------------------");

		// Bucle principal hasta que no haya vidas o acertemos
		while (vidas > 0) {
			System.out.print("\nIntroduce una palabra --> ");
			palabraUsuario = pedirPalabra(sc, palabraDiaria);
			
			// Si acertamos se acaba el juego, si no damos pistas
			if(sonIgules(palabraUsuario, palabraDiaria)) {
				System.out.println("\n¡Felicidades, nos vemos mañana!");
				break;
				
			}else {
				System.out.println("\nPistas: ");
				System.out.println("--------------------------------");
				System.out.println(" 1 = posición correcta         |");
				System.out.println(" 0 = posición incorrecta       |");
				System.out.println(" - = no contiene esta letra    |");
				System.out.println("--------------------------------");
				pistasPalabra(palabraUsuario, palabraDiaria, palabras);
				impresionPistas(palabras);
				
				
			}
			
			// Restamos el intento
			vidas--;
			System.out.println();
			System.out.println("\nTe quedan " + vidas + " intentos");
			System.out.println("--------------------------------");
			
		}
		
		// Cuando se acaba y no hay vidas hemos perdido
		if (vidas == 0) {
			System.out.println("Te has quedado sin vidas, la palabra diaria es: " + palabraDiaria);
		}
		
	}

	// Función para pedir al usuario la palabra para probar
	public static String pedirPalabra(Scanner sc, String palabraDiaria) {
		String palabraUsuario = sc.nextLine().toLowerCase();
		
			
			try {
				// La palabra debe tener la misma longitud que la palabraDiaria y ademas estar
				// compuesta solo por carácteres
				if (palabraUsuario.length() == palabraDiaria.length()) {

					for (int i = 0; i < palabraUsuario.length(); i++) {
						if (!Character.isLetter(palabraUsuario.charAt(i))) {
							System.out.println("\nLa palabra solo debe contener letras..");
							System.out.print("Introduzca su palabra: ");
							return pedirPalabra(sc, palabraDiaria);
						}
					}
					return palabraUsuario;

				} else {
					System.out.println("\nLa palabra debe tener " + palabraDiaria.length() + " caracteres");
					System.out.print("Introduzca su palabra: ");					
					return pedirPalabra(sc, palabraDiaria);
				}
			} catch (Exception e) {
				System.err.println("ERROR: " + e);
				return pedirPalabra(sc, palabraDiaria );
			}
			
		
		
	}

	// Función para comprobar que letras coinciden entre la palabra del usuario y la palabra diaria y dar pistas
	public static void pistasPalabra(String palabraUsuario, String palabraDiaria, ArrayList<String> palabras) {
		String palabraConPista = "";
		// Comprobamos 1 a 1 las letras de la palabra
		for (int i = 0 ; i < palabraUsuario.length(); i++) {
			char letra = palabraUsuario.charAt(i);
			
			if (palabraDiaria.indexOf(letra)!= -1) {
				
				// Está en la misma posición
				if(letra == palabraDiaria.charAt(i)){
					palabraConPista += letra + "(1)  ";
				}
				
				// Contiene la letra pero no es la misma posición
				else {
					palabraConPista += letra + "(0)  ";
				}
			}
			// NO contiene la letra
			else{
				palabraConPista += letra + "(-)  ";
			}
		}
		
		palabras.add(palabraConPista);
	}

	// Función para comprobar si dos palabras son iguales
	public static boolean sonIgules (String palabraUsuario, String palabraDiaria) {
		return palabraUsuario.equals(palabraDiaria);
	}
	
	public static void impresionPistas (ArrayList<String> palabras) {
		for(String palabra : palabras) {
			System.out.println(palabra);
		}
	}

}
