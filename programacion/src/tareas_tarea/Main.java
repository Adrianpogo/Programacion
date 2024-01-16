package tareas_tarea;

public class Main {

	public static void main(String[] args) {

		//Creamos las tareas
		Tarea tarea1 = new Tarea("Limpiar la vajilla");
		Tarea tarea2 = new Tarea("Fregar el suelo");
		Tarea tarea3 = new Tarea("Limpiar los cristales");
		Tarea tarea4 = new Tarea("Hacer la comida");
		Tarea tarea5 = new Tarea("Descansar");
		Tarea tarea6 = new Tarea("Hacer la cama");
		Tarea tarea7 = new Tarea("Ducharse");
		Tarea tarea8 = new Tarea("Lavarse los dientes");
		Tarea tarea9 = new Tarea("Planchar la ropa");
		
		//Creamos el conjunto de tareas de la casa
		Tareas tareasCasa = new Tareas();
		
		//Añadimos las tareas a la lista de las tareas
		tareasCasa.agregarTarea(tarea1);
		tareasCasa.agregarTarea(tarea2);
		tareasCasa.agregarTarea(tarea3);
		tareasCasa.agregarTarea(tarea4);
		tareasCasa.agregarTarea(tarea5);
		tareasCasa.agregarTarea(tarea6);
		tareasCasa.agregarTarea(tarea7);
		tareasCasa.agregarTarea(tarea8);
		tareasCasa.agregarTarea(tarea9);
		System.out.println("______________________________\n");
		
		//Mostramos todas las tareas
		tareasCasa.mostrarTodasLasTareas();
		System.out.println("______________________________\n");
		
		//Mostramos las tareas en x posiciones
		System.out.println("Tarea1: " + tareasCasa.obtenerTarea(1).getDescripcion()); 
		System.out.println("Tarea3: " +tareasCasa.obtenerTarea(3).getDescripcion()); 
		System.out.println("Tarea6: " +tareasCasa.obtenerTarea(6).getDescripcion()); 
		System.out.println("Tarea7: " +tareasCasa.obtenerTarea(7).getDescripcion()); 
		System.out.println("______________________________\n");
		
		//Marcamos tareas como hechas
		tareasCasa.marcarTareaComoCompletada(6);
		tareasCasa.marcarTareaComoCompletada(7);
		tareasCasa.marcarTareaComoCompletada(8);
		
		//Mostramos las tareas realizadas
		tareasCasa.mostrarTareasCompletadas();
		System.out.println("______________________________\n");
		
		//Mostramos las tareas pendientes
		tareasCasa.mostrarTareasPendientes();
		System.out.println("______________________________\n");
		
		//Mostramos el número de tareas pendientes
		System.out.println("El número de tareas pendientes es: " + tareasCasa.contarTareasPendientes());
		System.out.println("______________________________\n");
		
		//Eliminamos tareas realizadas
		tareasCasa.eliminarTarea(6);
		tareasCasa.eliminarTarea(7);
		tareasCasa.eliminarTarea(8);
		System.out.println("______________________________\n");
		
		//Mostramos de nuevo todas la tareas
		tareasCasa.mostrarTodasLasTareas();
		
		
	}

}
