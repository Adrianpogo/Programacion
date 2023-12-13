package teoriaT2;

import java.util.*;


public class Diccionarios_HashMap {

	public static void main(String[] args) {
		
		// El primer dato es el tipo de dato de la CLAVE (suelen ser Integer o String)
		// EL segundo dato es el tipo de dato del VALOR (Integer, String, ArrayList, otros HashMap...)
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		
		// Añadir un valor al mapa
		mapa.put(1, "Aprobado");
		mapa.put(2, "Suspenso");
		mapa.put(3, "Suspenso");
		mapa.put(4, "Suspenso");
		mapa.put(5, "Suficiente");
		mapa.put(6, "Bien");
		mapa.put(7, "Notable");
		mapa.put(8, "Notable");
		mapa.put(9, "Sobresaliente");
		mapa.put(10, "Sobresaliente");
		// En el caso de repetir una clave con un nuevo valor lo que hacemos es modificar su valor con el nuevo
		mapa.put(1, "Suspenso");
		
		// Imprimir un mapa con { }
		System.out.println(mapa);
		
		// Pedir una valor en concreto
		System.out.println(mapa.get(6)); // --> Si no existe devuelve null
		
		// Para eliminar un dato (la clave y el valor)
		mapa.put(12, "No existe");
		mapa.remove(12);
		
		// Saber si una clave está dentro de un mapa
		System.out.println(mapa.containsKey(12));
		
		// Saber si una valor está dentro de un mapa --> No se suele usar por poca eficiencia
		System.out.println(mapa.containsValue("Sobresaliente"));
		
		// Saber el tamaño de elementos del mapa
		System.out.println(mapa.size());
		
		System.out.println();
		System.out.println("--------------");
		System.out.println("--------------");
		System.out.println();

		// Para recorrer un mapa necesitamos;
		// Recorrer las claves del mapa primero
		for (Integer clave : mapa.keySet()) {
			System.out.println("La clave es: " + clave + " y su valor es " + mapa.get(clave));
		}
		
		System.out.println();
		System.out.println("--------------");
		System.out.println("--------------");
		System.out.println();
		
		// Función flecha que hace lo mismo para recorrer las claves que el for anterior
		mapa.forEach((clave, valor)->{
			System.out.println("La clave es: " + clave + " y su valor es " + mapa.get(clave));
		});
		
		System.out.println();
		System.out.println("--------------");
		System.out.println("--------------");
		System.out.println();
		
		// Vaciar un mapa
		mapa.clear();
		System.out.println(mapa);
		
		// Saber si un mapa está vacio
		System.out.println(mapa.isEmpty());
		
		
	}

}
