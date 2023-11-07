package teoria;

public class EstructurasDeControlAvanzada {

	public static void main(String[] args) {
		
		// IF-ELSE
		// Cuando solo queremos ejecutar una linea del if-else podemos escribirlo sin inlcuir {}
		
		/*
		if(true)
			System.out.println();
		else
			System.out.println();
		*/
		
		
		// FOR-EACH
		// Se usa cuando el indice no tiene importancia
		
		int[]array = new int [5];
		array[0]=10;
		array[1]=11;
		array[2]=12;
		array[3]=13;
		array[4]=14;
		
		// Recorre los elementos "int" del array
		for (int elem : array) {
			System.out.println(elem);
		}
		
		// Para recorrer un String tenemos que convertirlo a un array de caracteres
		String txt = "Esto es una cadena";
		for (char t: txt.toCharArray()) {
			System.out.print(t);
		}
		
		
		
		// IF (1 linea) --> Se usa para 1 o 2 condiciones
		int n = 5 ;
		String resultado = (n%2==0)? "Es par":"Es impar";
		System.out.println("\n" + resultado);
		
		// IF (1 linea) --> Anidado
		int n2 = 8 ;
		String resultado2 = (n2%2==0)?(n2>5)? "Es par y mayor que 5": "Es par y menor que 5" : "Es impar";
		System.out.println(resultado2);
	}

}
