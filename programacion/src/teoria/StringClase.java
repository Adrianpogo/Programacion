package teoria;

public class StringClase {

	public static void main(String[] args) {
		
		String txt = "HOLA";  // --> TXT ES UN OBJETO DE LA CLASE STRING
		String txt2 = "Hola buenos dias";
		String txtEspaciado = "    Espacios     ";
		String txt3 = "hola";
		
		
		// --> DEVUELVE EL VALOR DEL TEXTO EN ESA POSICION
		int indice = 0;
		char caracter = txt.charAt(indice); 
		System.out.println("El caracter en la posicion " + indice + " es " + caracter);
		
		
		// --> DEVUELVE LA LONGITUD DEL STRING
		int longitud = txt.length(); 
		System.out.println("La longitud es de " + txt +  " es : " + longitud);
	
		
		// --> COGE UN SUBCONJUNTO A PARTIR DEL INDICE QUE SE INDICA o HASTA EL INDICADO
		String subtxt = txt2.substring(5) ; 
		System.out.println(subtxt); 
		String subtxt2 = txt2.substring(5, 11) ; 
		System.out.println(subtxt2); 
		 
		
		// --> 	CONVIERTE MAYUSCULAS A MINISCULAS Y VICEVERSA
		// CUANDO SE MEZCLAN MAYUSCULLAS Y MINUSCULAS LAS QUE ESTAN EL FORMATO DESEADO SIMPLEMENTE SE QUEDAN ASI
		String txtMinus = txt.toLowerCase() ;
		String txtMayus = txt2.toUpperCase() ;
		System.out.println(txtMinus);
		System.out.println(txtMayus);
		
		
		// --> REMPLAZAMOS UN CARACTER POR OTRO EN TODO EL STRING INCLUYENDO UN STRING
		String txt2Remplazo = txt2.replace(' ', '_').replace("Hola", "Ey");
		System.out.println(txt2Remplazo);
		
		
		// --> ELIMINA ESPACIOS EN BLANCO DE DELANTE Y DETRAS SOLAMENTE
		System.out.println("'" + txtEspaciado.trim() + "'");
		
		
		// --> COMPARA DOS STRINGS
		System.out.println(txt.equals(txt3)); // SENSIBLE A MAYUSCULAS Y MINISCULAS
		System.out.println(txt.equalsIgnoreCase(txt3)); // NO SENSIBLE A MASYUSCULAS Y MINISCULAS
		
		
		// --> BUSCAR EL PRIMER INDICE DE UN PARAMETRO
		System.out.println(txt.indexOf("A")); //SENSIBLE A MAYUSCULAS MINUSCULAS ETC --> DEVUELVE -1 SI NO EXISTE
		
		
		// --> DEVUELVE T/F SI EL STRING CONTIENE EL PARAMETRO
		System.out.println(txt.contains("LA"));
		
		
		// --> DEVUELVE UN ARRAY DE LOS ELEMENTOS QUE SE DIVIDIDEN EN FUNCIÓN DEL CARACTER
		//    muy util para divir textos por sus espacios en blanco, guiones etc
		String[]palabras = txt2.split(" ");
		for (int i = 0 ; i < palabras.length; i++) {
			System.out.print(palabras[i] + ",");
		}
		System.out.println("");
		
		
		// --> COMPROBAR EL PRIMER Y ULTIMO ELEMENTO DEL STRING
		System.out.println(txt2.startsWith("H"));
		System.out.println(txt2.endsWith("dias"));
		
		
		
		// --> 
	
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////										   //////////////////////////////////////////////////////////
///////////////////////////////////////        		BUCLES CON STRINGS            ///////////////////////////////////////////////////////////
//////////////////////////////////////                                           ////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		
		System.out.println("----------------------");
		
		
		//RECORRER EL STRING PARA MOSTRAR PALABRA POR PALABRA
		for (int i = 0; i < txt2.length(); i++) {
			System.out.println("El caracter en la posicion " + i + " es : " + txt2.charAt(i));
		}
		
		System.out.println("----------------------");
		
		
		//RECORRER EL STRING AL REVES PARA MOSTRAR PALABRA POR PALABRA
		for ( int i = txt2.length()-1; i>=0 ; i--) {
			System.out.println("El caracter en la posicion " + i + " es : " + txt2.charAt(i));
		}
		
		
		System.out.println("----------------------");
		
		
		//RECORRER EL STRING Y MOSTRAR LOS CARACTERES EN POSICION PAR
		for (int i = 0; i < txt2.length(); i++) {
			
			if (i % 2 == 0) {
				System.out.print("El caracter en la posicion " + i + " es : " + txt2.charAt(i));
				if(txt2.charAt(i) == ' ') {
					System.out.println("Espacio en blanco");
				}
				System.out.println();
				
			}
			
			
		}
		
	
		System.out.println("----------------------");
	
	
	
	
	
	}
	
	

}
