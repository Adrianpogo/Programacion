package ejerciciosT1;

public class EjerciciosPractica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|        EJERCICIO-1           |");
		System.out.println("--------------------------------");
		System.out.println("IMPRIME EL NUMERO DE ESPACIOS DE LA CADENA");
		
		
		String cadena1 = "Hola buenos dias me llamo Adrian y tengo 23 años";
		System.out.println("La cadena dada es: " + cadena1);
		System.out.println();
		
		int contador = ejercicio1(cadena1);	
		System.out.println("El numero de espacios es: " + contador);
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|        EJERCICIO-2           |");
		System.out.println("--------------------------------");
		System.out.println("SUMA DOS NUMEROS ENTEROS");
		
		int n21 = 4;
		int n22 = 7;
		System.out.println("Los numero a sumar son: " + n21 + " y " + n22);
		System.out.println("");
		
		int resultado = ejercicio2(n21,n22);
		System.out.println("El resultado de la suma es: " + resultado);
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|        EJERCICIO-3           |");
		System.out.println("--------------------------------");
		System.out.println("MULTIPLICA Y DIVIDE DOS FLOATS");
		
		double d31 = 3456.76;
		double d32 = 0.0003;
		System.out.println("Los numero a operar son: " + d31 + " y " + d32);
		System.out.println("");
		
		double multiplicacion = ejercicio3M(d31,d32);
		double division = ejercicio3D(d31,d32);
		System.out.println("La multiplicación da: " + multiplicacion);
		System.out.println("La multiplicación da: " + division);

		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|        EJERCICIO-4           |");
		System.out.println("--------------------------------");
		System.out.println("CALCULA EL AREA DE UN CIRCULO");
		
		double radio = 4.7;
		double pi = 3.14;
		System.out.println("El radio del circulo es: " + radio + " m");
		System.out.println("");
		
		double area = ejercicio4(radio);
		System.out.println("El area del circulo es: " + area + " metros cuadrados");
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|        EJERCICIO-6           |");
		System.out.println("--------------------------------");
		System.out.println("DETERMINAR EL NUMERO MAYOR Y MENOR DE UN CONJUNTO DE 3");
		
		int n61 = 4;
		int n62 = 0;
		int n63= -4;
		System.out.println("Los numeros dados son: " + n61 + ", " + n62 + ", " + n63);
		System.out.println("");
		
		int mayor = ejercicio6(n61,n62,n63);
		System.out.println("El numero mayor es: " + mayor);
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|        EJERCICIO-7           |");
		System.out.println("--------------------------------");
		System.out.println("COMPROBAR SI UN NUMERO ES PARA O IMPAR");
		
		int n6 = 7;
		System.out.println("¿El numero " + n6 + " es par?");
		System.out.println("");
		
		ejercicio7(n6);
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|        EJERCICIO-8           |");
		System.out.println("--------------------------------");
		System.out.println("CONVERTIR TEXTO DE MAYUSCULAS A MINUSCULAS");

		String cadena8 = "Texto para convertir";
		System.out.println("El texto dado es el siguiente: " + cadena8);
		System.out.println("");
		
		String newCadena8 = ejercicio8(cadena8);
		System.out.println("El texto convertido es: " + newCadena8);
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|        EJERCICIO-9           |");
		System.out.println("--------------------------------");
		System.out.println("COMPROBAR SI UN CARACTER ES UNA VOCAL");
		
		char caracter9= 'E';
		System.out.println("El caracter es: " + caracter9);
		System.out.println("");
		
		System.out.println("¿Es una vocal ? --> " + ejercicio9(caracter9));
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|        EJERCICIO-10           |");
		System.out.println("--------------------------------");
		System.out.println("IMPRIMIR UN STRING EN ORDEN INVERSO");
		
		String cadena10 = "Hola buenos dias me llamo Adrian y tengo 23 años";
		System.out.println();
		String nuevaCadena10 = ejercicio10(cadena10);
		System.out.println(nuevaCadena10);
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|        EJERCICIO-11          |");
		System.out.println("--------------------------------");
		System.out.println("CUENTA LAS PALABRAS DE UNA FRASE");
		
		String cadena11 = "Hola buenos dias me llamo Adrian y tengo 23 años";
		System.out.println("La cadena dada es: " + cadena11);
		
		System.out.println();
		System.out.println("El numero de palabras es: " + ejercicio11(cadena11) );
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|        EJERCICIO-12          |");
		System.out.println("--------------------------------");
		System.out.println("VERIFICAR SI UN NUMERO ES PRIMO");
		
		int num12 = 13;
		System.out.println("EL numero dado es:" + num12);
		System.out.println();
		System.out.println("¿El numero es primo? --> " + ejercicio12(num12));
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|        EJERCICIO-13          |");
		System.out.println("--------------------------------");
		System.out.println("UN CONTADOR DE 10s");
		
		System.out.println();
		ejercicio13();
		
	}
	
	
	public static int ejercicio1 (String cadena1) {
		int contador = 0;
		for(int i = 0; i<cadena1.length();i++) {
			if (cadena1.charAt(i) == ' ') {
				contador +=1;
			}	
		}
		return contador;
	}
	
	public static int ejercicio2 (int n21, int n22) {
		return n21+n22;
	}
	
	public static double ejercicio3M (double d31,double d32) {
		return d31*d32;
	}
	
	public static double ejercicio3D (double d31,double d32) {
		return d31/d32;
	}
	
	public static double ejercicio4 (double d4) {
		double pi= 3.14;
		double area = pi* (d4*d4);
		return area;
	}
	
	public static int ejercicio6(int n61, int n62, int n63) {
		if (n61>n62 && n61>n63) {
			return n61;
		}else if (n62>n61 && n62>n63) {
			return n62;
		}
		return n63;
	}
	
	public static void ejercicio7 (int n7) {
		if (n7 % 2 == 0) {
			System.out.println("Si, es par");
		}
		System.out.println("No, no es par, es impar");
		
	}
	
	public static String ejercicio8 (String cadena8) {
		String newCadena8= cadena8.toUpperCase();
		return newCadena8;
	}
	
	public static boolean ejercicio9 (char caracter9) {
		boolean esVocal = false;
		switch (caracter9) {
		case 'a','A':
			esVocal = true;
			break;
		case 'e','E':
			esVocal = true;
			break;
		case 'i','I':
			esVocal = true;
			break;
		case 'o','O':
			esVocal = true;
			break;
		case 'u','U':
			esVocal = true;
			break;
		default:
			esVocal = false;
		}
		return esVocal;
	}
	
	public static String ejercicio10(String cadena10) {
		String nuevaCadena10 = "";
		for (int i = cadena10.length()-1 ; i>=0; i--) {
			nuevaCadena10 += cadena10.charAt(i);
			
		}
		return nuevaCadena10;
	}
	
	public static int ejercicio11 (String cadena11) {
		int contador11 = 0;
		for(int i = 0; i<cadena11.length();i++) {
			if (cadena11.charAt(i) == ' ') {
				contador11 +=1;
			}	
		}
		return contador11;
	}
	
	public static boolean ejercicio12 (int num12) {
		if(num12<1) {
			System.out.println("El numero es 0 o negativo");
		}
		
		for (int i = 2; i<num12; i++) {
			if (num12 % i == 0 ) {
				return false;
			}
		}
		return true;
	}

	public static void ejercicio13 () {
		for (int i = 10; i>=1 ; i-- ) {
			System.out.println("--> " + i);
		}
		System.out.println("¡¡BOOOM!!");
	}
}
