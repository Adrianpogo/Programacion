package ejerciciosT2;

import java.util.HashMap;
import java.util.Scanner;

public class Votacion {

	public static void main(String[] args) {

		HashMap<String, Integer> votacion = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		int contador=0;
		System.out.println("---------------------------------");
		System.out.println("Los candidatos son los siguientes");
		System.out.println("\nCristian | Javier | Mario | Maria ");
		System.out.println("---------------------------------");
		votacion.put("cristian", 0);
		votacion.put("javier", 0);
		votacion.put("mario", 0);
		votacion.put("maria", 0);

		
		do {
			System.out.println("\nVotante número " + (contador+1) + " su voto es: ");
			pedirVoto(votacion, sc);
			contador++;
		}while (contador<10);
		
		resultado(votacion);
		
	}
	
	// Función para pedir un voto
	public static void pedirVoto(HashMap<String, Integer> votacion, Scanner sc) {
		
		try {
			String voto = sc.nextLine().toLowerCase();
			if(votacion.containsKey(voto)) {
				votacion.put(voto, (votacion.get(voto)+1));
			}else {
				System.out.println("Voto nulo");
			}
			
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
		}
	}
	
	// Función para devolver el resultado de las elecciones
	public static void resultado (HashMap<String, Integer> votacion) {
		int numMaximo = 0;
		String ganador = "" ;
		for(String clave : votacion.keySet()) {
			if(votacion.get(clave)>numMaximo) {
				numMaximo=votacion.get(clave);
				ganador = clave;
			}
			
		}
		System.out.println("\nRESULTADOS");
		System.out.println("______________________________________________");
		System.out.println("El ganador de las elecciones es: " + ganador + " con " + numMaximo + " votos");
		System.out.println();
		for(String clave : votacion.keySet()) {
			System.out.println(clave + ": " + votacion.get(clave) + " votos");
		}

	}

}
