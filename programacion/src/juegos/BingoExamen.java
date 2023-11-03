// Adrián Pousa Gonzalez

package juegos;

import java.util.Scanner;

public class BingoExamen {

	public static void main(String[] args) {
		do {
			jugarBingo();
		} while (continuar());

	}

	// Función inicial para generar los cartones, el bombo
	// y tras ello comenzar a jugar
	public static void jugarBingo() {
		int[][] cartonJugador1 = generarCarton();
		int[][] cartonJugador2 = generarCarton();

		System.out.println("Cartón del Jugador 1:");
		System.out.println("---------------------");
		imprimirCarton(cartonJugador1);
		System.out.println();
		System.out.println("Cartón del Jugador 2:");
		System.out.println("---------------------");
		imprimirCarton(cartonJugador2);

		int[] bombo = generarBombo();

		System.out.println("\nComienza el juego de Bingo:");
		System.out.println("-----------------------------");
		jugarBingo(cartonJugador1, cartonJugador2, bombo);
	}

	// Función que genera números aleatorios del 0 al 20 para hacer el bombo
	public static int[] generarBombo() {
		int[] bombo = new int[20];
		for (int i = 0; i < 20; i++) {
			bombo[i] = i + 1;
		}
		return bombo;
	}

	// Función que imprime la matriz que representa el cartón para jugar
	public static void imprimirCarton(int[][] carton) {
		for (int x = 0; x < carton.length; x++) {
			for (int y = 0; y < carton[x].length; y++) {
				System.out.print(carton[x][y] + "  ");
			}
			System.out.println();
		}
	}

	// Función que dado un número comprueba si este existe en el cartón
	public static boolean contieneNumero(int[][] carton, int numero) {
		for (int x = 0; x < carton.length; x++) {
			for (int y = 0; y < carton[x].length; y++) {
				if (carton[x][y] == numero) {
					return true;
				}
			}
		}
		return false;
	}

	// Esta función solicita al usuario si desea continuar
	// jugando y devuelve true si la respuesta es "S" (Sí) o false si es "N" (No).
	public static boolean continuar() {
		Scanner sc = new Scanner(System.in);
		boolean continuar = false;

		System.out.print("\n ¿ Desea volver a jugar ? --> Si (S) // No (N)");
		String respuesta = sc.nextLine().toLowerCase();

		if (respuesta.equals("s")) {
			System.out.println();
			continuar = true;
		} else if (respuesta.equals("n")) {
			continuar = false;
		} else {
			System.err.println("Ingrese 'S' para SI, 'N' para NO");
			System.out.println();
			return continuar();
		}

		return continuar;
	}

	// Esta función genera un cartón de Bingo aleatorio de 2x5,
	// llenando cada celda con números únicos entre 1 y 20.
	// tiene que haber la misma cantidad de número 1-10 que 11-20
	public static int[][] generarCarton() {
		int[][] carton = new int[2][5];
		int[] arrayNums = new int[20];

		for (int i = 1; i < arrayNums.length; i++) {
			arrayNums[i] = i;
		}

		for (int i = 0; i < carton.length; i++) {
			for (int j = 0; j < carton[0].length; j++) {
				int posicion = escogerPosicion(arrayNums);
				carton[i][j] = posicion;
				arrayNums[posicion - 1] = 0;
			}
		}
		return carton;
	}

	// Función auxiliar para escoger una posición del array de numero
	// de esta forma comprobamos si es 0 (significa que ya se ha usado
	// ese valor, por lo que cogemos otro)
	public static int escogerPosicion(int[] array) {
		int pos = (int) (Math.random() * 20) + 1;
		if (array[pos - 1] != 0) {
			return pos;
		} else {
			return escogerPosicion(array);
		}
	}

	// Esta función simula el juego de Bingo,
	// extrayendo números del bombo y verificando si
	// algún jugador ha completado su cartón.
	public static void jugarBingo(int[][] cartonJugador1, int[][] cartonJugador2, int[] bombo) {

		while (true) {
			int posicionBombo = (int) (Math.random() * 20);
			int numBombo = bombo[posicionBombo];

			if (bombo[posicionBombo] != 0) {
				System.out.println("El numero del bombo es: " + numBombo);

				if (contieneNumero(cartonJugador1, numBombo)) {
					borrarNumAcierto(cartonJugador1, numBombo);
				}

				if (contieneNumero(cartonJugador2, numBombo)) {
					borrarNumAcierto(cartonJugador2, numBombo);
				}

				if (esCartonCompleto(cartonJugador1) && esCartonCompleto(cartonJugador2)) {
					System.out.println("\n  --> GANAN AMBOS JUGADORES <--");
					break;
				} else if (esCartonCompleto(cartonJugador2)) {
					System.out.println("\n  --> GANA JUGADOR 2 <--");
					break;
				} else if (esCartonCompleto(cartonJugador1)) {
					System.out.println("\n  --> GANA JUGADOR 1 <--");
					break;
				}
			}
			bombo[posicionBombo] = 0;
		}

	}

	// Función que borra el número del carton (igualando a 0) en caso de coincidir 
	// con la tirada del bombo
	public static int[][] borrarNumAcierto(int[][] carton, int numero) {
		for (int i = 0; i < carton.length; i++) {
			for (int j = 0; j < carton[0].length; j++) {
				if (carton[i][j] == numero) {
					carton[i][j] = 0;
				}
			}
		}
		return carton;
	}

	// Función para verificar si un cartón está completo.
	// Si todo el carton es 0 estará completo
	public static boolean esCartonCompleto(int[][] carton) {
		for (int i = 0; i < carton.length; i++) {
			for (int j = 0; j < carton[0].length; j++) {
				if (carton[i][j] != 0) {
					return false;
				}
			}

		}
		return true;

	}

}
