package ejerciciosT2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class AccesoEdificio {

	public static void main(String[] args) {
		HashMap<Integer, Boolean> edificio = new HashMap<Integer, Boolean>();
		Random rd = new Random();
		boolean estaEnEdificio;

		// Generamos el estado de los 25 trabajadores de la empresa aleatoriamente
		for (int i = 0; i < 25; i++) {
			estaEnEdificio = rd.nextBoolean();
			edificio.put(i, estaEnEdificio);
		}
		
		// Mostramos la lista de empleados y su estado
		mostrarEmpleados(edificio);
		
		// Contamos cuantos empleados hay en el edificio
		int numEmpleados = numPersonaEnEdificio(edificio);
		System.out.println("\nEl número de empleados en el edificio es: " + numEmpleados);
		System.out.println("_______________________________________________");
	}

	// Función para contar cuantos empleados hay en el edificio
	public static int numPersonaEnEdificio(HashMap<Integer, Boolean> edificio) {
		int numEmpleados = 0;
		for (Integer clave : edificio.keySet()) {
			if (estaEnEdificio(edificio, clave)) {
				numEmpleados++;
			}
		}
		return numEmpleados;
	}

	// Función para comprobar si una tarjeta está en el edificio
	public static boolean estaEnEdificio(HashMap<Integer, Boolean> edificio, int clave) {
		if (edificio.get(clave) == true) {
			return true;
		}
		return false;
	}
	
	// Función para imprimir la lista de empleados y su estado
	public static void mostrarEmpleados(HashMap<Integer, Boolean> edificio) {
		System.out.println("-----------------------------------------------");
		for (Integer clave : edificio.keySet()) {
			System.out.println("ID: " + clave + " >>> " + edificio.get(clave));
		}
		System.out.println("-----------------------------------------------");
	}

}
