package ejerciciosT1;

public class Ejercicios2 {

	public static void main(String[] args) {

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////////								  ////////////////////////////////////////////////////
  ///////////////////////////////////////////////////   	   M  A  I  N			 ////////////////////////////////////////////////////
 ///////////////////////////////////////////////////								////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("--------------------------------");
		System.out.println("|          EJERCICIO-1         |");
		System.out.println("--------------------------------");
		System.out.println("Pedir un array de String y un String, devolver el array que contiene los elementos del array diferentes al String");
		System.out.println("");
		
		String[] array = {"Enero", "Febrero", "Enero", "Marzo", "Mayo", "enero"};
		System.out.print("El array de String es: { ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("}");
		String txt = "Enero";
		System.out.println("El String con el que comparamos es: " + txt);
		
		System.out.println("");
		System.out.print("El nuevo array es: {");
		String[] newArray = ejercicio1(array, txt);
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + ", ");
		}
		System.out.println("} ");
		
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|          EJERCICIO-2         |");
		System.out.println("--------------------------------");
		System.out.println("Pedir un array de cualquier tipo y un segundo parametro del mismo tipo"
				+ "Decir cuántos valores del segundo parametros hay en el primero");
		System.out.println("");
		
		String[] array2 = {"Enero", "Febrero", "Enero", "Marzo", "Mayo", "enero"};
		System.out.print("El array de String es: { ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + ", ");
		}
		System.out.println("}");
		String txt2 = "Enero";
		System.out.println("El String con el que comparamos es: " + txt2);
		System.out.println("");
		
		int contador = ejercicio2(array2, txt2);
		System.out.println("El número de veces que aparece " + txt2 + " en el array es: " + contador);

		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("|          EJERCICIO-3         |");
		System.out.println("--------------------------------");
		System.out.println("Pedir un array de números decimales y devolver la media de los valores");
		System.out.println("");
		
		double[] array3 = {3.2, 2, 1.3, 7, 1.6, 4.9, 0};
		System.out.print("El array de doubeles es: { ");
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + ", ");
		}
		System.out.println("}");
		System.out.println("");
		double media = ejercicio3(array3);
		System.out.println("La media es: " + media);
		
		
		
		
	}

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////								     //////////////////////////////////////////////////
  ///////////////////////////////////////////////    F  U  N  C  I  O  N  E  S		//////////////////////////////////////////////////
 ///////////////////////////////////////////////								   //////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	//Función para comparar si un array de String tiene el elemento String pasado por parametros
	public static String[] ejercicio1 (String[] array, String txt) {
		int newTamaño = 0;
		for (int i = 0; i < array.length; i++) {
			if( !array[i].equalsIgnoreCase(txt)){
				newTamaño ++;
			}	
		}
		
		String[]newArray = new String [newTamaño] ;
		int indiceElemento = 0;
		for (int i = 0; i < array.length; i++) {
			if( !array[i].equalsIgnoreCase(txt)){
				newArray[indiceElemento] = array[i];
				indiceElemento++;
			}
		}
		return newArray;
	}

	//Función que retorna el numero de veces que un String se encuentra dentro de un array de String
	public static int ejercicio2(String[] array, String txt) {
		int contador = 0;
		//Recorremos el array para comparar el elemento en una posición con el elemento pasado por parámetros
		for (int i = 0; i < array.length; i++) {
			if( array[i].equalsIgnoreCase(txt)){
				contador ++;
			}
		}
		return contador;
	}
	
	//Función que calcula la media de los valores de un array numérico
	public static double ejercicio3 (double[] array) {
		double suma = 0;
		for (int i = 0 ; i < array.length; i++) {
			suma += array[i];
			
		}
		double media = suma / array.length;
		return media;
	}



}
