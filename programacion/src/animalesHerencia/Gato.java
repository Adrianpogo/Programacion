package animalesHerencia;

public class Gato extends Animal{

	public Gato(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	public void emitirSonido() {
		System.out.println("El gato " + super.getNombre() + " maulla");
	}

	public void arañar () {
		System.out.println("El gato " + super.getNombre() + " araña");
	}
}
