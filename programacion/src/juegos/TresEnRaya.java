package juegos;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {

		// Panel de inicio del juego
		System.out.println("*********************************************************");
		System.out.println("	                                          			");
		System.out.println("         ----->   BIENVENIDO AL JUEGO   <-----      	");
		System.out.println(" 	 													");
		System.out.println("*********************************************************");
		System.out.println("");
		System.out.println("Bienvenido a las 3 en raya, este es su tablero inicial: ");
		System.out.println("--------------------------------------------------------");
		System.out.println("");
		
		
		String[][] tablero = new String [3][3];
		String[][] tableroPos = new String [3][3];
		posicionesTablero(tableroPos);
		System.out.println();
		
		tableroEnPartida(tablero);
		
		System.out.println("");
		System.out.println("--------------------------------------------------------");
		System.out.println("Comienza jugando el usuario (X)");
		System.out.println("--------------------------------------------------------");
		
		System.out.println();
		juego(tablero, tableroPos);

	}
	
	//Función para mostrar inicialmente el sistema de posiciones del juego
	public static String[][] posicionesTablero(String[][] tablero) {
			for(int i = 0; i < tablero.length; i++) {
				for(int j = 0; j < tablero.length; j++) {
					tablero[i][j] = "[" + i + "," + j + "]";
					System.out.print(tablero[i][j] + " ");
				}
				System.out.println("");
			}
			return tablero;
		}
	
	//Función que rellena el tablero de "-" Para su visualización
	public static String[][] tableroEnPartida(String[][] tablero) {
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero.length; j++) {
				tablero[i][j] = "-";
			}
		}
		return tablero;
	}
	
	//Función que imprime por pantalla el tablero
	public static String[][] imprimirTablero(String[][] tablero) {
		
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println("");
		}
		return tablero;
	}
	
	//Función que contiene el bucle para el fujo del juego
	public static void juego(String[][] tablero, String[][] tableroPos) {
		
		for(int i = 0; i < 9 ; i++) {
			if (i % 2 == 0) {
				System.out.println(" --> Turno del USUARIO <-- ");
				System.out.println();
				posicionesTablero(tableroPos);
				System.out.println();
				pedirJugadaUsuario(tablero);
				System.out.println();
				if(comprobar3enRaya(tablero)) {
					System.out.println(" FIN DE LA PARTIDA --> El usuario ha ganado ");
					break;
				}
			}else {
				System.out.println(" --> Turno del USUARIO 2 <-- ");
				System.out.println();
				posicionesTablero(tableroPos);
				System.out.println();
				pedirJugadaUsuario2(tablero);
				System.out.println();
				if(comprobar3enRaya(tablero)) {
					System.out.println(" FIN DE LA PARTIDA --> El usuario 2 ha ganado ");
					break;
				}
			}
		}
		
		if(!comprobar3enRaya(tablero)) {
			System.out.println("----------------------------");
			System.out.println("RESULTADO --> EMPATE");
			
		}
	}

	//Función para pedir al usuario su jugada y comprobar si es valida
	public static String[][] pedirJugadaUsuario(String[][] tablero) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Ingresa la coordenada X: ");
		int posX = sc.nextInt();
		System.out.print("Ingresa la coordenada Y: ");
		int posY = sc.nextInt();
		System.out.println();
		
		if(posX > 2 || posY > 2 || posX < 0 || posY < 0) {
			System.out.println("Posición fuera de rango (3x3) , vuelva a intentarlo...");
			System.out.println("");
			return pedirJugadaUsuario(tablero);
		}
		
		if(!tablero[posX][posY].equals("-")) {
			System.out.println("Ya hay ficha en esta posición, vuelva a intentarlo...");
			return pedirJugadaUsuario(tablero);
		} else {
			tablero[posX][posY] = "X";
			imprimirTablero(tablero);
			return tablero;
		}
	}
	
	//Función para pedir al usuario su jugada y comprobar si es valida
		public static String[][] pedirJugadaUsuario2(String[][] tablero) {
			Scanner sc = new Scanner (System.in);
			System.out.print("Ingresa la coordenada X: ");
			int posX = sc.nextInt();
			System.out.print("Ingresa la coordenada Y: ");
			int posY = sc.nextInt();
			System.out.println();
			
			if(posX > 2 || posY > 2 || posX < 0 || posY < 0) {
				System.out.println("Posición fuera de rango (3x3) , vuelva a intentarlo...");
				System.out.println("");
				return pedirJugadaUsuario(tablero);
			}
			
			if(!tablero[posX][posY].equals("-")) {
				System.out.println("Ya hay ficha en esta posición, vuelva a intentarlo...");
				return pedirJugadaUsuario(tablero);
			} else {
				tablero[posX][posY] = "O";
				imprimirTablero(tablero);
				return tablero;
			}
		}
		
	//Función para genera la jugada de la IA y comprobar si es valida
	public static String[][] pedirJugadaIA(String[][] tablero) {
		int posX = (int) (Math.random()*3);
		int posY = (int) (Math.random()*3);
		
		if(!tablero[posX][posY].equals("-")) {
			return pedirJugadaIA(tablero);
		} else {
			tablero[posX][posY] = "O";
			imprimirTablero(tablero);
			return tablero;
		}
	}

	//Funciión para comprobar si hay 3 en raya en el tablero
	public static boolean comprobar3enRaya(String[][] tablero) {
		boolean resultado = false;
		
		//Filas
		for(int i = 0; i < tablero.length; i++) {
			if (tablero[i][0].equals(tablero[i][1]) && tablero[i][0].equals(tablero[i][2]) && tablero[i][0].equals("X")) {
				resultado=true;
			} else if (tablero[i][0].equals(tablero[i][1]) && tablero[i][0].equals(tablero[i][2]) && tablero[i][0].equals("O")){
				resultado=true;
			}
		}
		
		//Columnas
		for(int i = 0; i < tablero.length; i++) {
			if (tablero[0][i].equals(tablero[1][i]) && tablero[0][i].equals(tablero[2][i]) && tablero[0][i].equals("X")) {
				resultado=true;
			} else if (tablero[0][i].equals(tablero[1][i]) && tablero[0][i].equals(tablero[2][i]) && tablero[0][i].equals("O")){
				resultado=true;
			}
		}
		
		//Diagonales
		if(tablero[0][0].equals(tablero[1][1]) && tablero[0][0].equals(tablero[2][2]) && tablero[0][0].equals("X")) {
			resultado=true;
		} else if (tablero[0][2].equals(tablero[1][1]) && tablero[0][2].equals(tablero[2][0]) && tablero[0][2].equals("X")){
			resultado=true;
		} else if (tablero[0][0].equals(tablero[1][1]) && tablero[0][0].equals(tablero[2][2]) && tablero[0][0].equals("0")){
			resultado=true;
		} else if (tablero[0][2].equals(tablero[1][1]) && tablero[0][2].equals(tablero[2][0]) && tablero[0][2].equals("0")){
			resultado=true;
		}
		
		
		return resultado;
	}

}
