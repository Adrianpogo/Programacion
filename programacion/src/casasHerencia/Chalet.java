package casasHerencia;

public class Chalet extends Casa {

	private int tamañoJardin;

	public Chalet(String direccion, int numHabitaciones, double precio, int tamañoJardin) {
		super(direccion, numHabitaciones, precio);
		this.tamañoJardin = tamañoJardin;
	}

	@Override
	public void mostrarInfo () {
		super.mostrarInfo();
		System.out.println("Tamaño del jardín: " + tamañoJardin);
	}

	public void mostrarPiscina () {
		System.out.println("El chalet tiene piscina");
	}
	
	public int getTamañoJardin() {
		return tamañoJardin;
	}

	public void setTamañoJardin(int tamañoJardin) {
		this.tamañoJardin = tamañoJardin;
	}

}
