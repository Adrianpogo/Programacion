package tareas_tarea;

import java.util.ArrayList;

public class Tareas {

	/*
	 * Propiedades de Clase:
	 * 
	 * listaDeTareas: Una lista que almacena las tareas pendientes. Funciones:
	 * agregarTarea(Tarea tarea): Agrega una tarea a la lista de tareas.
	 * 
	 * marcarTareaComoCompletada(int indice): Marca una tarea como completada según
	 * su índice en la lista.
	 * 
	 * mostrarTareasPendientes(): Muestra todas las tareas pendientes en la lista.
	 * 
	 * mostrarTodasLasTareas(): Muestra todas las tareas, tanto pendientes como
	 * completadas.
	 * 
	 * eliminarTarea(int indice): Elimina una tarea específica de la lista de
	 * pendientes.
	 * 
	 * mostrarTareasCompletadas(): Muestra todas las tareas que han sido marcadas
	 * como completadas.
	 * 
	 * contarTareasPendientes(): Calcula el número total de tareas que aún están
	 * pendientes.
	 * 
	 * obtenerTarea(int indice): Obtiene una tarea específica por su índice en la
	 * lista.
	 * 
	 */

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// ATRIBUTOS
	private ArrayList<Tarea> listaDeTareas;

	// CONSTRUCTOR
	public Tareas() {
		listaDeTareas = new ArrayList<>();
	}

	// FUNCIONES
	// Función que añade una tarea a la lista de tareas
	public void agregarTarea(Tarea tarea) {
		listaDeTareas.add(tarea);
		System.out.println("Tarea añadida con éxito!");
	}

	// Función para marcar una tarea como completada según su índice
	public void marcarTareaComoCompletada(int indice) {
		if (indice >= 0 && indice < listaDeTareas.size()) {
			Tarea tarea = listaDeTareas.get(indice);
			tarea.marcarComoCompletada();
		} else {
			System.out.println("El índice de la tarea no es válido.");
		}
	}

	// Función para mostrar todas las tareas pendientes
	public void mostrarTareasPendientes() {
		System.out.println("Tareas sin completar: \n");
		int contador = 1;
		for (Tarea tarea : listaDeTareas) {
			if (!tarea.estaCompletada()) {
				System.out.println(contador + ": " + tarea.getDescripcion());
				contador++;
			}
		}
	}

	// Función para mostrar todas las tareas
	public void mostrarTodasLasTareas() {
		System.out.println("Tareas: \n");
		int contador = 1;
		for (Tarea tarea : listaDeTareas) {
			System.out.println(contador + "- " + tarea.getDescripcion());
			contador++;
		}
	}

	public void eliminarTarea(int indice) {
		if (indice <= listaDeTareas.size() && indice > 0) {
			listaDeTareas.remove(indice);
		}
		System.out.println("Se ha eliminado la tarea");
	}

	// Función para mostrar todas las tareas completadas
	public void mostrarTareasCompletadas() {
		System.out.println("Tareas completadas: \n");
		int contador = 1;
		for (Tarea tarea : listaDeTareas) {
			if (tarea.estaCompletada()) {
				System.out.println(contador + ": " + tarea.getDescripcion());
				contador++;
			}
		}
	}

	// Función para contabilizar las tareas pendientes
	public int contarTareasPendientes() {
		int contador = 0;
		for (Tarea tarea : listaDeTareas) {
			if (!tarea.estaCompletada()) {
				contador++;
			}
		}
		return contador;
	}

	public Tarea obtenerTarea(int indice) {
		if (indice >= 0 && indice < listaDeTareas.size()) {
			return listaDeTareas.get(indice);
		} else {
			System.out.println("El índice de la tarea no es válido.");
			return null;
		}
	}

}
