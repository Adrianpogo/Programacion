package teoriaT1;

import java.util.ArrayList;
import java.util.List; 

public class ArrayLists {

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();
		ArrayList<String> aLst = new ArrayList<String>();
		
		// Añadir elemento
		aLst.add("Texto1");
		aLst.add("Texto2");
		aLst.add("Texto3");
		aLst.add("Texto4");
		aLst.add(0,null);
		//aLst.add(6,null); --> dará fallo ya que aún no se ha creado la posición 10
		System.out.println(aLst);
		
		// Recuperar el emento de una posición
		System.out.println(aLst.get(3));
		
		// Longitud de un aLst
		System.out.println(aLst.size());
		
		// Remplazar elemento por otro
		aLst.set(1, "newTexto1"); // --> Con un sysout nos imprime por pantalla el elemento remplazado
		System.out.println(aLst);
		
		// Borrar todos los elementos de la lista
		aLst.clear();
		System.out.println(aLst);
		
		// Comprobar si esta vacio
		System.out.println(aLst.isEmpty());
		
		// Comprueba si contiene un elemento determinado
		System.out.println(aLst.contains("Texto2"));
		
		// Devolver el indice de un elemento (si hay varios solo devuelve el primer indice)
		System.out.println(aLst.indexOf("Texto2")); // --> Devuelve -1 si no lo contiene
		// Existe lasIndexOf que hace lo mismo pero empezando por el final

	}

}
