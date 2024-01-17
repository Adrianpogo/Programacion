package barcos_hundidos;

public class Barco {

	//ATRIBUTOS
	private boolean hundido;
	private int posX;
	private int posY;
	
	
	//CONSTRUCTOR
	public Barco (int posX, int posY) {
		this.posX=posX;
		this.posY=posY;
		//EL barco inicialmente nunca esá hundido
		this.hundido=false;
	}
	
	//MÉTODOS
	
	//Función para comprobar si un barco está hundido
	public boolean estaHundido () {
		return hundido;
	}
	
	//Función para hundir un barco
	public void hundirBarco() {
		hundido=true;
	}
	
	//Función para comprobar si un barco está en una posición determinada
	public boolean estaEnPosicion (int X, int Y) {
		return (posX == X && posY==Y);
	}
	
	//GETTERS & SETTERS
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
}
