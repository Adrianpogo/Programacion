package animalesHerencia;

public class Perro extends Animal{

	private String raza;
	
	public Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.setRaza(raza);
	}
	
	@Override
	public void emitirSonido() {
		System.out.println("El perro " + super.getNombre() + " ladra");
	}
	
	public void perseguirCola () {
		System.out.println("El perro " + super.getNombre() + " se persigue la cola");
	}

	//Get&Set
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}

}
