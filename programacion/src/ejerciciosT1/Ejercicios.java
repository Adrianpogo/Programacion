//Autor: Adrián Pousa González

package ejerciciosT1; 

public class Ejercicios {

	public static void main(String[] args) {
		/*
		 
		 Ejercicio 1:
		 	Declara 4 variables de tipo entero y dales los siguientes valores: 5, 16, 175 y -12 respectivamente
		 */
		
		
		System.out.println("EJERCICIO 1:");
		System.out.println();

		int var1 = 5;
		System.out.println("El valor de la variable1 es: " + var1);

		int var2 = 16;
		System.out.println("El valor de la variable2 es: " + var2);

		
		//Son floats para que la operacion de division del ejercicio dos tenga los decimales
		float var3 = 175f;
		System.out.println("El valor de la variable3 es: " + var3);

		float var4 = -12f;
		System.out.println("El valor de la variable4 es: " + var4);

		//Espacio en blanco para el siguiente ejercicio
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		
		
		
		
		/*
		 Ejercicio 2:		 	 
		 	Declara las variables necesarias(del tipo más adecuado) para hacer las siguientes operaciones:
		 		- variable 1 multiplicando variable 2
		 		- variable 3 menos variable 1 por variable 4
		 		- (variable 1 menos variable 3) mas variable 4
		 		- variable 4 dividido variable 3 
		 */
		System.out.println("EJERCICIO 2:");
		System.out.println();
		
		int operacion1 = var1 * var2;
		System.out.println("Operacion1 ---> Variable1 * Variable2");
		System.out.println( var1 + " * " + var2 + " = " + operacion1);
		System.out.println();

		float operacion2 = (var3 - var1) * var4;
		System.out.println( "Operacion2 ---> (Variable3 - Variable1) * Variable4");
		System.out.println( "(" + var3 + " - " + var1 + ") * " + var4 + " = " +operacion2);
		System.out.println();
		
		float operacion3 = (var1 - var3) + var4;
		System.out.println("Operacion3 ---> (Variable1 - Variable3) + Variable4" );
		System.out.println("(" + var1+ " - " + var3 + ") + " + var4 + " = " +operacion3);
		System.out.println();

		float operacion4 = var4 / var3;
		System.out.println("Operacion4 ---> Variable4 / Variable3" );
		System.out.println(var4 + " / " + var3 + " = "+operacion4);

		//Espacio en blanco para el siguiente ejercicio
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		
		
		
		/*
		 Ejercicio 3:
	 		Crea un programa que usando los  4 números enteros declarados en el ejercicio 1 verifique las siguientes condiciones y muestra un mensaje apropiado para cada una:
				- (Con la estructura IF) Si la variable 1 es mayor o igual a la variable 3
				- (Con la estructura IF) Si la variable 2 es par
				- (Con la estructura IF) Si la variable 4 es negativo
				- (Con la estructura IF) Si la variable 1 es mayor que la varible 2, en caso negativo comprobar si es mayor que la variable 3, en caso negativo si es mayor que la variable 4, en caso contrario mostrar por pantalla que es el número más bajo 
				- (Con la estructura IF) En una sola línea comprobar si la variable 3 es menor que el resto de variables
		*/
		
		System.out.println("EJERCICIO 3:");
		System.out.println();
		

		
		if( var1 >= var3) {
			System.out.println( "La variables 1 (" + var1 + ") es mayor o igual que la variable3 (" + var3 + ")");

		}else {
			System.out.println( "La variables 1 (" + var1 + ") NO es mayor o igual que la variable3 (" + var3 + ")");
		}
		System.out.println();

		
		
		if( var2 % 2 == 0) {
			System.out.println( "La variable 2 (" + var2 + ") es par");

		}else {
			System.out.println( "La variable 2 (" + var2 + ") NO es par");
		}
		System.out.println();
		
		
		
		if( var4 < 0) {
			System.out.println( "La variable 4 ("  +var4 + ") es negativa ");

		}else {
			System.out.println( "La variable 4 (" + var4 + ") NO es negativa");
		}
		System.out.println();
	
		
		
		if( var1 > var2) {
			System.out.println( "La variable 1 (" + var1 + ") es mayor que la variable 3 (" + var2 + ")");

		}else if(var1 > var3) {
			System.out.println( "La variable 1 (" + var1 + ") es mayor que la variable 3 (" + var3 + ") pero no que la variable 2 (" + var2 + ")");
			
		}else if (var1 > var4) {
			System.out.println( "La variable 1 (" + var1 + ") es mayor que la variable 4 (" + var4 + ") pero no que la variable 3 (" + var3 +") ni la variable2 (" + var2 + ")");
			
		}else {
			System.out.println( "La variable 1 (" + var1 + ") es la menor de las 4 variables ");
		}
		System.out.println();
		
		
		
		
		if( var3 < var1 && var3 < var2 && var3 < var4) {
			System.out.println( "La variable 3 (" + var3 + ") es menor que la variable4 (" + var4 + ") , que la variable 2 (" + var2 +") y que la variable 1 (" + var1 + ")");

		}else {
			System.out.println( "La variable 3 (" + var3 + ") NO es menor que la variable 4 (" + var4 + ") , que la variable 2 (" + var2 +") y que la variable 1 (" + var1 + ")");
		}
		System.out.println();
		
		
		//Espacio en blanco para el siguiente ejercicio
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
			
		
		
		/*
		Ejercicio 4:	
			- (Con la estructura SWITCH) Declara una variable que represente el número del día de la semana(1 es lunes y 7 es domingo). Mostrar por pantalla que día de la semana es en función de esa variable 
			- (Con la estructura SWITCH) Declara un texto que sea el nombre del mes. Mostrar por pantalla el número de mes (1 es enero y 12 diciembre)
			- (Con la estructura SWITCH) Usando una variable de tipo numérico entero que represente una nota numérica del 1 al 10. 
				Utiliza una switch para convertir esa nota en una calificación (por ejemplo, A, B, C, D o F) de acuerdo con la siguiente escala:
					9-10: A
					7-8: B
					5-6: C
					3-4: D
					1-2: F
				Concatena en el resultado por pantalla la letra correspondiente y la nota numérica, por ejemplo "A-9" o "D-3"
				Cualquier nota diferente de estas notas mostrará un "Tu nota no es válida"
		*/		
					
		System.out.println("EJERCICIO 4:");
		System.out.println();
			
		
		int dia = 4;
		
		switch (dia) {
		case 1:
			System.out.println("El dia de la semana es: " +  dia + " , por lo que es es Lunes");
			break;
		case 2:
			System.out.println("El dia de la semana es: " +  dia + " , por lo que es Martes");
			break;
		case 3:
			System.out.println("El dia de la semana es: " +  dia + " , por lo que es Miercoles");
			break;
		case 4:
			System.out.println("El dia de la semana es: " +  dia + " , por lo que es Jueves");
			break;
		case 5:
			System.out.println("El dia de la semana es: " +  dia + "por lo que es Viernes");
			break;
		case 6:
			System.out.println("El dia de la semana es: " +  dia + " , por lo que es Sabado");
			break;
		case 7:
			System.out.println("El dia de la semana es: " +  dia + " , por lo que es Domingo");
			break;
		default:
			System.out.println("No es ningun dia de la semana");
		}
		System.out.println();


		
		String mes = "Julio";
		switch (mes) {
		case "Enero":
			System.out.println("El mes del año es: " +  mes + " , por lo que es el mes numero 1");
			break;
		case "Febrero":
			System.out.println("El mes del año es: " +  mes + " , por lo que es el mes numero 2");
			break;
		case "Marzo":
			System.out.println("El mes del año es: " +  mes + " , por lo que es el mes numero 3");
			break;
		case "Abril":
			System.out.println("El mes del año es: " +  mes + " , por lo que es el mes numero 4");
			break;
		case "Mayo":
			System.out.println("El mes del año es: " +  mes + " , por lo que es el mes numero 5");
			break;
		case "Junio":
			System.out.println("El mes del año es: " +  mes + " , por lo que es el mes numero 6");
			break;
		case "Julio":
			System.out.println("El mes del año es: " +  mes + " , por lo que es el mes numero 7");
			break;
		case "Agosto":
			System.out.println("El mes del año es: " +  mes + " , por lo que es el mes numero 8");
			break;
		case "Septiembre":
			System.out.println("El mes del año es: " +  mes + " , por lo que es el mes numero 9");
			break;
		case "Octubre":
			System.out.println("El mes del año es: " +  mes + " , por lo que es el mes numero 10");
			break;
		case "Noviembre":
			System.out.println("El mes del año es: " +  mes + " , por lo que es el mes numero 11");
			break;
		case "Diciembre":
			System.out.println("El mes del año es: " +  mes + " , por lo que es el mes numero 12");
			break;
		default:
			System.out.println("No es ningun mes del año");

		}
		System.out.println();

		
		int nota = 6;
		
		switch(nota) {
		case 1,2:
			System.out.println("La nota es: " + nota + " , por lo que es equivalente a un " + nota + "-F");
			break;
		case 3,4:
			System.out.println("La nota es: " + nota + " , por lo que es equivalente a un " + nota + "-D");
			break;
		case 5,6:
			System.out.println("La nota es: " + nota + " , por lo que es equivalente a un " + nota + "-C");
			break;
		case 7,8:
			System.out.println("La nota es: " + nota + " , por lo que es equivalente a un " + nota + "-B");
			break;
		case 9,10:
			System.out.println("La nota es: " + nota + " , por lo que es equivalente a un " + nota + "-A");
			break;
		default:
			System.out.println("Tu nota no es valida");

		}
				
	/*					
		CUIDADO CON LAS LLAVES {} Y CON LOS PARÉNTESIS ()
		USAR LOS MÍNIMOS POSIBLES
	 */

	}

}
