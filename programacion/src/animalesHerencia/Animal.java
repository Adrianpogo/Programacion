package animalesHerencia;

public class Animal {

	private String nombre;
	private int edad;
	
	//Constructor
	public Animal(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void emitirSonido () {
		System.out.println("Emitiendo sonido...");
	}
	
	public void comer () {
		System.out.println("Comiendo...");
	}

	//Get&Set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
