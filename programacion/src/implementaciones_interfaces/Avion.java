package implementaciones_interfaces;

import interfaces.Vehiculo;

public class Avion implements Vehiculo{

	//ATRIBUTOS
	private int velocidad;
	private boolean encendido;
	
	///////////////////////////////////////////////////////////////////////////////////////////
	//CONSTRUCTOR
	public Avion () {
		this.velocidad=0;
		this.encendido=false;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	//MÉTODOS
	@Override
	public void encender() {
		
	}

	@Override
	public void apagar() {
		
	}

	@Override
	public void acelerar(int velocidad) {
		
	}

	@Override
	public void frenar() {
		
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	//GET & SET
	
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		
	}

	
	
	

}
