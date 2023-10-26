package teoria;

public class Excepciones {

	public static void main(String[] args) {
		
		//Existen errores lógicos y excepciones, cuando se trata de las segundas buscaremos 
		//reconocerlas para que el programa siga ejecutandose
		
		
		//El siguiente código muestra una excepción por pantalla porque se sale del rango del array
		
		/*
		 * 
		 * int [] arr = new int [6];
		 * System.out.println(arr[20]);
		 * 
		 * */
		
		
		//El código no se ejecuta a partir de la línea de la excepción, por ello cuando algo lance una
		//excepción haremos lo siguiente:
		
		int [] arr = new int [6];
		int num = 5 ;
		try {
			System.out.println(num/0);
			//Esta linea daría excepción pero como hay una anterior ya no salta esta
			System.out.println(arr[10]);
		} catch(IndexOutOfBoundsException e) {
			System.err.println("Ha ocurrido un error (array): " + e.toString());
		} catch(ArithmeticException e) {
			System.err.println("Ha ocurrido un error (dividir/0): " + e.toString());
		} catch(Exception e) {
			System.err.println("Excepción genérica");
		}finally{
			System.out.println("Final del 'try-catch'");
		}
		System.out.println("Esto SI que se ejecuta");
		
		//Exception es un objeto de java, dentro de este hay muchos tipos de excepciones
		//Con el catch capturamos la excepción, en este caso es la más genérica (también pueden ser particulares como index out of bounds, etc)
		//Podemos tener diferentes catch y en función del que actue variar nuestro programa
		//El finally se ejecuta siempre, de o no de excepción
		
		//Para imprimir el mensaje de excepción usamos .getMessage (solo el mensaje) o .toString, que concatena el mensaje con el error
		
		//Si tuvieramos un Exception general en el primer catch, los siguientes serían inalcanzables ya que siempre se queda en el primero
		//En caso de añadir una Exception genérica lo ponemos al final
		
		
		
		    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		   //////////////////////////////////////////										////////////////////////////////////////////////////////
		  //////////////////////////////////////////		E J E R C I C I O S			   ////////////////////////////////////////////////////////
		 //////////////////////////////////////////										  ////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println();
		System.out.println(" -------------------------------- ");
		System.out.println("|       E J E R C I C I O        |");
		System.out.println(" -------------------------------- ");
		System.out.println();
		
		// Excepción NullPointer
		String cadena = null;
		try {
			System.out.println(cadena.length());
		} catch (NullPointerException e) {
			System.out.println("Ha ocurrido un error: " + e);
		} finally {
			System.out.println("Final del 'try-catch'");
		}

		// Excepción NumberFormat
		String cadena1 = "cadena";
		try {
			Float.parseFloat(cadena1);
		} catch (NumberFormatException e) {
			System.out.println("Ha ocurrido un error: " + e);
		} finally {
			System.out.println("Final del 'try-catch'");
		}

		// Excepción StringIndexOutOfBounds
		String cadena2 = "cadena";
		try {
			cadena2.charAt(20);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Ha ocurrido un error: " + e);
		} finally {
			System.out.println("Final del 'try-catch'");
		}

		// Excepción NegativeArray
		int [] arr1 ;
		try {
			arr1 = new int [-10];
		} catch (NegativeArraySizeException e) {
			System.out.println("Ha ocurrido un error: " + e);
		} finally {
			System.out.println("Final del 'try-catch'");
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		System.out.println();
		System.out.println(" -------------------------------- ");
		System.out.println("|       E J E R C I C I O        |");
		System.out.println(" -------------------------------- ");
		System.out.println();
		
		
		try {
			dividirNum(5, 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}

	
	
	
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	   ///////////////////////////////////////////////								     //////////////////////////////////////////////////
	  ///////////////////////////////////////////////    F  U  N  C  I  O  N  E  S		//////////////////////////////////////////////////
	 ///////////////////////////////////////////////								   //////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void dividirNum (int n1, int n2) throws ArithmeticException {
		try {
			System.out.println("La división es: " + n1/n2);
		} catch (ArithmeticException e) {
			System.err.println(e);
			throw new ArithmeticException("No se puede dividir entre 0");
		}
	}
	
}
