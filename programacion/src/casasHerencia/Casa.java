package casasHerencia;

public class Casa {

	private String direccion;
	private int numHabitaciones;
	private double precio;
	
	
	public Casa(String direccion, int numHabitaciones, double precio) {
		super();
		this.direccion = direccion;
		this.numHabitaciones = numHabitaciones;
		this.precio = precio;
	}
	
	public void mostrarInfo () {
		System.out.println("Dirección: " + direccion);
		System.out.println("Número de habitaciones: " + numHabitaciones);
		System.out.println("Precio: " + precio);
		
	}
	
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumHabitaciones() {
		return numHabitaciones;
	}
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
