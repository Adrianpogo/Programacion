package ejercicios;

import java.util.ArrayList;

public class Ejercicios6 {

	public static void main(String[] args) {
		ArrayList<Integer> aLst = new ArrayList<Integer>();

		añadirValores(aLst);
		imprimirFor(aLst);
		imprimirForEach(aLst);
		
		System.out.println("");
		aLst.add(2, 1);
		aLst.add(3, 1);
		aLst.add(5, 1);
		aLst.add(7, 1);
		imprimirFor(aLst);
		
		System.out.println();
		borrarDuplicado(aLst);
		imprimirFor(aLst);
		
		System.out.println();
		aLst.add(2, 2);
		aLst.add(4, 2);
		aLst.add(5, 2);
		aLst.add(8, 3);
		aLst.add(10,3);
		aLst.add(11, 5);
		aLst.add(14, 7);
		aLst.add(15, 7);
		aLst.add(5, 7);
		aLst.add(7, 9);
		aLst.add(8, 9);
		aLst.add(12, 9);
		aLst.add(90);
		aLst.add(90);
		aLst.add(91);
		imprimirFor(aLst);
		
		System.out.println();
		borrarTodosDuplicados(aLst);
		imprimirFor(aLst);
		
	}

	// Función para imprimir elementos del ArrayList con For
	public static void imprimirFor(ArrayList<Integer> aLst) {
		for (int i = 0; i < aLst.size(); i++) {
			System.out.print(aLst.get(i) + " ");
		}
		System.out.println();

	}

	
	// Función para imprimir elementos del ArrayList con For-Each public static
	public static void imprimirForEach(ArrayList<Integer> aLst) {
		for (int aux : aLst) {
			System.out.print(aux + " ");
		}
	}
	 

	// Función para rellenar de valores el ArrayList
	public static void añadirValores(ArrayList<Integer> aLst) {
		int elem = 0;
		while (aLst.size() < 10) {
			aLst.add(elem);
			elem++;
		}
	}

	// Función para borrar los elementos repetidos de un ArrayList (elemento "1")
	public static void borrarDuplicado(ArrayList<Integer> aLst) {
		while(aLst.indexOf(1) != -1) {
			aLst.remove(aLst.indexOf(1));
		}
	}
	
	// Función para borrar todos los elementos repetidos de un ArrayList
	public static void borrarTodosDuplicados(ArrayList<Integer> aLst) {

		for (int i = 0; i < aLst.size(); i++) {
			int elementoActual = aLst.get(i);
			if (aLst.indexOf(elementoActual) != aLst.lastIndexOf(elementoActual)) {
				while (aLst.indexOf(elementoActual) != -1) {
					aLst.remove(aLst.indexOf(elementoActual));
				}
				i--;
			}

		}
	}

}
