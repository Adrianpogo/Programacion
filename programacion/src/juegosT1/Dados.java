package juegosT1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String respuesta = "";
		boolean continuar = false;

		System.out.println("   -- > BIENVENIDO AL DADO  <--   ");
		System.out.println("----------------------------------");

		do {
			System.out.print("\n¿De cuántas caras desea el dado? --> ");

			int opcion = opcionDado(sc);
			int resultado = resultadoDado(opcion,rd);

			System.out.println("\nUsted ha obtenido un ...  ¡ " + resultado + " !");
			if(resultado == opcion) {
				System.out.println("¡MÁXIMA PUNTUACIÓN!");
			}else if (resultado == 1) {
				System.out.println("Hoy no es tu día de suerte...");
			}
			System.out.println("\n------------------------------------");

			System.out.print("¿Desea continuar jugando? (s/n) --> ");
			sc.nextLine();
			continuar = continuarJuego(sc);
			
			
		}while(continuar);
		
	}

	// Función para seguir jugando
	public static boolean continuarJuego (Scanner sc) {
		String respuesta = sc.nextLine();
		
		if (respuesta.equals("s")) {
			return true;
		}else if (respuesta.equals("n")) {
			System.out.println("\n¡Hasta la próxima!");
			return false;
		}else {
			System.out.print("\nNo te he entendido... Responda 's' o 'n' -->");
			return continuarJuego(sc);
		}
	}
	
	
	// Función para escoger cuántas caras tendrá nuestro dado
	public static int opcionDado(Scanner sc) {
		int opcion;
		try {
			opcion = sc.nextInt();
			if (opcion < 2 || opcion > 20) {
				System.err.print("¡El dado puede ser de 2 a 20! --> ");
				return opcionDado(sc);
			}
		} catch (InputMismatchException e) {
			sc.nextLine();
			System.err.println("\nERROR: debe introducir un número " + e);
			System.out.print("Vuelva a intentarlo --> ");
			return opcionDado(sc);
		}
		return opcion;
	}

	// Función para obtener el resultado de la tirada del dado con las caras pasadas
	// por parámetro
	public static int resultadoDado(int opcion, Random rd) {
		int resultado = rd.nextInt(1,opcion+1);
		return resultado;
	}

}
