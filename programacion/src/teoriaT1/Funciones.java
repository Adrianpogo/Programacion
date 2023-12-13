package teoriaT1;


public class Funciones {

	public static void main(String[] args) {
		
		// INVOCAMOS A LA FUNCION
		saludar();
		decirNombre("Adrian", 23);
		// AL DEVOLVER UN VALOR INT ESTE NO SE IMPRIME A NO SE QUE LLAMEMOS NOSOTROS A LA IMPRESIÓN O LO GUARDEMOS EN UNA VARIABLE POR EJEMPLO
		System.out.println("El área de un cuadrado es: " + areaCuadraro(5)); 
		
		
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|   EJERCICIO-1 DE FUNCIONES:  |");
		System.out.println("--------------------------------");
		
		saludarString();
		saludarInt();
		saludarChars();
		saludarLong();
		saludarDouble();
		
		
		
		System.out.println("--------------------------------");
		System.out.println("|   EJERCICIO-2 DE FUNCIONES:  |");
		System.out.println("--------------------------------");
		
		String txt = "Texto de ejemplo";
		System.out.println("El String dado es --> " + txt);
		char primerCaracter = primerCaracter(txt);
		System.out.println("El primer caracter del texto es: " + primerCaracter);
		char ultimoCaracter = ultimoCaracter(txt);
		System.out.println("El ultimo caracter del texto es: " + ultimoCaracter);
		
		
		
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|   EJERCICIO-3 DE FUNCIONES:  |");
		System.out.println("--------------------------------");
		
		int numero = 1;
		System.out.println("El numero dado es: " + numero);
		boolean esPar = esPar(numero);
		System.out.println("¿Es par? --> " + esPar);
		boolean esImPar = esImPar(numero);
		System.out.println("¿Es impar? --> " + esImPar);
		
		
		
		
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|   EJERCICIO-4 DE FUNCIONES:  |");
		System.out.println("--------------------------------");
		
		String texto1 = "Me llamo Raul";
		String texto2 = "Me llamo Alex";
		System.out.println("El primer String es: " + texto1);
		System.out.println("El segundo String es: " + texto2);
		boolean sonIguales = textoIgual(texto1, texto2);
		System.out.println("¿Son iguales? --> " + sonIguales);
		
		
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|   EJERCICIO-5 DE FUNCIONES:  |");
		System.out.println("--------------------------------");
		//REUTILIZAMOS TEXTO1 Y TEXTO2 DEL EJ ANTERIOR
		System.out.println("El primer String es: " + texto1);
		System.out.println("El segundo String es: " + texto2);
		if(mismaLongitud(texto1,texto2)) {
			String newTexto1 = convertirTexto(texto1,texto2);
			System.out.println("El nuevo primer String es" + newTexto1);
		}else {
			System.out.println("Los textos no miden lo mismo");
		}
		
		
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|   EJERCICIO-6 DE FUNCIONES:  |");
		System.out.println("--------------------------------");
		//REUTILIZAMOS EL TEXTO1
		int indice = 13;
		System.out.println("El string es: " + texto1);
		System.out.println("El indice es: " + indice);
		char caracterEnPos = caracterEnPoscion(texto1, indice);
		System.out.println(caracterEnPos);
	
		
		
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|   EJERCICIO-7 DE FUNCIONES:  |");
		System.out.println("--------------------------------");
		double celsius = 22.4;
		double fahrenheit = celsiusToFahrenheit(celsius);
		System.out.println(celsius + " ºC = " + fahrenheit + " ºF" );	
	
		
		
		
		
	}
	
	
	
	
	
	// DECLARAMOS UNA FUNCION VOID (NO RETORNA UN VALOR COMO TAL) --> POR AHORA LAS VARIABLES EN UN FUNCION SON SOLO LOCALES	
	public static void saludar () {
		System.out.println("Hola");
	}
	
	//DECLARAMOS UNA FUNCION CON PARAMETROS
	public static void decirNombre (String nombre, int edad) {	
		System.out.println("Hola buenos dias soy " + nombre + " y tengo " + edad + " años");	
	}	
	
	public static int areaCuadraro (int lado) {
		return lado*lado;
	}
	
	
	
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////										   //////////////////////////////////////////////////////////
///////////////////////////////////////        		EJERCICIO-1 FUNCIONES         ///////////////////////////////////////////////////////////
//////////////////////////////////////											 ////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	//CREA UNA FUNCION PARA CADA TIPO DE DATO --> DECLARCION, MODIFICACION, IMPRESIÓN
			
	public static void saludarInt () {	
		 int numeroInt = 10;
		 System.out.println("El numero int es: " + numeroInt);
		 int factorial=1; 
		 for (int i=numeroInt;i>0;i--) {
			 factorial=factorial*i;
		 }
		 System.out.println("El factorial de " + numeroInt + " es: " + factorial);
		 System.out.println("");			
	}
			
	public static void saludarLong () {
		long numeroLong = 100000;
		System.out.println("El numero long inicial es: " + numeroLong);	
		for (int i =1; i<=numeroLong; i++) {
			if(numeroLong/2 == i) {
				System.out.println("El nuevo numero es la mitad del anterior: " + i);
			}
		}
		System.out.println("");
	}
			
	public static void saludarDouble () {
		double numeroDouble = 0.00001;
		System.out.println("El numero double inicial es: " + numeroDouble);
		
		if(numeroDouble>0) {
			numeroDouble *= -1;
			System.out.println("El nuevo numero double con signo negativo es: " +  numeroDouble);
		}
		
		System.out.println("");
	}

	public static void saludarChars () {
		char caracter = 'A';
		System.out.println("El char inicial es: " + caracter);
		switch (caracter) {
		case 'A':
			caracter = 'B';
			System.out.println("La siguiente consonante en el abecedario es: " + caracter);
			break;
		case 'E':
			caracter = 'F';
			System.out.println("La siguiente consonante en el abecedario es: " + caracter);
			break;
		case 'I':
			caracter = 'J';
			System.out.println("La siguiente consonante en el abecedario es: " + caracter);
			break;
		case 'O':
			caracter = 'P';
			System.out.println("La siguiente consonante en el abecedario es: " + caracter);
			break;
		case 'U':
			caracter = 'V';
			System.out.println("La siguiente consonante en el abecedario es: " + caracter);
			break;
		default :
			System.out.println("No es una de las vocales");
		}
		System.out.println("");
	}

	public static void saludarString () {
		String txt = "Esto es un String";
		System.out.println("El texto inicial es: " + txt);
		String newTxt = txt.toLowerCase().replace("s", "-");
		System.out.println("El nuevo texto sin 's' es: " + newTxt );	
		System.out.println("");
	}

	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////										   //////////////////////////////////////////////////////////
///////////////////////////////////////        		EJERCICIO-2 FUNCIONES         ///////////////////////////////////////////////////////////
//////////////////////////////////////											 ////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			

	// CREA UNA FUNCION QUE DEVUELVA EL PRIMER CARACTER DE UN STRING PASADO POR PARAMETROS
	
	public static char primerCaracter (String txt) {
		char caracter = txt.charAt(0);
		return caracter;
	}
	
	public static char ultimoCaracter (String txt) {
		char caracter = txt.charAt(txt.length()-1);
		return caracter;
	}
	
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////										   //////////////////////////////////////////////////////////
///////////////////////////////////////        		EJERCICIO-3 FUNCIONES         ///////////////////////////////////////////////////////////
//////////////////////////////////////											 ////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// CREAR UNA FUNCION QUE DEVUELVA UN BOOLENO SI EL NUMERO PASADO POR PARAMETROS ES PAR
	
	public static boolean esPar (int numero) {
		if ( numero % 2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static boolean esImPar (int numero) {
		if ( numero % 2 == 0) {
			return false;
		}else {
			return true;
		}
		
	}
	
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////										   //////////////////////////////////////////////////////////
///////////////////////////////////////        		EJERCICIO-4 FUNCIONES         ///////////////////////////////////////////////////////////
//////////////////////////////////////											 ////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
	// CREA UNA FUNCION QUE VERIFIQUE SI DOS CADENAS DE TEXTO SON IGUALES
	
	public static boolean textoIgual (String txt1, String txt2) {
		if (txt1.equals(txt2)) {
			return true;
		}else {
			return false;
		}
	}
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////										   //////////////////////////////////////////////////////////
///////////////////////////////////////        		EJERCICIO-5 FUNCIONES         ///////////////////////////////////////////////////////////
//////////////////////////////////////											 ////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// CREAR LAS FUNCIONES PARA CONVERTIR EL PRIMER TEXTO EN EL SEGUNDO EN CASO DE QUE MIDAN LO MISMO
	
	public static boolean mismaLongitud (String txt1, String txt2) {
		if (txt1.length()==txt2.length()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String convertirTexto (String txt1, String txt2) {
		for (int i=0; i<txt1.length();i++) {
			txt1.replace(txt1.charAt(i), txt2.charAt(i));
		}
		return txt1;
	}
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////										   //////////////////////////////////////////////////////////
///////////////////////////////////////        		EJERCICIO-6 FUNCIONES         ///////////////////////////////////////////////////////////
//////////////////////////////////////											 ////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// CREAR UNA FUNCION QUE DEVUELVA EL CARACTER EN LA POSICION INDICADA
	
	public static char caracterEnPoscion (String texto, int indice) {
		char caracter = ' ';
		if(texto.length() > indice) {
			caracter = texto.charAt(indice);
			System.out.print("El caracter del string en la posicion " + indice + " es: " );
		}else {
			System.out.println("El indice es mayor a la longitud del String");
		}
		return caracter;
	}

	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////										   //////////////////////////////////////////////////////////
///////////////////////////////////////        		EJERCICIO-7 FUNCIONES         ///////////////////////////////////////////////////////////
//////////////////////////////////////											 ////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	//PEDIR GRDOS CELSIUS Y DEVOLVERLO COMO GRADOS FAHRENHEIT
	
	public static double celsiusToFahrenheit (double int1) {
		double grados=0;
		grados = (int1 * 9 / 5) +32;
		return grados;
	}
	
	

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////										   //////////////////////////////////////////////////////////
///////////////////////////////////////        		EJERCICIO-8 FUNCIONES         ///////////////////////////////////////////////////////////
//////////////////////////////////////											 ////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
}
