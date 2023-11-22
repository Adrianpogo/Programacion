package teoria;

import java.util.Random;

public class Aleatorios {

	public static void main(String[] args) {

		// Creamos un objeto de la clase Random importando java.util.Random
		Random rd = new Random();
		// Crea un entero desde el mínimo valor posible hasta el máximo
		rd.nextInt();
		// Crea un entero en un rango determinado --> Inicial incluido, final excluido
		rd.nextInt(0, 5);
		// Crea un booleano aleatorio (true o false)
		rd.nextBoolean();

		
		// 		-->  INT  <--
		System.out.println("\n------  INT  -----");
		System.out.println(rd.nextInt());
		System.out.println(rd.nextInt());
		System.out.println(rd.nextInt());
		System.out.println(rd.nextInt());
		
		
		
		//      -->  LONG  <--
		System.out.println("\n------  LONG  -----");
		System.out.println(rd.nextLong());
		System.out.println(rd.nextLong());
		System.out.println(rd.nextLong());
		System.out.println(rd.nextLong());
		
		
		
		//      -->  FLOAT  <--
		System.out.println("\n------  FLOAT  -----");
		System.out.println(rd.nextFloat());
		System.out.println(rd.nextFloat());
		System.out.println(rd.nextFloat());
		System.out.println(rd.nextFloat());

		

		
		
		//      -->  DOUBLE  <--
		System.out.println("\n------  DOUBLE  -----");
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextDouble());


		
		
	}
}
