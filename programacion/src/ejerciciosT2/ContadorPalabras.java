package ejerciciosT2;

import java.util.HashMap;

public class ContadorPalabras {

	public static void main(String[] args) {

		HashMap<String, Integer> mapa = new HashMap<String, Integer>();
		String texto = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, "
				+ "no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, "
				+ "rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, "
				+ "duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, "
				+ "consumían las tres partes de su hacienda. El resto della concluían sayo de velarte, "
				+ "calzas de velludo para las fiestas, con sus pantuflos de lo mesmo, y los días de entresemana se "
				+ "honraba con su vellorí de lo más fino. Tenía en su casa una ama que pasaba de los cuarenta y una "
				+ "sobrina que no llegaba a los veinte, y un mozo de campo y plaza que así ensillaba el rocín como "
				+ "tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta años. Era de complexión "
				+ "recia, seco de carnes, enjuto de rostro, gran madrugador y nuestro amigo de la caza. Quieren decir que tenía "
				+ "el sobrenombre de Quijada, o Quesada, que en esto hay alguna diferencia en los autores que deste "
				+ "caso escriben, aunque por conjeturas verisímilesII se deja entender que se llamaba QuijanaIII. "
				+ "Pero esto importa poco a nuestro cuento: basta que en la narración dél no se salga un punto de la verdad.";

		texto = limiparTexto(texto, ",.");
		// Añadimos cada palabra a un array de palabras
		String[] palabras = texto.toLowerCase().split(" ");

		crearDiccionario(palabras, mapa);
		imprimirDiccionario(mapa);
		mostrarMasRepetida(mapa);

	}

	// Función para eliminar caracteres del texto de manera que solo queden letras
	public static String limiparTexto(String texto, String charsToRemove) {
		for (char c : charsToRemove.toCharArray()) {
			texto = texto.replace(String.valueOf(c), "");
		}
		return texto;
	}

	// Función para añadir las palabras al diccionario
	public static void crearDiccionario(String[] palabras, HashMap<String, Integer> mapa) {
		

		// Recorremos el array de palabras, comprobando con cada una si se encuentra
		// dentro del diccionario
		// Si se encuentra incremetamos su valor, si no se encuentra la añadimos
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].length() > 3) {
				if (!mapa.containsKey(palabras[i])) {
					mapa.put(palabras[i], 1);
				} else {
					mapa.put(palabras[i], mapa.get(palabras[i])+1);
					
				}
			}

		}
	}

	// Función para imprimir el diccionario
	public static void imprimirDiccionario(HashMap<String, Integer> mapa) {
		for (String clave : mapa.keySet()) {
			System.out.println(clave + ": " + mapa.get(clave));
		}

	}

	// Función para buscar las palabras mas repetidas
	public static void mostrarMasRepetida (HashMap<String, Integer> mapa) {
		int numMaximo = 0;
		String palabra ="";
		for (String clave : mapa.keySet()) {
			if (mapa.get(clave)>numMaximo) {
				numMaximo= mapa.get(clave);
				palabra= clave;
			}
		}
		System.out.println("\nLa palabra que mas se ha repetido ha sido: " + palabra + " con " + numMaximo + " veces"  );

	}
}
