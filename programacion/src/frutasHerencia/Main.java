package frutasHerencia;

public class Main {

	public static void main(String[] args) {

		Fruta f = new Fruta("platano", 80, "amarillo", false);
		f.mostrarInfo();
		System.out.println("\n---------------------------\n");
		Naranja n = new Naranja(8);
		n.mostrarInfo();
		
		System.out.println("\n---------------------------\n");
		peditFruta(n);
	}
	
	//Aunque le pasemos una naranja, va a imprimir la información de la naranja en concreto
	//Si en parametros pidiesemos Naranja, daria fallo al pasarle a la función una fruta genérica
	public static void peditFruta (Fruta f) {
		f.mostrarInfo();
	}

}
