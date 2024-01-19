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
		for (int i = 0; i < 5; i++) {
            int fila, columna;
            do {
                // Genera posiciones aleatorias hasta encontrar una casilla vacía
                fila = (int) (Math.random() * tablero.getTamaño());
                columna = (int) (Math.random() * tablero.getTamaño());
            } while (!sePuedeColocar(fila, columna));

            Barco barco = new Barco(fila, columna);
            barcos.add(barco);
            tablero.colocarBarco(fila, columna);
        }	
	}
	
	//Función para comprobar si se puede colocar un barco en una posición
	public boolean sePuedeColocar (int X, int Y) {
		for (Barco barco : barcos) {
			// No se puede colocar si hay un barco en esa posición
            if (barco.getPosX()==X && barco.getPosY()==Y) {
                return false; 
            }
        }
        return true;
	}

	// Función para disparar a unas coordenadas y ver si el barco ha sido hundido
	public boolean disparar(int X, int Y) {
		if(getTablero().dispararCasilla(X-1, Y-1)) {
        	for(Barco barco: barcos) {
        		if(barco.estaEnPosicion(X-1, Y-1)) {
        			barco.hundirBarco();
        			return true;
        		}
        	}
        	
        }else {
        	System.out.println("Disparo inválido --> Coordenadas imposibles // Coordenadas repetidas");
        }
		return false;
        
	}

	// Función para mostrar el tablero del jugador
	public void mostrarTablero() {
		System.out.println(nombre + "\n");
		tablero.mostrarTablero();
	}
	
	public void mostrarTableroJuego() {
		System.out.println(nombre + "\n");
		tablero.mostrarTableroJuego();
	}

	// Función para comprobar si todos sus barcos están hundidos
	public boolean todosBarcosHundidos() {
		return tablero.todosHundidos();
	}
	
	public int barcosHundidosJugador () {
		return tablero.barcosHundidos();
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
