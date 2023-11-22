package juegos;

import java.util.Scanner;

public class Wordle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palabraDiaria = "ordenador";
		String palabraUsuario = "";
		int vidas = 6;

		while (vidas > 0) {
			palabraUsuario = pedirPalabra(sc, palabraDiaria);
			
			//Comprobaciones de la palabra
			
			if(sonIgules(palabraUsuario, palabraDiaria)) {
				System.out.println("¡Felicidades, nos vemos mañana!");
				break;
			}
			
		}

		System.out.println("Te has quedado sin vidas, la palabra diaria es: " + palabraDiaria);
	}

	// Función para pedir al usuario la palabra para probar
	public static String pedirPalabra(Scanner sc, String palabraDiaria) {
		String palabraUsuario = sc.nextLine();

		// La palabra debe tener la misma longitud que la palabraDiaria y ademas estar
		// compuesta solo por carácteres
		if (palabraUsuario.length() == palabraDiaria.length()) {

			for (int i = 0; i < palabraUsuario.length(); i++) {
				if (!Character.isLetter(palabraUsuario.charAt(i))) {
					System.out.println("La palabra solo debe contener letras..");
					System.out.print("Introduzc su palabra: ");
					return pedirPalabra(sc, palabraDiaria);
				}
			}
			return palabraUsuario;

		} else {
			System.out.println(
					"La palabra no es de la longitud adecuada, debe tener " + palabraDiaria.length() + " caracteres");
			return pedirPalabra(sc, palabraDiaria);
		}
	}

	// Función para comprobar que letras coinciden entre la palabra del usuario y la palabra diaria
	public static void comprobarPalabra() {
		
	}

	// Función para comprobar si dos palabras son iguales
	public static boolean sonIgules (String palabraUsuario, String palabraDiaria) {
		return palabraUsuario.equals(palabraDiaria);
	}

}
