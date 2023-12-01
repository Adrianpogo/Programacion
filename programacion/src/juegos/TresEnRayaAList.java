package juegos;

import java.util.ArrayList;
import java.util.Random;

public class TresEnRayaAList {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> tablero = new ArrayList<ArrayList<String>>();
		int ronda = 1;

		System.out.println("   --> TABLERO INICIAL <--");
		crearTablero(tablero);
		mostrarTablero(tablero);

		while (ronda < 10) {
			System.out.println("\n-------------------------------------");
			if (ronda % 2 == 0) {
				System.out.println("Ronda " + ronda + " --> Juega Equipo 2 (O)");
				colocarFicha(tablero, TresEnRayaEnum.EQUIPO_2.getValor());
			} else {
				System.out.println("Ronda " + ronda + " --> Juega Equipo 1 (X)");
				colocarFicha(tablero, TresEnRayaEnum.EQUIPO_1.getValor());
			}

			System.out.println();
			mostrarTablero(tablero);

			// Se comprueba si hay alguna condición de victoria, si la hay finaliza el juego
			if (comprobarGanador(tablero)) {
				break;
			} else {
				ronda++;
			}

		}
		// Se acaba la partida y el resultado es empate
		if (ronda == 10) {
			System.out.println("\n-------------------------------------");
			System.out.println("\n   FIN DE LA PARTIDA --> EMPATE");
		}

	}

	//////////////////////////////////////////////////// F U N C I O N E S
	//////////////////////////////////////////////////// //////////////////////////////////////////////////////////

	// Función para crear un tablero vacio
	public static void crearTablero(ArrayList<ArrayList<String>> tablero) {
		for (int i = 0; i < 3; i++) {
			ArrayList<String> fila = new ArrayList<String>();
			for (int j = 0; j < 3; j++) {
				fila.add(TresEnRayaEnum.VACIO.getValor());
			}
			tablero.add(fila);
		}
	}

	// Función para mostrar el tablero por pantalla
	public static void mostrarTablero(ArrayList<ArrayList<String>> tablero) {
		System.out.println("\n	 --- --- --- ");
		for (ArrayList<String> fila : tablero) {
			System.out.print("	| ");
			for (String posicion : fila) {
				System.out.print(posicion + " | ");
			}
			System.out.println("\n	 --- --- --- ");
		}
	}

	// Función para colocar una ficha en el tablero
	public static void colocarFicha(ArrayList<ArrayList<String>> tablero, String equipo) {
		Random rd = new Random();

		boolean valida = false;

		while (!valida) {
			int posX = rd.nextInt(0, 3);
			int posY = rd.nextInt(0, 3);

			if (comprobarVacio(tablero, posX, posY)) {
				System.out.println("Coloca la ficha en la fila (" + (posY + 1) + ") , columna (" + (posX + 1) + ")");
				tablero.get(posY).set(posX, equipo);
				valida = true;
			}
		}
	}

	// Función para comprobar si una posición del tablero está vacia
	public static boolean comprobarVacio(ArrayList<ArrayList<String>> tablero, int posX, int posY) {
		if (tablero.get(posY).get(posX).equals(TresEnRayaEnum.VACIO.getValor())) {
			return true;
		} else {
			return false;
		}
	}

	// Función que comprueba todas las condiciones de victoria para devolver si hay
	// o no ganador
	public static boolean comprobarGanador(ArrayList<ArrayList<String>> tablero) {

		if (comprobarFila(tablero, TresEnRayaEnum.EQUIPO_1.getValor())) {
			return true;
		} else if (comprobarFila(tablero, TresEnRayaEnum.EQUIPO_2.getValor())) {
			return true;
		} else if (comprobarColumna(tablero, TresEnRayaEnum.EQUIPO_1.getValor())) {
			return true;
		} else if (comprobarColumna(tablero, TresEnRayaEnum.EQUIPO_2.getValor())) {
			return true;
		} else if (comprobarDiagonalI(tablero, TresEnRayaEnum.EQUIPO_1.getValor())) {
			return true;
		} else if (comprobarDiagonalI(tablero, TresEnRayaEnum.EQUIPO_2.getValor())) {
			return true;
		} else if (comprobarDiagonalD(tablero, TresEnRayaEnum.EQUIPO_1.getValor())) {
			return true;
		} else if (comprobarDiagonalD(tablero, TresEnRayaEnum.EQUIPO_2.getValor())) {
			return true;
		}

		return false;
	}

	// Función auxiliar para comprobar filas
	public static boolean comprobarFila(ArrayList<ArrayList<String>> tablero, String equipo) {
		for (ArrayList<String> fila : tablero) {
			if (fila.get(0).equals(equipo) && fila.get(1).equals(fila.get(0)) && fila.get(2).equals(fila.get(0))) {
				System.out.println("\n  HA GANADO EL EQUIPO (" + equipo + ") POR FILA");
				return true;
			}
		}
		return false;
	}

	// Función auxiliar para comprobar columnas
	public static boolean comprobarColumna(ArrayList<ArrayList<String>> tablero, String equipo) {
		for (int i = 0; i < tablero.size(); i++) {
			if (tablero.get(0).get(i).equals(equipo) && tablero.get(0).get(i).equals(tablero.get(1).get(i))
					&& tablero.get(0).get(i).equals(tablero.get(2).get(i))) {

				System.out.println("\n  HA GANADO EL EQUIPO (" + equipo + ") POR COLUMNA");
				return true;
			}
		}
		return false;
	}

	// Función auxiliar para comprobar la diagonal de izquierdas
	public static boolean comprobarDiagonalI(ArrayList<ArrayList<String>> tablero, String equipo) {
		if (tablero.get(0).get(0).equals(equipo) && tablero.get(1).get(1).equals(tablero.get(0).get(0))
				&& tablero.get(2).get(2).equals(tablero.get(0).get(0))) {

			System.out.println("\nHA GANADO EL EQUIPO (" + equipo + ") POR DIAGONAL IZQUIERDA");
			return true;
		} else {
			return false;
		}
	}

	// Función auxiliar para comprobar la diagonal de derechas
	public static boolean comprobarDiagonalD(ArrayList<ArrayList<String>> tablero, String equipo) {
		if (tablero.get(0).get(2).equals(equipo) && tablero.get(1).get(1).equals(tablero.get(0).get(2))
				&& tablero.get(2).get(0).equals(tablero.get(0).get(2))) {

			System.out.println("\nHA GANADO EL EQUIPO (" + equipo + ") POR DIAGONAL DERECHA");
			return true;
		} else {
			return false;
		}
	}
}
