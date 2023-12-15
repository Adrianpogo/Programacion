package ejerciciosT2;

import java.util.HashMap;

public class Traductor {

	public static void main(String[] args) {
		
		HashMap<String, String> diccionario = new HashMap<String, String>();
		crearDiccionario(diccionario);

		String cadena = "Hola, yo quiero comer dos perritos calientes deliciosos, porfavor y gracias!";
		String cadena1 = "Tu eres muy malo, adiós!";
		
		cadena = limpiarFrase(cadena, ",.¡!¿?");
		String[] palabras = cadena.toLowerCase().split(" ");
		
		cadena1 = limpiarFrase(cadena1, ",.¡!¿?");
		String[] palabras1 = cadena1.toLowerCase().split(" ");
				
		System.out.println("La frase es: " + cadena);
		System.out.println("Y su traducción... ");
		traducir(diccionario, palabras);
		System.out.println("\nLa frase es: " + cadena1 );
		System.out.println("Y su traducción... ");
		traducir(diccionario, palabras1);
		
	}
	
	// Función para limpiar la frase de signos de puntuación
	public static String limpiarFrase(String texto, String charsToRemove) {
		for (char c : charsToRemove.toCharArray()) {
			texto = texto.replace(String.valueOf(c), "");
		}
		return texto;
	}
	
	// Función para traducir un frase
	public static void traducir (HashMap<String, String> diccionario, String [] palabras) {
		String textoTraducido = "";
		for (String palabra : palabras) {
			if(diccionario.containsKey(palabra)) {
				textoTraducido += diccionario.get(palabra) + " ";
			}else {
				textoTraducido +=  "'" +  palabra + "' ";
			}
			
		}
		System.out.println("\n" + textoTraducido);
		System.out.println("________________________________________________________");
	}
	
	// Función para crear el diccionario
	public static void crearDiccionario (HashMap<String, String> diccionario) {
		diccionario.put("hola", "hello");
		diccionario.put("adiós", "bye");
		diccionario.put("porfavor", "please");
		diccionario.put("gracias", "thanks");
		diccionario.put("si", "yes");
		diccionario.put("no", "no");
		diccionario.put("uno", "one");
		diccionario.put("dos", "two");
		diccionario.put("tres", "three");
		diccionario.put("yo", "i");
		diccionario.put("tu", "you");
		diccionario.put("nosotros", "we");
		diccionario.put("ellos", "they");
		diccionario.put("soy", "am");
		diccionario.put("eres", "are");
		diccionario.put("somos", "are");
		diccionario.put("y", "and");
		diccionario.put("bueno", "good");
		diccionario.put("malo", "bad");
		diccionario.put("deliciosos", "delicious");
		diccionario.put("barato", "cheap");
		diccionario.put("caro", "expensive");
		diccionario.put("quiero", "want");
		diccionario.put("comer", "eat");
		diccionario.put("perritos", "dog");
		diccionario.put("caliente", "hot");
	}
	
	

}
