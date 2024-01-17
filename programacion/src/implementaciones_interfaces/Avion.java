package implementaciones_interfaces;

import interfaces.Vehiculo;

public class Avion implements Vehiculo{

	//ATRIBUTOS
	private int velocidad;
	private boolean encendido;
	private boolean volando;
	
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
		if(isEncendido() && !isVolando()) {
			System.out.println("El avión está encendido, no se puede encender");
		}else {
			encendido=true;
			System.out.println("Se ha encendido el avión");
		}	
	}

	@Override
	public void apagar() {
		if(isEncendido() && velocidad==0 && !isVolando()) {
			encendido=false;
			System.out.println("Se ha apagado el avión");
		}else {
			System.out.println("El no se puede apagar por el momento");
		}
		
		
	}

	@Override
	public void acelerar(int velocidad) {
		if (isEncendido()) {
			this.velocidad+=velocidad;
			System.out.println("La velocidad es: " + this.velocidad);
		}else {
			System.out.println("Enciende primero el motor");
		}
	}

	@Override
	public void frenar() {
		if(velocidad>0) {
			velocidad -=5;
			if(velocidad<=0) {
				velocidad=0;
				System.out.println("Te has frenado por completo");
			}else {
				System.out.println("Vas a " + velocidad + "km/h");
			}
			
		}else {
			System.out.println("Estás parado, acelera primero");
		}
	}
	
	public void despegar () {
		if(isVolando()) {
			System.out.println("El avión ya está volando");
		}else {
			volando=true;
			System.out.println("El avión ha despegado");
		}
	}
	
	public void aterrizar () {
		if(isVolando()) {
			volando=false;
			System.out.println("EL avión ha aterrizado");
		}else {
			System.out.println("El avión ya está en tierra");
		}
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
	public boolean isVolando() {
		return volando;
	}
	public void setVolando(boolean volando) {
		this.volando = volando;
	}

	
	///////////////////////////////////////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		
	}

	
	
	
	

}
