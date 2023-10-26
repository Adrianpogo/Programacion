package teoria;

public class MatricesIrregulares {

	
	public static void main(String[] args) {
		
		System.out.println("MATRIZ IRREGULAR 1 (7 filas)");
		System.out.println("----------------------------");
		cargarMatrizIrregular(7);
		System.out.println();
		System.out.println("MATRIZ IRREGULAR 2 (3 filas)");
		System.out.println("----------------------------");
		cargarMatrizIrregular(3);
		System.out.println();
		System.out.println("MATRIZ IRREGULAR 3 (13 filas)");
		System.out.println("-----------------------------");
		cargarMatrizIrregular(13);
        

	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	//La función recibe por parámetros el número de filas que queremos en la matriz y la crea
	public static void cargarMatrizIrregular( int nFilas) {
		
		//Inicializamos la matriz y luego incluimos el número de filas que tendrá
		int [][]mat = new int[0][0] ;
        mat=new int[nFilas][];
        
        //Recorremos cada fila asignando el numero de elementos que tendrá esa fila
        for(int i=0;i<mat.length;i++) {
        	// Con el +1 nos aseguramos de que el numero de los elementos de una fila no sea 0
        	int numElementos = (int) (Math.random()*10)+1; 
            mat[i]=new int[numElementos];    
            
            
            //Recorremos las columnas de la fila (hasta la longitd de esta)  y asignamos un valor aleatorio a la posción
            // Despues de asignar el valor lo imprimimos
            for(int j=0;j<mat[i].length;j++) {
                mat[i][j]=(int) (Math.random()*10);
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }
    
   
    
    
}
