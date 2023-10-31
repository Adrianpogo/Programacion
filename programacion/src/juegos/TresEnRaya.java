package juegos;

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
		generarTableroVacio(tablero);
		imprimirTablero(tablero);
		
		System.out.println("");
		System.out.println("--------------------------------------------------------");
		System.out.println("Comienza jugando el usuario (X)");
		System.out.println("--------------------------------------------------------");
		
		System.out.println();
		juego(tablero);

	}
	
	//Función que rellena el tablero de "-" Para su visualización
	public static String[][] generarTableroVacio(String[][] tablero) {
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
	public static void juego(String[][] tablero) {
		
		for(int i = 0; i < 9 ; i++) {
			if (i % 2 == 0) {
				System.out.println("Turno del USUARIO");
				pedirJugadaUsuario(tablero);
				System.out.println();
				if(comprobar3enRaya(tablero)) {
					System.out.println(" FIN DE LA PARTIDA --> El usuario ha ganado ");
					break;
				}
			}else {
				System.out.println("Turno de la IA");
				pedirJugadaIA(tablero);
				System.out.println();
				if(comprobar3enRaya(tablero)) {
					System.out.println(" FIN DE LA PARTIDA --> La IA ha ganado --> ");
					break;
				}
			}
		}
		
		if(!comprobar3enRaya(tablero)) {
			System.out.println("----------------------------");
			System.out.println("FIN DE LA PARTIDA --> EMPATE");
			
		}
	}

	//Función para pedir al usuario su jugada y comprobar si es valida
	public static void pedirJugadaUsuario(String[][] tablero) {

	}
	
	//Función para genera la jugada de la IA y comprobar si es valida
	public static void pedirJugadaIA(String[][] tablero) {

	}

	//Funciión para comprobar si hay 3 en raya en el tablero
	public static boolean comprobar3enRaya(String[][] tablero) {
		boolean resultado = false;
		
		
		return resultado;
	}

}
