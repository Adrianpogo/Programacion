package ejerciciosT1;

public class Ejercicios4 {

	public static void main(String[] args) {
	

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	   ///////////////////////////////////////////////////								  ////////////////////////////////////////////////////
	  ///////////////////////////////////////////////////   	   M  A  I  N			 ////////////////////////////////////////////////////
	 ///////////////////////////////////////////////////								////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("--------------------------------");
		System.out.println("|          EJERCICIO-1         |");
		System.out.println("--------------------------------");
		System.out.println("Sumar los digitos de un numero por parametros");
		System.out.println("");
		
		int numero = 67451 ;
		System.out.println("El numero dado es: " + numero);
		int resultado = sumaDigitos(numero);
		System.out.println("La suma de sus digitos es: " + resultado);
		int resultado2 = sumaDigitosString(numero);
		System.out.println("La suma de sus digitos es: " + resultado2);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|          EJERCICIO-2         |");
		System.out.println("--------------------------------");
		System.out.println("Comprobar si un numero es palíndromo");
		System.out.println("");
		
		int numero1 = 6776 ;
		int numero2 = 67576 ;
		int numero3 = 674576 ;
		System.out.println("Los numeros dados son: " + numero1 + ", " + numero2 + ", " + numero3);
		
		System.out.println(numero1 + "--> " + esPalindromo(numero1));
		System.out.println(numero2 + "--> " + esPalindromo(numero2));
		System.out.println(numero3 + "--> " + esPalindromo(numero3));
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|          EJERCICIO-3         |");
		System.out.println("--------------------------------");
		System.out.println("¿Cuál es el elemento un posición en particular de la serie de Fibonacci");
		System.out.println("");
		
		System.out.println("En la posición 10: " + fibonacci(10));
		
		
	}
	
	

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////								     //////////////////////////////////////////////////
  ///////////////////////////////////////////////    F  U  N  C  I  O  N  E  S		//////////////////////////////////////////////////
 ///////////////////////////////////////////////								   //////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Función para sumar los dígitos de un número (mediante método numérico)
	public static int sumaDigitos(int numero) {

		int resultado = 0;
		// Convertimos en String el número pasado por parámetros para saber su longitud
		String cadena = numero+"";
		int longitud = cadena.length();
		
		// Guardamos el último valor haciendo módulo 10 y luego dividimos entre 10 para eliminar ese último dígito
		for (int i = 0; i < longitud; i++) {
			resultado +=numero % 10;
			numero /= 10;	
		}		
		return resultado;
		
	}
	
	// Función para sumar los dígitos de un número (mediante propiedades de String)
	public static int sumaDigitosString (int numero) {
		String numeroS = numero + "";
		int resultado = 0;
		// Recorremos la cadena y cremos substrings para almacenar un caracter como String, convertimos ese String a 
		// número y lo almacenamos en la variable resultado
		for (int i = 0; i < numeroS.length(); i++) {
			String caracter = numeroS.substring(i, i+1);
			int num = Integer.parseInt(caracter) ;
			resultado += num;
		}
		return resultado;
	}

	// Función para comprobar si un número es palíndromo
	public static boolean esPalindromo(int numero) {
		String numeroS = numero + "";
		// Creamos dos variables para ir comparando de principio a final (a una le sumaremos y a la otra le restaremos)
		int iIzq = 0;
		int iDer = numeroS.length()-1;
		// Recorremos la mitad de la longitud del String comparando los elementos en posiciones simétricas
		// En caso de ser impar, el valor central no se considera
		for (int i = 0 ; i < numeroS.length()/2; i++) {
			char a = numeroS.charAt(iIzq);
			char b = numeroS.charAt(iDer);
			// En caso de que los elementos sean diferentes no es palíndromo
			if (a != b) {
				return false;
			}
			iIzq +=1;
			iDer -=1;
		}
		// Si en ningún momento detecta que no es palíndromo significa que sí que lo es
		return true;
		
	}
	
	//Funcion Palíndromo (Otra versión)
	/*
	 * public static boolean esPalindromo(int numero) {
	 * 		String numeroS = numero + "";
	 * 		String reverso = "";
	 * 		for (int i = numeroS.lenght -1 ; i<=0; i--){
	 * 			reverso += numeroS.charAt(i)
	 * 		}
	 * 		return numeroS.equals(reverso);
	 * }
	 * 
	 * */
	
	//Función que devuelve el valor de la sucesión de Fibonacci en una posición pasada por parametros
	public static int fibonacci (int num) {
		//Variables con los valores del caso base
		int x = 0;
		int y = 1;
		
		int resultado = 0;
		//Varible contador del while (empieza en la posicion 1)
		int i = 1;
		
		//Hacemos la suma de los primeros valores (caso base) y los alamacenamos en una variable, luego reasignamos la
		//variables para la siguiente iteración. Lo hacemos mientras que el iterador sea menor que la posición que queremos mostrar
		do {
			resultado = x+y;
			y = x;
			x = resultado;
			i++;
		}while (i <= num);
		
		return resultado;
	}

}
