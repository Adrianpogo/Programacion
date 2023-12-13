package teoriaT1;

public class VariablesBasicas {

	public static void main(String[] args) {
		
		//Comentario de una linea
		
		/*
		 * 
		 * Comentario de varias lineas 
		 * 
		 * */
		
		//Variable tipo numero y valor 1
		int numero = 1 ; 
		
		//Variable decimal
		float decimal = 1.5f;
		
		//Variable short (solo 2 bytes de info, mas pequeño que el int)
		short nPequeño = 1;
		
		//Variable double (variante grande del float)
		double dGrande = 1894.93246f;
		
		//Variable boolena (puede ser true o false)
		boolean booleano = true;
		
		//Variable tipo texto
		char caracter = 'a';  //En este caso es para un solo caracter
		
		//Variable tipo texto (conjunto de caracteres)
		String texto = "texto";
		
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
		
		
		//Hacemos una operaciones, declaramos de formas diferentes (ambas validas)
		int n1, n2 ;
		n1 = 1;
		n2 = 2;
		int n3 = 3, n4 = 4;
		
		int suma = n1+ n2;
		int resta = n3-n4;
		int mult = n1*n3;
		float div = n4/n2; //Con decimales
		
		System.out.println("Imprimimos ejemplos de operaciones"); 
		System.out.println(suma); //Imprimimos por pantalla
		System.out.println(resta); 
		System.out.println(mult); 
		System.out.println(div); 
		
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

		
//Ejercicio1 - declarar 3 varibles de cada dipo
		
		//Declaramos variables numericas enteras
		int numero1 = 1; 
		int cero = 0;
		int largo = 1000000000; //Un cero mas sale del rango (max = 2147483647)(min = - 2147483647)
		long masLargo = 1000000000; //El tipo double permite mas numero (max= 9223372036854775807)
		
		
		//Declaramos variables numericas decimales
		float decimal1 = 1.5f;
		float decimal2 = 0.0f;
		float decimal3 = 100000.000000f;
		
		//Declaramos variables booleanas
		boolean esTrue = true;
		boolean esFalse = false;
		
		//Declaramos variables caracter
		char caracter1 = 'a';
		char numero2 = '2';
		char interrogacion = '?';
		
		//Declaramos variable texto
		String texto1 = "Esto es un texto";
		String sumamos = "1 + 1 = 2";
		String letra = "a";
		
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////		

		
//Ejercicio2 - Imprime las variables anteriores
		System.out.println("Imprimimos los datos del Ejercicio2" ); 
		System.out.println(numero1); 
		System.out.println(cero); 
		System.out.println(largo); 
		System.out.println(decimal1); 
		System.out.println(decimal2); 
		System.out.println(decimal3); 
		System.out.println(esTrue); 
		System.out.println(esFalse); 
		System.out.println(caracter); 
		System.out.println(numero2); 
		System.out.println(interrogacion); 
		System.out.println(texto1);
		System.out.println(sumamos);
		System.out.println(letra); 



		
	}

}
