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
			resultado = juegoUsuario();
		}else if (opcion == 2) {
			resultado = juegoIA();
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
	public static String juegoUsuario() {
		
		String jugadaUsuario1 = "Usuario 1: " + pedirJugadaUsuario();
		String jugadaUsuario2 = pedirJugadaUsuario();
		
		if(jugadaUsuario1.equalsIgnoreCase("piedra") && jugadaUsuario2.equalsIgnoreCase("papel")) {
			return "Usuario 1 = piedra  || Usuario 2 = papel  --> ¡EL USUARIO 2 GANA!";
		}else if (jugadaUsuario1.equalsIgnoreCase("papel") && jugadaUsuario2.equalsIgnoreCase("piedra")) {
			return "Usuario 1 = papel  || Usuario 2 = piedra  --> 'EL USUARIO 1 GANA!";
		}else if(jugadaUsuario1.equalsIgnoreCase("piedra") && jugadaUsuario2.equalsIgnoreCase("tijera")) {
			return "Usuario 1 = piedra  || Usuario 2 = tijera  --> 'EL USUARIO 1 GANA!";
		}else if (jugadaUsuario1.equalsIgnoreCase("tijera") && jugadaUsuario2.equalsIgnoreCase("piedra")) {
			return "Usuario 1 = tijera  || Usuario 2 = piedra  --> ¡EL USUARIO 2 GANA!";
		}else if(jugadaUsuario1.equalsIgnoreCase("papel") && jugadaUsuario2.equalsIgnoreCase("tijera")) {
			return "Usuario 1 = papel  || Usuario 2 = tijera  --> ¡EL USUARIO 2 GANA!";
		}else if (jugadaUsuario1.equalsIgnoreCase("papel") && jugadaUsuario2.equalsIgnoreCase("tijera")) {
			return "Usuario 1 = tijera  || Usuario 2 = papel  --> 'EL USUARIO 1 GANA!";
		}
		else {
			System.out.println();
			System.out.println("VAYA! HEMOS EMPATADO, VAMOS A REPETIR");
			System.out.println();
			return juegoIA();
		}
	}
	

	
	//Función en la que se compara la jugada del usuario y de la IA para comprobar el resultado (si empata se repite el juego)
	public static String juegoIA() {
		
		String jugadaIA = generarJugadaIA();
		String jugadaUsuario = pedirJugadaUsuario();
		
		if(jugadaIA.equalsIgnoreCase("piedra") && jugadaUsuario.equalsIgnoreCase("papel")) {
			return "Jugada IA = piedra  || Jugada Usuario = papel  --> ¡EL USUARIO GANA!";
		}else if (jugadaIA.equalsIgnoreCase("papel") && jugadaUsuario.equalsIgnoreCase("piedra")) {
			return "Jugada IA = papel  || Jugada Usuario = piedra  --> 'LA IA GANA!";
		}else if(jugadaIA.equalsIgnoreCase("piedra") && jugadaUsuario.equalsIgnoreCase("tijera")) {
			return "Jugada IA = piedra  || Jugada Usuario = tijera  --> 'LA IA GANA!";
		}else if (jugadaIA.equalsIgnoreCase("papel") && jugadaUsuario.equalsIgnoreCase("tijera")) {
			return "Jugada IA = tijera  || Jugada Usuario = piedra  --> ¡EL USUARIO GANA!";
		}else if(jugadaIA.equalsIgnoreCase("papel") && jugadaUsuario.equalsIgnoreCase("tijera")) {
			return "Jugada IA = papel  || Jugada Usuario = tijera  --> ¡EL USUARIO GANA!";
		}else if (jugadaIA.equalsIgnoreCase("papel") && jugadaUsuario.equalsIgnoreCase("tijera")) {
			return "Jugada IA = tijera  || Jugada Usuario = papel  --> 'LA IA GANA!";
		}
		else {
			System.out.println();
			System.out.println("VAYA! HEMOS EMPATADO, VAMOS A REPETIR");
			System.out.println();
			return juegoIA();
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
