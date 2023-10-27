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
		String resultado ="";
		
		if(opcion == 1) {
			String jugadaUsuario1 =pedirJugadaUsuario() ;
			String jugadaUsuario2 =pedirJugadaUsuario() ;
			resultado = juego(jugadaUsuario1, jugadaUsuario2);
			
		}else if (opcion == 2) {
			String jugadaUsuario1 =pedirJugadaUsuario() ;
			String jugadaIA =generarJugadaIA();
			resultado = juego(jugadaUsuario1, jugadaIA);
		}
		
		System.out.println();
		System.out.println(resultado);
		
	}
	
	//Función para elegir el tipo de juego (vs Usuario / vs IA)
	public static int escogerOpcion() {
		Scanner sc = new Scanner (System.in);
		int opcion = 0;
		System.out.print("Pulse la opción que desea --> ");
		try {
			opcion = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println( "No has escogido correctamente la opción " + e);
			System.out.println("");
			return escogerOpcion();
		}
		return opcion;
	}
	

	
	//Función en la que se compara la jugada del usuario y de la IA para comprobar el resultado (si empata se repite el juego)
	public static String juego(String jugada1, String jugada2) {
		
		
		if(jugada1.equalsIgnoreCase("piedra") && jugada2.equalsIgnoreCase("papel")) {
			return "Jugada 1 = piedra  || Jugada 2 = papel  --> ¡GANA J2!";
			
			
		}else if (jugada1.equalsIgnoreCase("papel") && jugada2.equalsIgnoreCase("piedra")) {
			return "Jugada 1 = papel  || Jugada 2 = piedra  --> 'GANA J1!";
			
			
		}else if(jugada1.equalsIgnoreCase("piedra") && jugada2.equalsIgnoreCase("tijera")) {
			return "Jugada 1 = piedra  || Jugada 2 = tijera  --> 'GANA J1!";
			
			
		}else if (jugada1.equalsIgnoreCase("papel") && jugada2.equalsIgnoreCase("tijera")) {
			return "Jugada 1 = tijera  || Jugada 2 = piedra  --> ¡GANA J2!";
			
			
		}else if(jugada1.equalsIgnoreCase("papel") && jugada2.equalsIgnoreCase("tijera")) {
			return "Jugada 1 = papel  || Jugada 2 = tijera  --> ¡GANA J2!";
			
			
		}else if (jugada1.equalsIgnoreCase("papel") && jugada2.equalsIgnoreCase("tijera")) {
			return "Jugada 1 = tijera  || Jugada 2 = papel  --> 'GANA J1!";
			
			
		}
		else {
			System.out.println();
			System.out.println("VAYA! HEMOS EMPATADO, VAMOS A REPETIR");
			System.out.println();
			return juego(pedirJugadaUsuario(), generarJugadaIA());
		}
		
	}

	//Función en la que se solicita al usuario que ingrese su jugada (piedra, papel o tijeras) 
	//Da igual si es en mayúsculas o minúsculas
	public static String pedirJugadaUsuario() {
		System.out.println();
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce tú jugada: PIEDRA, PAPEL o TIJERA --> ");
		String jugadaUsuario = sc.nextLine();
		if(!jugadaUsuario.equalsIgnoreCase("piedra") && !jugadaUsuario.equalsIgnoreCase("papel")  && !jugadaUsuario.equalsIgnoreCase("tijera")){
			System.err.println("No te he entendido, introduce la palabra bien escrita");
			System.out.println();
			return pedirJugadaUsuario();
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
