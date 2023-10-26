package teoria;

public class MathClase {

	public static void main(String[] args) {

		
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////////								  //////////////////////////////////////////////////
  ///////////////////////////////////////////////////   	   M  A  I  N			 //////////////////////////////////////////////////
 ///////////////////////////////////////////////////								//////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// CONSTANTES GENERICAS
	System.out.println("El valor de PI es: " + Math.PI);
	System.out.println("El vlor de Euler es: " + Math.E);

	// OPERACIONES
	System.out.println("El valor absoluto de -15 es: " + Math.abs(-15));
	System.out.println("La raiz cuadrad de 246 es: " + Math.sqrt(246));
	System.out.println("El cuadrado de 13 es: " + Math.pow(13, 2));

	// TRIGONOMETRIA --> EL RESULTADO LO DA EN RADIANTE (HAY QUE PASARLO A ANGULOS
	// math.toDegrees)
	System.out.println("El seno de 90 es: " + Math.sin(90));
	System.out.println("El coseno de 90 es: " + Math.cos(90));
	System.out.println("La tangente de 90 es: " + Math.tan(90));

	// ALEATORIEDAD (NUMEROS DEL 0 INCLUIDO AL 1 EXCLUIDO)
	System.out.println(Math.random());
		

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	System.out.println("");
	System.out.println("--------------------------------");
	System.out.println("|        EJERCICIO-1           |");
	System.out.println("--------------------------------");
	System.out.println("ENUNCIADO --> Generar numero aletorio del 1 al 100");
	System.out.println("");

	double numAleatorio = ejercicio1();
	System.out.println("El numeor aletorio es: " + (int) numAleatorio);
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
	System.out.println("");
	System.out.println("--------------------------------");
	System.out.println("|        EJERCICIO-2           |");
	System.out.println("--------------------------------");
	System.out.println("ENUNCIADO --> Calcular la hipotenusa");
	System.out.println("");

	double catetoA = 4.7;
	double catetoB = 2.5;
	System.out.println("Los catetos son: " + catetoA + " y " + catetoB);

	double hipotenusa = ejercicio2(catetoA, catetoB);
	System.out.println("La hipotenusa es: " + hipotenusa);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	System.out.println("");
	System.out.println("--------------------------------");
	System.out.println("|        EJERCICIO-3           |");
	System.out.println("--------------------------------");
	System.out.println("ENUNCIADO --> Recibir array como parametros y revolver el valor maximo y minimo");
	System.out.println("");

	double[] array = { 3, 4, 4.5, 12, -3, 12.7, 0 };
	System.out.print("El array dado es: ");
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] + ", ");
	}
	System.out.println("");
	System.out.println("");

	double mayor = ejercicio3Mayor(array);
	double menor = ejercicio3Menor(array);
	System.out.println("El numero mayor es: " + mayor);
	System.out.println("El numero menor es: " + menor);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

	System.out.println("");
	System.out.println("--------------------------------");
	System.out.println("|        EJERCICIO-4           |");
	System.out.println("--------------------------------");
	System.out.println("ENUNCIADO --> Logaritmo en base10 y baseE");
	System.out.println("");

	double num4 = 43.2;
	System.out.println("El numero dado es: " + num4);
	System.out.println("");

	double log10 = ejercicio4L10(num4);
	double logE = ejercicio4LE(num4);
	System.out.println("El logaritmo en base 10 es: " + log10);
	System.out.println("El logaritmo en base E es: " + logE);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

	System.out.println("");
	System.out.println("--------------------------------");
	System.out.println("|        EJERCICIO-5           |");
	System.out.println("--------------------------------");
	System.out.println("ENUNCIADO --> Calcular el angulo que forman dos arrays (vectores) de 2 numeros cada uno");
	System.out.println("");

	double[] vector1 = { 0, 2 };
	double[] vector2 = { 2, 0 };
	System.out.println("Los vectores son : ");
	System.out.println("Vector 1: " + vector1[0] + ", " + vector1[1]);
	System.out.println("Vector 2: " + vector2[0] + ", " + vector2[1]);
	System.out.println("");

	double angulo = ejercicio5(vector1, vector2);
	System.out.println("El angulo que forman es: " + angulo);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

	System.out.println("");
	System.out.println("--------------------------------");
	System.out.println("|        EJERCICIO-6           |");
	System.out.println("--------------------------------");
	System.out.println("ENUNCIADO --> Calcular el interes compuesto");
	System.out.println("A= monto acumulado al final del periodo de inversión, valor que deseamos calcular");
	System.out.println("P= principal o monto de la inversion");
	System.out.println("r= tasa de interes anual (en forma decimal, por lo que un 5% es 0.05)");
	System.out.println("n= numero de veces que el interes se compone por año");
	System.out.println("t= tiempo de la inversion en años");
	System.out.println("");

	System.out.println("Los datos dados son:");
	double P = 14700.50;
	double r = 0.1;
	int n = 1;
	int t = 2;
	System.out.println("El monto de la inversion es: " + P);
	System.out.println("La tasa de interes anual: " + r);
	System.out.println("Numero de veces que el interes se compone por año: " + n);
	System.out.println("Años de la inversion: " + t);
	System.out.println("");

	double resultado = ejercicio6(P, r, n, t);
	System.out.println("El interes compuesto es: " + resultado);
		
	
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	System.out.println("");
	System.out.println("--------------------------------");
	System.out.println("|        EJERCICIO-7           |");
	System.out.println("--------------------------------");
	System.out.println("ENUNCIADO --> Numeros aleatorios y decir cuantos intentos se necesitan para encontrar el numero 53");
	System.out.println("");
	
	/*
	int numBuscar = 53;
	System.out.println("El numero a buscar es: " + numBuscar);
	
	
	System.out.println(ejercicio7(numBuscar));
	*/

	}
	
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////								     //////////////////////////////////////////////////
  ///////////////////////////////////////////////    F  U  N  C  I  O  N  E  S		//////////////////////////////////////////////////
 ///////////////////////////////////////////////								   //////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static double ejercicio1() {
		return (Math.random() * 100) + 1;
	}

	public static double ejercicio2(double catetoA, double catetoB) {
		double catetoAC = Math.pow(catetoA, 2);
		double catetoBC = Math.pow(catetoB, 2);
		double sumaCateto = catetoAC + catetoBC;
		double hipotenusa = Math.sqrt(sumaCateto);
		// MATH.HYPOT --> HACE LA HIPOTENUSA DE DOS CATETOS
		return hipotenusa;
	}

	public static double ejercicio3Mayor(double[] array) {
		double mayor = array[0];
		for (int i = 0; i < array.length; i++) {
			mayor = Math.max(mayor, array[i]);
		}
		return mayor;

	}

	public static double ejercicio3Menor(double[] array) {
		double menor = array[0];
		for (int i = 0; i < array.length; i++) {
			menor = Math.min(menor, array[i]);
		}
		return menor;

	}

	public static double ejercicio4L10(double num4) {
		return Math.log10(num4);
	}

	public static double ejercicio4LE(double num4) {
		return Math.log(num4);
	}

	public static double ejercicio5(double[] vector1, double[] vector2) {
		double moduloV1 = ejercicio2(vector1[0], vector1[1]);
		double moduloV2 = ejercicio2(vector2[0], vector2[1]);
		double prodEscalar = (vector1[0] * vector2[0]) + (vector1[1] * vector2[1]);
		double modulos = moduloV1 * moduloV2;
		double coseno = prodEscalar / modulos;
		return Math.toDegrees(Math.acos(coseno));
	}

	public static double ejercicio6(double P, double r, int n, int t) {
		double p1 = 1 + (r / n);
		double p2 = n * t;
		double A = P * Math.pow(p1, p2);

		return A;
	}

	/*public static int ejercicio7 (int numero) {
		int numAleatorio = (int)(Math.random()*100+1);
		int contador = 0;
		while(true) {
			if (numero==numAleatorio) {
				break;
			}
			contador++;
		}
		return contador;		
	}*/
}
