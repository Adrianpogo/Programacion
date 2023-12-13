package ejerciciosT1;

public class EjercicioArray {

	public static void main(String[] args) {

		// Declaramos el array inicial
		int[] array = new int[5];
		System.out.print("Array inicial: { ");
		imprimirArray(array);

		// Añadimos elementos con la función
		for (int i = 0; i < 7; i++) {
			array = addToArray(array, i , i);
		}

		// Imprimirmos el array final
		System.out.print("Nuevo array: { ");
		imprimirArray(array);
		System.out.print("Nuevo array: { ");
		array = addToArray(array, 20, 20);
		imprimirArray(array);
	}

	
	//Función para añadir un valor en un array en una posición determinada
	public static int[] addToArray(int[] array, int valor, int posicion) {

		int[] nuevoArray = new int[array.length];
		int nuevoTamaño = array.length;
		/*
		 * Comprobamos si la posición en la que queremos insertar el valor es igual a la
		 * longitud del array en caso de ser mayor a la longitud significa que estamos
		 * fuera del array ya que la ultima posición posible es array.lenght-1, de esta
		 * forma sabemos que necesitamos duplicar el tamaño del array
		 * 
		 */
		if (posicion >= array.length) {
			/*
			 * Duplicamos el tamaño y copiamos el anterior array en el nuevo, luego
			 * guardamos en el array anterior el nuevo
			 * 
			 */
			do {
				nuevoTamaño *= 2;
				nuevoArray = new int[nuevoTamaño];
				for (int i = 0; i < array.length; i++) {
					nuevoArray[i] = array[i];
				}
				array = nuevoArray;
				/*
				 * Cuando ya hemos hecho la primera iteración comprobamos si la posicion es
				 * mayor al nuevoTamaño si es mayor significa que no tenemos espacio suficiente
				 * asi que bvolvemos a duplicar
				 * 
				 */
			} while (posicion >= nuevoTamaño);
		}
		array[posicion] = valor;
		return array;

	}

	// Función para imprimir un array
	public static void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("}");
	}

}
