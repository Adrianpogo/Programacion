package ejercicios;

import java.awt.Taskbar.State;

public class Ejercicios1 {

	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println("--------------------------------------------------");
		System.out.println("|   EJERCICIO-1 DE FUNCIONES Y CONCATENACIONES:  |");
		System.out.println("--------------------------------------------------");
		
		String str1 = "178.5";
		String str2 = "1700";
		System.out.println("El primer string es: " + str1);
		System.out.println("El segundo string es: " + str2);
		double sumaDouble = sumaDoubles(str1, str2);
		System.out.println("La suma es igual a: " + sumaDouble);
		
		
		
		System.out.println("");
		System.out.println("--------------------------------------------------");
		System.out.println("|   EJERCICIO-2 DE FUNCIONES Y CONCATENACIONES:  |");
		System.out.println("--------------------------------------------------");
		int n1 = 1;
		int n2 = 12;
		System.out.println("El primer numero es: " + n1);
		System.out.println("El segundo numero es: " + n2);
		String cadena = concatencionInts(n1, n2);
		System.out.println("El string resultante es: " + cadena);

		
		
		System.out.println("");
		System.out.println("--------------------------------------------------");
		System.out.println("|   EJERCICIO-3 DE FUNCIONES Y CONCATENACIONES:  |");
		System.out.println("--------------------------------------------------");
		double n3=-3.5E14;
		String tipoMejor = tipoDeNum(n3);
		System.out.println("Para el numero " + n3 + " el mejor tipo de dato numerico es:" + tipoMejor);
		

	}
	
	
	
	
	//FUNCION QUE ACEPTE DOS STRING, LOS CONVIERTE A DOUBLE Y LOS SUMA
	public static double sumaDoubles (String txt1, String txt2) {
		double numDouble1 = Double.parseDouble(txt1);
		double numDouble2 = Double.parseDouble(txt2);
		double suma = numDouble1 + numDouble2;
		return suma;
				
	}

	//CONCATENAR DOS INT EN UN STRING Y DEVOLVERLO
	public static String concatencionInts (int num1, int num2) {
		String cadena1 = num1+"";
		String cadena2 = num2+"";
		String cadenaConcatenada= cadena1 + cadena2;
		return cadenaConcatenada;
	}
	
	//RECIBIR UN DOUBLE, DECIR QUE TIPO NUMERICO ES EL MAS ADECUADO POR TAMAÑO (IGNORAR LOS QUE TENGAN DECIMALES
	public static String tipoDeNum(double numero) {

		String tipoDato = " DOUBLE ";
		if (numero % 1 != 0) {
			tipoDato = " Tiene decimales, no se considera ";
			return tipoDato;
		} else if (numero >= Short.MIN_VALUE && numero <= Short.MAX_VALUE) {
			tipoDato = " SHORT ";
			return tipoDato;
		} else if (numero >= Integer.MIN_VALUE && numero <= Integer.MAX_VALUE) {
			tipoDato = " INT ";
			return tipoDato;
		} else if (numero >= Long.MIN_VALUE && numero <= Long.MAX_VALUE) {
			tipoDato = " LONG ";
			return tipoDato;
		}

		return tipoDato;
	}
	
	
	
	
}
