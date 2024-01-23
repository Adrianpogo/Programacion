package animalesHerencia;

public class Main {

	public static void main(String[] args) {
		
		Animal a = new Animal("Serpiente", 4);
		Perro p1 = new Perro("Milo", 12, "Labrador");
		Gato g1 = new Gato("Luna", 2);
		
		hacerSonido(a);
		hacerSonido(p1);
		hacerSonido(g1);
		System.out.println("\n---------------\n");
		a.comer();
		p1.comer();
		g1.comer();
		System.out.println("\n---------------\n");
		g1.arañar();
		p1.perseguirCola();
		
		
	}
	
	public static void hacerSonido (Animal a) {
		a.emitirSonido();
	}

}
