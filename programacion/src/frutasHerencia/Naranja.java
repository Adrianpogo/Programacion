package frutasHerencia;

public class Naranja extends Fruta{

	private int numGajos;
	
	public Naranja(int numGajos) {
		super("naranja", 135, "naranja", true);
		this.numGajos=numGajos;
	}

	public void mostrarInfo () {
		//Llamamos a la función padre para no perder la información de la función en la clase padre
		super.mostrarInfo();
		System.out.println("Tiene " + numGajos + " gajos");

	}
}
