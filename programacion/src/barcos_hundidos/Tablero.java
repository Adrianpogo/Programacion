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
	public void colocarBarco () {
		
	}
	
	// Función para disparar a una casilla del tablero
	public void dispararCasilla () {
		
	}
	
	// Función para mostrar el tablero
	public void mostrarTablero() {
		for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print( casillas[i][j] + " ");
            }
            System.out.println();
        }
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
