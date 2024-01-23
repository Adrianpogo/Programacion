package frutasHerencia;

public class Fruta {
	
	private boolean semilla;
	private double peso;
	private String nombre;
	private String color;
	
	
	
	public Fruta(String nombre, double peso, String color, boolean semilla) {
		super();
		this.semilla = semilla;
		this.peso = peso;
		this.nombre = nombre;
		this.color = color;
	}



	public void mostrarInfo () {
		System.out.println("La fruta se llama: " + nombre);
		System.out.println("La fruta pesa: " + peso);
		System.out.println("La fruta es de color: " + color);
		System.out.println("La fruta tiene semilla: " + semilla);
	}
	
	
	public boolean isSemilla() {
		return semilla;
	}
	public void setSemilla(boolean semilla) {
		this.semilla = semilla;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
