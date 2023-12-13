package ejerciciosT1;

public class Ejercicios5 {
	public static void main(String[] args) {

		
		System.out.println("--------------------------------");
		System.out.println("|          EJERCICIO-1         |");
		System.out.println("--------------------------------");
		System.out.println("Crear una matriz 4x7, rellenarla de numero aleatorios e imprimirla");
		System.out.println("");
		
		int[][]mtr = new int [4][7];
		//Rellenamos la matriz con valores y luego la imprimimos
		rellenarMatriz(mtr);
		imprimirMatriz(mtr);
		
		
	}
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////								     //////////////////////////////////////////////////
  ///////////////////////////////////////////////    F  U  N  C  I  O  N  E  S		//////////////////////////////////////////////////
 ///////////////////////////////////////////////								   //////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void imprimirMatriz(int[][] mtr) {
		for(int [] array : mtr) {
			for(int valor : array) {
				System.out.print(valor +" ");
			}
			System.out.println("");
		}
	}

	public static int[][] rellenarMatriz(int[][] mtr) {
		
		for (int i = 0; i < mtr.length; i++) {
			for (int j = 0 ; j < mtr[i].length; j++) {
				mtr[i][j]= (int)( Math.random()*10);
			}
		}
		//Devolvemos la matriz rellena
		return mtr;
	}

}
