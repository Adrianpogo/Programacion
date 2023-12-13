package teoriaT1;

public class Funciones2 {

	public static void main(String[] args) {

	///////////////////////////////////////////////////////////
	/////////////     PARAMETROS POR VALOR       //////////////
	///////////////////////////////////////////////////////////
		
		//CUANDO PASO UN TIPO DE DATO BASICO (NUMERICOS, CHARS, BOOLEANOS)
		//CREAMOS UNA COPIA Y MODIFICAMOS LA COPIA PERO EL VALOR ORIGINAL SE MANTIENE
		//EL STRING ES EL UNICO OBJETO DE JAVA QUE SE PASA POR VALOR
		
		int x1 = 5;
		modifyVal1(x1);
		System.out.println("El valor de x1 es : " + x1);
		System.out.println("-------------------");

		String txt1 = "El numero es: ";
		modifyVal2(txt1);
		System.out.println("El numero es:" + txt1);
		System.out.println("-------------------");

		// AÑADIENDO UN RETURN Y ASIGNANDOLA A LA ORIGINAL EL VALOR SI VARIARIA
		x1 = modifyVal3(x1);
		System.out.println("El valor de x1 es : " + x1);
		System.out.println("-------------------");

		
		
	///////////////////////////////////////////////////////////
	/////////////   PARAMETROS POR REFERENCIA    //////////////
	///////////////////////////////////////////////////////////
	
	// SE APLICA CON ARRAYS POR EJEMPLO
	int[] arrayInt = new int[5];
	System.out.println(arrayInt[1] + " valor en la posicion 1");
	modifyRef(arrayInt);
	System.out.println(arrayInt[1] + " valor en la posicion 1");
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	}
	
	///////////////////////////////////////////////////////////
	/////////////     PARAMETROS POR VALOR       //////////////
	///////////////////////////////////////////////////////////
	public static void modifyVal1 (int x) {
		System.out.println("El valor de x es : "+ x);
		 x++;
		System.out.println("El valor de x es : "+ x);
		//return x ;
	}

	public static void modifyVal2 (String txt) {
		System.out.println("El valor de txt:" + txt);
		txt += "5";
		System.out.println("El valor de txt:" + txt);
	}
	
	public static int modifyVal3 (int x) {
		System.out.println("El valor de x es : "+ x);
		 x++;
		System.out.println("El valor de x es : "+ x);
		return x ;
	}
	
	
	///////////////////////////////////////////////////////////
	/////////////   PARAMETROS POR REFERENCIA    //////////////
	///////////////////////////////////////////////////////////
	
	public static void modifyRef(int[] array) {
		array[1] = 5;
		System.out.println(array[1] + " valor en la posicion 1");

	}

}
