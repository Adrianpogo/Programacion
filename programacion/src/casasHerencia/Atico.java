package casasHerencia;

public class Atico extends Casa{

	private int numPisos;
	
	public Atico(String direccion, int numHabitaciones, double precio, int numPisos) {
		super(direccion, numHabitaciones, precio);
		this.setNumPisos(numPisos);
	}

	@Override
	public void mostrarInfo () {
		super.mostrarInfo();
		System.out.println("El número de pisos es: " + numPisos);
	}
	
	
	
	public int getNumPisos() {
		return numPisos;
	}
	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

}
