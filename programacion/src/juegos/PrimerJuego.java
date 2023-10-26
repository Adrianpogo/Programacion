package juegos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimerJuego {

	public static void main(String[] args) {

		/*
		 * Inicio del Juego: El juego comienza generando un número aleatorio dentro de
		 * un rango especificado. En este ejemplo, el rango es de 0 a 99. El jugador no
		 * conoce este número y debe adivinar cuál es.
		 * 
		 * Adivinanza del Jugador: El jugador hace una suposición sobre cuál cree que es
		 * el número aleatorio. En el ejemplo, el jugador ingresa su suposición a través
		 * del teclado.
		 * 
		 * Verificación: El programa verifica la suposición del jugador y la compara con
		 * el número aleatorio generado previamente.
		 * 
		 * Hay tres posibles resultados: Si la suposición del jugador es igual al número
		 * aleatorio, el juego termina, y el jugador recibe un mensaje de felicitación.
		 * Si la suposición es menor que el número aleatorio, se le informa al jugador
		 * que el número es mayor y se le permite realizar otra suposición. Si la
		 * suposición es mayor que el número aleatorio, se le dice al jugador que el
		 * número es menor y se le permite realizar otra suposición.
		 * 
		 * Iteración: El juego continúa en un ciclo hasta que el jugador adivine
		 * correctamente el número. Cada vez que el jugador realiza una suposición
		 * incorrecta, se le brinda una pista para ayudarlo a acercarse al número
		 * correcto. Fin del Juego: Cuando el jugador adivina correctamente el número,
		 * el juego muestra la cantidad de intentos que le llevó al jugador adivinarlo.
		 * Luego, el juego termina, y el jugador puede decidir si desea jugar nuevamente
		 * o no.
		 * 
		 */

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	   ///////////////////////////////////////////////////								  ////////////////////////////////////////////////////
	  ///////////////////////////////////////////////////   	   M  A  I  N			 ////////////////////////////////////////////////////
	 ///////////////////////////////////////////////////								////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("*********************************************************");

		//Realizamos la primera partida, tras ello comprobamos si el usuario quiere seguir jugando
		do {
			try {
				juego();
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("");
			System.out.println("------------ ¿QUIERE VOLVER A JUGAR? (s/n) -------------");
			System.out.println("");
			
		} while (repetirJuego());
		
		//El juego ha finalizado
		System.out.println("");
		System.out.println("¡Gracias por jugar!");
		System.out.println();
		System.out.println("*********************************************************");
	}

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	   ///////////////////////////////////////////////								     //////////////////////////////////////////////////
	  ///////////////////////////////////////////////    F  U  N  C  I  O  N  E  S		//////////////////////////////////////////////////
	 ///////////////////////////////////////////////								   //////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	//Función que ejecuta una partida del juego
	public static void juego () throws Exception {
		Scanner sc = new Scanner(System.in);
		
		//Panel de inicio del juego
		System.out.println();
		System.out.println("	 ---------------------------------------- 			");
		System.out.println("	|           BIENVENIDO AL JUEGO          |			");
		System.out.println(" 	 ---------------------------------------- 			");
		System.out.println("");
		System.out.println("	     ...GENERANDO NÚMERO ALEATORIO...		");
		System.out.println();
		System.out.println("*********************************************************");
		
		int numUsuario = -1;
		int numAleatorio = (int) (Math.random()*100);
		int contador = 1;
		
		//Pedimos valores al usuario hasta que coincida con el valor aleatorio creado
		while(numUsuario != numAleatorio) {
			
			//Excepción si el usuario no introduce un número por pantalla
			try {
				System.out.print("Introduzca un numero --> ");
				numUsuario = sc.nextInt();
			} catch (InputMismatchException e) {
				System.err.println(e);
				throw new InputMismatchException("No se ha introducido un numero");
			}
			
			//Comprobamos si el valor del usuario esta en el rango y si es igual, mayor o igual que el valor aleatorio
			comprobarRango(numUsuario);
			comprobarValor(numAleatorio, numUsuario, contador);
			contador++;
		}		
	}

	//Función para comprobar si el valor introducido es mayor que 0 y menor que 99
	public static void comprobarRango (int numUsuario) throws Exception {
		if(numUsuario > 99 || numUsuario < 0) {
			throw new Exception("El número introducido debe estar entre 0 y 99");
		}
	}
	
	//Función para comprobar si el valor del usuario es el que buscamos ( si no lo es añade un intento al contador )
	public static void comprobarValor (int numAleatorio, int numUsuario, int contador) {
		if (numUsuario < numAleatorio) {
			System.out.println("El numero que buscas es mayor");
		} else if (numUsuario > numAleatorio){
			System.out.println("El numero que buscas es menor");			
		} else {
			System.out.println("-------------------------------------------------------- ");
			System.out.println("   ¡Felicidades! El número de intentos ha sido: " + contador );
			System.out.println("-------------------------------------------------------- ");
		}
	}
	
	//Función para comprobar la respuesta del usuario, se devuelve un booleano que se usará como condición de parada del bucle principal
	public static boolean repetirJuego () {
		Scanner sc = new Scanner(System.in);
		boolean repetirJuego = true;
		boolean repetirPregunta = true;
		
		while(repetirPregunta) {
			System.out.print("RESPUESTA --> ");
			String respuesta = sc.nextLine();
			
			if (respuesta.equalsIgnoreCase("s")) {
				return true;
			}else if (respuesta.equalsIgnoreCase("n")) {
				return false;
			}else {
				System.out.println("Debe responder con (s) SI, o (n) NO");
				repetirPregunta = true;
				
			}
		}
		return repetirJuego;
	}
}
	
	

