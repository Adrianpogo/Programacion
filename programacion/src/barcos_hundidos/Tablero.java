package barcos_hundidos;

public class Tablero {
	
	//ATRIBUTOS
	private int tamaño;
	private char[][] casillas;
	
	// CONSTRUCTOR
	public Tablero(int tamaño) {
		this.tamaño = tamaño;
		this.casillas = new char[tamaño][tamaño];

		// Una vez tenemos creada la matriz del tamaño deseado, la inicializamos conAGUA (-)
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				casillas[i][j] = '-';
			}
		}
	}
	
	//MÉTODOS
	
	// Función para colocar un barco en el tablero
	public boolean colocarBarco(int fila, int columna) {
		// Verificamos que la posición esté dentro de los límites del tablero
		if (fila < 0 || fila >= tamaño || columna < 0 || columna >= tamaño) {
			return false;
		}
		// Colocamos el barco si hay agua, si no no
		if (casillas[fila][columna] == '-') {
			casillas[fila][columna] = 'O'; 
			return true;
		} else {
			return false; 
		}
	}

	// Función para disparar a una casilla del tablero
	public void dispararCasilla () {
		/*
		 * 
		 * 
		 * 
		 * 
		 * 		COMPLETAR
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
	}
	
	// Función para mostrar el tablero
	public void mostrarTablero() {
		for (int i = 0; i < tamaño; i++) {
			System.out.print("         ");
            for (int j = 0; j < tamaño; j++) {
                System.out.print( casillas[i][j] + "  ");
            }
            System.out.println();
        }
		System.out.println();
	}
	
	// Función para mostrar el tablero sin enseñar los barcos sin hundir
	public void mostrarTableroJuego() {
		for (int i = 0; i < tamaño; i++) {
			System.out.print("         ");
            for (int j = 0; j < tamaño; j++) {
            	if(casillas[i][j]!='O') {
            		System.out.print( casillas[i][j] + "  ");
            	}else {
            		System.out.print("-  ");
            	}
                
            }
            System.out.println();
        }
		System.out.println();
	}
	
	// Función para verificar ha ganado (todos barcos hundidos)
	public boolean todosHundidos () {
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				if(casillas[i][j] == 'O') {
					return false;
				}
			}
		}
		return true;
	}
	
	
	
	//GETTERS & SETTERS
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public char[][] getCasillas() {
		return casillas;
	}
	public void setCasillas(char[][] casillas) {
		this.casillas = casillas;
	}
	
	
}
