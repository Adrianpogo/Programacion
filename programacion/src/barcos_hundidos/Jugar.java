package barcos_hundidos;

import java.util.Scanner;

public class Jugar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------    HUNDIR LA FLOTA    --------");
		System.out.println("|                                     |");
		System.out.println("| >>   = CASILLA SIN DISPARAR         |");
		System.out.println("| >> - = AGUA                         |");
		System.out.println("| >> H = HUNDIDO                      |");
		System.out.println("|                                     |");
		System.out.println("| Dispara y hunde los barcos rivales! |");
		System.out.println("|_____________________________________|\n");
		
		//Creamos los jugdores con tableros de 5x5 y colocamos los barcos aleatoriamente
		System.out.println("Creando el tablero de los jugadores...");
		Jugador jugador1 = new Jugador("Adrian", 5);
		jugador1.colocarBarcos();
		Jugador jugador2 = new Jugador("Sergio", 5);
		jugador2.colocarBarcos();
		
		Jugador jugadorActual = jugador1;
		
		
		while (true) {
			// Mostramos el tablero del jugador actual y le pedimos coordenadas para
			// disparar
			System.out.println("_____________________________________");
			System.out.println("\n" + jugadorActual.getNombre() + ", es tu turno. \n");
			System.out.println("\u001B[41m");
			jugador1.mostrarTableroJuego();
			System.out.println(">> Barcos Hundidos --> " + jugador1.barcosHundidosJugador());
			System.out.println("\u001B[44m");
			jugador2.mostrarTableroJuego();
			System.out.println(">> Barcos Hundidos --> " + jugador1.barcosHundidosJugador());
			System.out.println("\u001B[0m");
			System.out.print(jugadorActual.getNombre() + " --> ingresa la fila para disparar: ");
			int fila = sc.nextInt();
			System.out.print(jugadorActual.getNombre() + " --> ingresa la columna para disparar: ");
			int columna = sc.nextInt();

			// Declaramos como oponente al jugador contrario al que está jugando
			Jugador oponente = (jugadorActual == jugador1) ? jugador2 : jugador1;

			// Al disparar hacemos el disparo en el tablero del Oponente y comprobamos el
			// resultado
			if (oponente.disparar(fila, columna)) {
				System.out.println("\n¡Has impactado un barco!");
			} else {
				System.out.println("\n¡Has disparado al agua!");
			}

			// Comprobamos si tosos los barcos del Oponente están hundidos con lo cual
			// ganariamos y salimos del bucle del juego
			if (oponente.todosBarcosHundidos()) {
				System.out.println("\n\n_____________________________________\n");
				System.out.println(jugadorActual.getNombre() + " ha ganado. ¡Felicidades!");
				System.out.println("\nEl tablero de la partida ha sido: \n");
				System.out.println("-------------------------------------\n");
				System.out.println("\u001B[41m");
				jugador1.mostrarTablero();
				System.out.println("\u001B[44m");
				jugador2.mostrarTablero();
				System.out.println("\u001B[0m");
				System.out.println("________  HASTA LA PRÓXIMA  _________");
				break;
			}

			// Cambiar al otro jugador en caso de que no haya victoria
			jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
			
		}
		 
		 
		 
		
	}

}
