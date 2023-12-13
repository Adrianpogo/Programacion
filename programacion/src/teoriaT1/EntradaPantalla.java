package teoriaT1;

import java.util.Scanner;

public class EntradaPantalla {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Bienvenido " + nombre + " para usar la calculadora tenga en cuenta que los número decimales se introducen con ','");
		System.out.println();
		System.out.println("¿Qué desea? --> presione el numero de la opción");
		System.out.println("1. Sumar dos numeros");
		System.out.println("2. Restar dos numeros");
		System.out.println("3. Multiplicar dos numeros");
		System.out.println("4. Dividir dos numeros");
		System.out.println("- Cualquer otro numero para cerrar -");
		
		int opcion = sc.nextInt();
		
		System.out.print("Introduce el primer valor: ");
		double n1 = sc.nextDouble();
		System.out.print("Introduce el segundo valor: ");
		double n2 = sc.nextDouble();
	
		switch (opcion) {
		case 1: {
			suma(n1, n2);			
			break;
		}
		case 2: {
			resta(n1, n2);			
			break;
		}
		case 3: {
			multiplicacion(n1, n2);	
			break;
		}
		case 4: {
			division(n1, n2);
			break;
		}
		default:
			System.out.println("No ha pulsado ninguna opción existente, adios.");
		}
		
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	   ///////////////////////////////////////////////								     //////////////////////////////////////////////////
	  ///////////////////////////////////////////////        E J E R C I C I O S 		//////////////////////////////////////////////////
	 ///////////////////////////////////////////////								   //////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

	}

	
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	   ///////////////////////////////////////////////								     //////////////////////////////////////////////////
	  ///////////////////////////////////////////////    F  U  N  C  I  O  N  E  S		//////////////////////////////////////////////////
	 ///////////////////////////////////////////////								   //////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void suma(double n1, double n2) {
		System.out.println("El resultado es: " + (n1+n2));
	}

	public static void resta(double n1, double n2) {
		System.out.println("El resultado es: " + (n1-n2));
	}

	public static void multiplicacion(double n1, double n2) {
		System.out.println("El resultado es: " + (n1*n2));
	}

	public static void division(double n1, double n2) {
		System.out.println("El resultado es: " + (n1/n2));
	}
	
}
