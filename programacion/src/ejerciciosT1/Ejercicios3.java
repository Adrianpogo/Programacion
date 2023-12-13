package ejerciciosT1;

import java.util.Iterator;

public class Ejercicios3 {

	public static void main(String[] args) {

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	   ///////////////////////////////////////////////////								  ////////////////////////////////////////////////////
	  ///////////////////////////////////////////////////   	   M  A  I  N			 ////////////////////////////////////////////////////
	 ///////////////////////////////////////////////////								////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("--------------------------------");
		System.out.println("|          EJERCICIO-1         |");
		System.out.println("--------------------------------");
		System.out.println("Ordenar ascendentemente un array de numeros desordenados");
		System.out.println("");
		
		int [] array = {5,3,6,7,0,1,4,9,13,4,5,14,87,56,34,21,78,54};
		System.out.print("El array es: {");
		for (int i = 0 ; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println("}");
		System.out.println("");
		System.out.print("El numero de vueltas para ordenar el array es: ");
		ejercicio1(array);
		for (int i = 0 ; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println("}");
		
	}

	

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////								     //////////////////////////////////////////////////
  ///////////////////////////////////////////////    F  U  N  C  I  O  N  E  S		//////////////////////////////////////////////////
 ///////////////////////////////////////////////								   //////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	
	// Función para ordenar ascendentemente un array de números desordenados
	public static void ejercicio1(int[] array) {
		int aux = 0 ;
		int contador = 0;
		// Recorremos el array comparando los elementos
		for (int j = 0 ; j < array.length-1; j++){
			for (int i = 0 ; i < array.length-1; i++) {
				contador++;
				// En caso de que el elemento sea mayor que el siguiente, cambiaremos el orden con ayuda de la variable auxiliar
				if(array[i]>array[i+1]) {
					aux= array[i];
					array[i]=array[i+1];
					array[i+1]=aux;			
				}
			}
			// Comprobamos el orden, de forma que si está ordenado salimos del bucle ahorrando iteraciones
			if (comprobarOrden(array)) {
				break;
			}
		}
		System.out.print(contador + " vueltas {");
	}
	
	// Función auxiliar para comprobar si un array está ordenado ascendentemente
	public static boolean comprobarOrden (int[]array) {
		for (int i = 0; i < array.length - 1; i++) {
			// Cuándo un elemento es mayor que el siguiente salimos de la función devolviendo False
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	
	
}
