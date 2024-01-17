package barcos_hundidos;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
	
	//ATRIBUTOS
	private String nombre;
	private Tablero tablero;
	private List<Barco> barcos;
	

	//CONSTRUCTOR
	public Jugador (String nombre, int tamañoTablero) {
		this.nombre=nombre;
		this.tablero= new Tablero(tamañoTablero);
		this.barcos= new ArrayList<Barco>();
	}
	
	
	//MÉTODOS
	
	// Función para colocar barcos aleatoriamente en el tablero (se colocan 5 barcos)
	public void colocarBarcos() {
		
	}

	// Función para disparar a unas coordenadas
	public void disparar() {
		
	}

	// Función para mostrar el tablero del jugador
	public void mostrarTablero() {
		System.out.println("Tablero del jugador: " + nombre);
		tablero.mostrarTablero();
	}

	// Función para comprobar si todos sus barcos están hundidos
	public boolean todosBarcosHundidos() {
		return tablero.todosHundidos();
	}
	
	
	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Tablero getTablero() {
		return tablero;
	}
	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}
	public List<Barco> getBarcos() {
		return barcos;
	}
	public void setBarcos(List<Barco> barcos) {
		this.barcos = barcos;
	}
}
