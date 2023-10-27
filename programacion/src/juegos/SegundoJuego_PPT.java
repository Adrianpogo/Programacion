package juegos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SegundoJuego_PPT {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Panel de inicio del juego
		System.out.println("*********************************************************");
		System.out.println("	 ---------------------------------------- 			");
		System.out.println("	|           BIENVENIDO AL JUEGO          |			");
		System.out.println(" 	 ---------------------------------------- 			");
		System.out.println("");
		System.out.println("	     ...GENERANDO JUGADA DE LA IA...		");
		System.out.println();
		System.out.println("*********************************************************");
		System.out.println();
		
		System.out.println("¿Contra quién desea jugar?");
		System.out.println("1. Otro usuario");
		System.out.println("2. La IA");
		System.out.println("");
		
		int opcion = escogerOpcion();
		juego(opcion);
		
	}
	
	//Función que ejecuta el juego en función de la opcion escogida
	public static void juego (int opcion){
		String resultado = "Empate!";

		if (opcion == 1) {
			do {
				String jugadaUsuario1 = pedirJugadaUsuario(1);
				String jugadaUsuario2 = pedirJugadaUsuario(2);
				resultado = resultado(jugadaUsuario1, jugadaUsuario2);
				System.out.println();
				System.out.println(resultado);
			} while (resultado.equalsIgnoreCase("Empate!"));
		}
		if (opcion == 2) {
			do {
				String jugadaUsuario1 = pedirJugadaUsuario(1);
				String jugadaIA = generarJugadaIA();
				resultado = resultado(jugadaUsuario1, jugadaIA);
				System.out.println();
				System.out.println(resultado);
			} while (resultado.equalsIgnoreCase("Empate!"));
		}
	}
	
	//Función para elegir el tipo de juego (vs Usuario / vs IA)
	public static int escogerOpcion() {
		Scanner sc = new Scanner (System.in);
		int opcion = 0;
		System.out.println("");
		System.out.print("Pulse la opción que desea --> ");
		try {
			opcion = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println( "No has escogido correctamente la opción " + e);
			return escogerOpcion();
		}
		return opcion;
	}
	
	//Función en la que se compara la jugada del usuario y de la IA para comprobar el resultado (si empata se repite el juego)
	public static String resultado(String jugada1, String jugada2) {
				
		if(jugada1.equalsIgnoreCase("piedra") && jugada2.equalsIgnoreCase("papel")) {
			return "Jugador 1 = piedra  || Jugador 2 = papel  --> ¡GANA JUGADOR 2!";						
		}else if (jugada1.equalsIgnoreCase("papel") && jugada2.equalsIgnoreCase("piedra")) {
			return "Jugador 1 = papel  || Jugador 2 = piedra  --> 'GANA JUGADOR 1!";						
		}else if(jugada1.equalsIgnoreCase("piedra") && jugada2.equalsIgnoreCase("tijera")) {
			return "Jugador 1 = piedra  || Jugador 2 = tijera  --> 'GANA JUGADOR 1!";			
		}else if (jugada1.equalsIgnoreCase("papel") && jugada2.equalsIgnoreCase("tijera")) {
			return "Jugador 1 = tijera  || Jugador 2 = piedra  --> ¡GANA JUGADOR 2!";						
		}else if(jugada1.equalsIgnoreCase("papel") && jugada2.equalsIgnoreCase("tijera")) {
			return "Jugador 1 = papel  || Jugador 2 = tijera  --> ¡GANA JUGADOR 2!";			
		}else if (jugada1.equalsIgnoreCase("papel") && jugada2.equalsIgnoreCase("tijera")) {
			return "Jugador 1 = tijera  || Jugador 2 = papel  --> 'GANA JUGADOR 1!";	
		}
		else {
			System.out.println();
			return "Empate!";
		}
	}

	//Función en la que se solicita al usuario que ingrese su jugada (piedra, papel o tijeras) 
	//Da igual si es en mayúsculas o minúsculas
	public static String pedirJugadaUsuario(int jugador) {
		System.out.println();
		Scanner sc = new Scanner (System.in);
		System.out.print("Jugador " + jugador + " : PIEDRA, PAPEL o TIJERA --> ");
		String jugadaUsuario = sc.nextLine();
		if(!jugadaUsuario.equalsIgnoreCase("piedra") && !jugadaUsuario.equalsIgnoreCase("papel")  && !jugadaUsuario.equalsIgnoreCase("tijera")){
			System.err.println("No te he entendido, introduce la palabra bien escrita");
			System.out.println();
			return pedirJugadaUsuario(jugador);
		}
		return jugadaUsuario;
	}
	
	//Función en la que se genera la jugada de la IA, en base a un número aleatorio la jugada será una u otra
	public static String generarJugadaIA() {
		int numAleatorio = (int) (Math.random()*10)-1;
		if(numAleatorio==-1) {
			generarJugadaIA();
		}
		switch(numAleatorio) {
		case 0,1,2:
			return "piedra";
		case 3,4,5:
			return "papel";
		}
		return "tijera";
	}
}
