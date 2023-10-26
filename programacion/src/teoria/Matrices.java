package teoria;

public class Matrices {

	public static void main(String[] args) {

		int[][] matriz = new int[2][2];
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[1][0] = 3;
		matriz[1][1] = 4;

		int[][] matriz2 = { { 1, 2 }, { 3, 4 } };
	

		
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	   ///////////////////////////////////////////////								     //////////////////////////////////////////////////
	  ///////////////////////////////////////////////        E J E R C I C I O S 		//////////////////////////////////////////////////
	 ///////////////////////////////////////////////								   //////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	System.out.println("--------------------------------");
	System.out.println("|          EJERCICIO-1         |");
	System.out.println("--------------------------------");
	System.out.println("Crear una matriz 4x7, rellenarla de numero aleatorios e imprimirla");
	System.out.println("");
	
	int[][]mtr = new int [4][7];
	//Rellenamos la matriz con valores y luego la imprimimos
	rellenar(mtr);
	imprimir(mtr);

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	System.out.println("");
	System.out.println("--------------------------------");
	System.out.println("|          EJERCICIO-2         |");
	System.out.println("--------------------------------");
	System.out.println("Rellenar un matriz con datos solo en la parte superior a la diagonal, el resto debe ser 0");
	System.out.println("");
	
	int[][]mtr2 = new int [5][5];
	//Rellenamos los elementos superiores a la diagonal de la matriz con valores y luego la imprimimos
	rellenarDiagonal(mtr2);
	imprimir(mtr2);
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	System.out.println("");
	System.out.println("--------------------------------");
	System.out.println("|          EJERCICIO-3         |");
	System.out.println("--------------------------------");
	System.out.println("Sumar las filas y columnas de una matriz");
	System.out.println("");
	
	int[][]mtr3 = new int [5][7];
	//Rellenamos la mtriz con valores y luego mostramos la suma de sus filas y columnas
	rellenar(mtr3);
	sumFilCol(mtr3);

}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////								     //////////////////////////////////////////////////
  ///////////////////////////////////////////////    F  U  N  C  I  O  N  E  S		//////////////////////////////////////////////////
 ///////////////////////////////////////////////								   //////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Función para cargar valores en una matriz regular
	public static int[][] rellenar (int[][]mtr){
		//Recorremos filas y columnas y cargamos valores aleatorios en cada elemento
		for (int i = 0; i < mtr.length; i++) {
			for (int j = 0 ; j < mtr[i].length; j++) {
				mtr[i][j]= (int)( Math.random()*10);
			}
		}
		//Devolvemos la matriz rellena
		return mtr;
	}
	
	//Función para imprimir una matriz regular
	public static void imprimir(int[][] mtr) {
		//Recorremos las filas y columnas con dos bucles y mostramos por pantalla cada elemento
		for (int i = 0; i < mtr.length; i++) {
			System.out.print("|  " );
			for (int j = 0 ; j < mtr[i].length; j++) {
				System.out.print(+mtr[i][j] + " ");
			}
			System.out.println("  |" );
		}
	}
	
	//Función para rellenar los elementos superiores a la diagonal principal
	public static int[][]  rellenarDiagonal(int[][] mtr2) {
		//Recorremos con dos bucles los elementos superiores a la diagonal superior y cargamos valores aleatorios
		for (int i = 0 ; i < mtr2.length; i++) {
			for (int j = i+1 ; j < mtr2[0].length ; j++) {
				mtr2[i][j]= (int)( Math.random()*10);
			}
		}
		//Devolvemos la matriz con la parte superior a la diagonal rellena
		return mtr2;
	}
	
	
	//Función para sumar filas y columnas de una matriz regular
	public static void sumFilCol (int [][] mtr){
		int sumaFila=0;
		int sumaColum=0;
		
		//Recorremos las filas y al final guardamos en una variable acumulativa para mostrar la suma al final de cada una
		for (int i = 0; i < mtr.length; i++) {
			System.out.print("" );
			for (int j = 0 ; j < mtr[i].length; j++) {
				System.out.print(mtr[i][j] + "  ");
				sumaFila += mtr[i][j];				
			}
			System.out.println("=  " + sumaFila );
			//Es necesario reiniciar el contador en este caso
			sumaFila=0;
		}
	
		//Imprimimos la fila de "=" para las columnas, esta tiene la longitud de una fila
		for (int i = 0; i<mtr[0].length;i++) {
			System.out.print("=  ");
		}
		
		System.out.println("");
		
		//Recorremos las columnas y al final guardamos en una variable acumulativa para mostrar la suma al final de cada una
		for (int j = 0 ; j<mtr[0].length; j++) {
			for (int i = 0 ; i < mtr.length; i++) {
				sumaColum += mtr[i][j];				
			}			
			System.out.print(sumaColum + " ");
			//Es necesario reiniciar el contador
			sumaColum=0;
		}				
	}
	
	
	
	

}
