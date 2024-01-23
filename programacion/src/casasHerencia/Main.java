package casasHerencia;

public class Main {

	public static void main(String[] args) {

		Casa casaGenerica = new Casa("Plaza Colon, 2", 3, 124.99);
		
		Chalet chalet = new Chalet("Avenida Gimenez, 20", 5, 200.50, 10);
		Cabaña cabaña = new Cabaña("Calle Orovilla, 17", 2, 74.55, true);
		Atico atico = new Atico("Rua Venavides, 45", 4, 454.99, 2);
		
		pedirInfo(casaGenerica);
		pedirInfo(chalet);
		pedirInfo(cabaña);
		pedirInfo(atico);
	}

	
	public static void pedirInfo (Casa c) {
		System.out.println("\n---------  INFO  --------\n");
		c.mostrarInfo();
		System.out.println("\n-------------------------\n");
	}
}
