package teoria;

public class Arrays {

	public static void main(String[] args) {
		
		// UN ARRAY ES UN OBJETO CON UN ESPACIO DEFINIDO EN EL QUE PODEMOS AÑADIR O QUITAR 
		// ELEMENTOS DEL MISMO TIPO, PERO NUNCA MAS DEL TAMAÑO DEL ARRAY (SI PUEDEN SER MENOS)
		// LAS POSICIONES DE UN ARRAY EMPIEZN DESDE 0
		
		// PARA DECLARARLO PONEMOS EL TIPO DE DATOS QUE VA A CONTENER (	SE SUELE DECLARAR VACIO )
		int[] arrayInt = {1,2,3,4,5};
		int[] arrayInt2 = new int[5];
		
		
		// MOSTRAR UN ELEMENTO DEL ARRAY
		System.out.println("Mostrar un elemneto del array: ");
		System.out.println(arrayInt[2]);
		System.out.println("-----------------------------------");

		
		// MODIFICAR UN ELEMENTO DEL ARRAY
		System.out.println("Modificar un elemento del array: ");
		arrayInt[2]=70;
		System.out.println(arrayInt[2]);
		System.out.println("-----------------------------------");

		
		
		
		
		System.out.println("");
		System.out.println("-----------------------------------------");
		System.out.println("|        EJERCICIO-1 DE ARRAYS :        |");
		System.out.println("-----------------------------------------");
		
		//FUNCION QUE RECIBA UN ARRAY NUMERICO Y DENTRO LO RECORRE ASIGNANDO VALORES, FUERA DE LA FUNCION RECORRERLO PARA MOSTRARLO
		int[] array1 = new int[10];
		rellenarArray(array1);
		for (int i=0; i<array1.length; i++) {
			System.out.println("El elemento en la poscion " + i + " es: " +  array1[i]);
		}
		
		
		System.out.println("");
		System.out.println("-----------------------------------------");
		System.out.println("|        EJERCICIO-2 DE ARRAYS :        |");
		System.out.println("-----------------------------------------");
		
		//DECLARAR ARRAY DE 10 POSICIONES CON NUMERO ALEATORIOS Y DECIR CUAL ES EL VALOR MAXIMO DEL ARRAY
		int[] array2 = {14,67,2,1,68,23,124,6,-90,110};
		System.out.print("El array dado es: ");
		for (int i=0; i<array2.length; i++) {
			System.out.print(array2[i] + ", ");
		}
		System.out.println("");
		System.out.println("El mayor numero del array es: " + mayorNumArray(array2));
		
		
		System.out.println("");
		System.out.println("-----------------------------------------");
		System.out.println("|        EJERCICIO-3 DE ARRAYS :        |");
		System.out.println("-----------------------------------------");
		
		// DECLARAR ARRAY DE 10 POSICIONES CON NUMERO ALEATORIOS Y DECIR CUAL ES LA SUMA DE TODOS
		int[] array3 = { 4, 67, 2, 1, 67, 23, 124, 6, 90, 0 };
		System.out.print("El array dado es: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + ", ");
		}
		System.out.println("");
		int sumaArray = sumaNumsArray(array3);
		System.out.println("La suma de los elementos del array es: " + sumaArray);
		
		
		System.out.println("");
		System.out.println("-----------------------------------------");
		System.out.println("|        EJERCICIO-4 DE ARRAYS :        |");
		System.out.println("-----------------------------------------");
		
		// Funcion que recibe un array donde voy a meter los datos y el dato a introducir
		// cuando el tamaño del array esta lleno duplicamos el tamaño
		int[]array = {0,0,0,0,0};
		System.out.print("El array es: {");
		for (int i = 0; i < array.length ; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("}");
		//System.out.println(array[array.length-1]);
		addValueToArray(array, 9, 0);
		addValueToArray(array, 8, 1);
		addValueToArray(array, 7, 2);
		addValueToArray(array, 6, 3);
		addValueToArray(array, 5, 4);
		
		//Empieza a fallar
		addValueToArray(array, 4, 5);
		
		/*
		addValueToArray(array, 3, 6);
		
		addValueToArray(array, 2, 7);
		*/
		System.out.print("El nuevo array es: {");
		for (int i = 0; i < array.length ; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("}");
	}
	
//----------------------------------------------------------------------------------------------------------------------------------------------	
//----------------------------------------------------------------------------------------------------------------------------------------------	
//----------------------------------------------------------------------------------------------------------------------------------------------	
//----------------------------------------------------------------------------------------------------------------------------------------------	
//----------------------------------------------------------------------------------------------------------------------------------------------	
//----------------------------------------------------------------------------------------------------------------------------------------------	

	//Función para rellenar de valores un array
	public static void rellenarArray (int[] array) {
		for (int i=0; i<array.length; i++) {
			array[i]= i*5;
		}
	}


	//Función para devolver el mayor número de un array numérico
	public static int mayorNumArray (int[] array) {
		int mayor = array[0];
		for (int i=0; i<array.length; i++) {
				if (array[i]> mayor) {
					mayor = array[i];
			}
		}
		return mayor;

	}
	
	//Función para sumar los elementos de un array numérico
	public static int  sumaNumsArray(int[] array) {
		int suma = 0;
		for (int i = 1; i < array.length; i++) {
			suma += array[i];	
		}
		return suma;
	}

	
	//Función para añadir un valor a un array en una posición
	public static int [] addValueToArray (int[]array, int num, int contador) {
		
		//cuando el contador de añadidos es la longitud el array esta lleno
		if (contador == array.length) {
			//creamos un nuevo array del doble de longitud
			int [] newArray = new int [array.length*2];
			//rellenamos el array con los datos del anterior mas el nuevo
			for (int i = 0; i < array.length; i++) {
				int dato = array[i];
				newArray[i]=dato;
				
			}
			newArray[array.length]=num;
			return newArray;
		}
		
		//el array no esta lleno --> lo rellenamos
		array[contador]=num;
		return array;
	}
	
	
	
}

