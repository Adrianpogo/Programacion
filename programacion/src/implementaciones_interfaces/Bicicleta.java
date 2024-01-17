package implementaciones_interfaces;

import interfaces.Vehiculo;

public class Bicicleta implements Vehiculo{

	
	// ATRIBUTOS
	private int velocidad;
	private boolean montado;

	///////////////////////////////////////////////////////////////////////////////////////////
	// CONSTRUCTOR
	public Bicicleta () {
		this.velocidad=0;
		this.montado=false;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS
	@Override
	public void encender() {
		System.out.println("Una bicicleta no se enciende");
	}

	@Override
	public void apagar() {
		System.out.println("Una bicicleta no se apaga");		
	}

	@Override
	public void acelerar(int velocidad) {
		if(isMontado()) {
			this.velocidad+=velocidad;
			System.out.println("Vas a " + this.velocidad + "km/h");
		}else {
			System.out.println("No estás montado aún");
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
	
	public void montarse() {
		if(isMontado()) {
			System.out.println("Ya estas montado");
		}else {
			montado=true;
			System.out.println("Te has montado en la bici");
		}
	}
	
	public void desmontarse () {
		if(!isMontado()) {
			System.out.println("Ya estas desmontado");
		}else if (velocidad==0) {
			montado=false;
			System.out.println("Te has desmontado");
		}else {
			System.out.println("Necesitas frenar completamente");
		}
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////
	// GET & SET
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public boolean isMontado() {
		return montado;
	}
	public void setMontado(boolean montado) {
		this.montado = montado;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Bicicleta bici = new Bicicleta();
		
		bici.encender();
		bici.apagar();
		
		bici.desmontarse();
		bici.acelerar(5);
		bici.montarse();
		bici.frenar();
		
		bici.acelerar(5);
		bici.acelerar(5);
		bici.acelerar(4);
		
		bici.frenar();
		
		bici.desmontarse();
		
		bici.frenar();
		bici.frenar();
		
		bici.montarse();
		bici.desmontarse();
	}

	

	

}
