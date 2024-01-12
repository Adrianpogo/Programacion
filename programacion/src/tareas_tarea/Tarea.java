package tareas_tarea;

public class Tarea {
	
	/*
	Propiedades de Clase:

		descripcion: Una cadena que almacena la descripción de la tarea.
		completada: Un booleano que indica si la tarea está completada o no.

	Funciones:
		
		getDescripcion(): 
			Devuelve la descripción de la tarea.
		
		estaCompletada(): 
			Comprueba si la tarea está marcada como completada.
		
		marcarComoCompletada(): 
			Marca la tarea como completada.

	 */

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//ATRIBUTOS
	private String descripcion;
	private boolean completada;
	
	//CONSTRUCTOR
	public Tarea (String descripcion) {
		this.descripcion=descripcion;
		this.completada = false;
	}

	//FUNCIONES	
	public String getDescripcion() {
		return descripcion;
	}
	
	public boolean estaCompletada () {
		return completada;
	}
	
	public void marcarComoCompletada() {
		completada=true;
	}
	
}
