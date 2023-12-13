package teoriaT1;

public class EstructurasDeControl {

	public static void main(String[] args) {
		
		
		// If - else
		
		/*
		 * 		if (condicion) {
		 * 
		 * 			CODIGO QUE CUMPLE LA CONDICION
		 * 		
		 * 		} else if (condicion) {
		 * 
		 * 			CODIGO QUE CUMPLE LA NUEVA CONDICION PERO NO LA PRIMERA
		 * 
		 * 		}else{
		 * 
		 * 			CODIGO QUE NO CUMPLE NINGUNA DE LAS CONDICIONES ANTERIORES
		 * 	
		 * 		}
		 * */
		
		
//EJEMPLO 
		System.out.println();
		System.out.println("EJERCICIO IF-ELSE");
		System.out.println();
		
		int edad1 = 17;
		int edad2 = 20;

		if (edad1 >= 18) {
			System.out.println("Es mayor de edad");

		} else {
			System.out.println("Es menor de edad");
		}

		if (edad2 >= 18 && edad2 % 2 == 0) {
			System.out.println("Es mayor de edad y con edad par");

		}

		else {
			System.out.println("Es menor de edad o tiene edad impar ");
		}
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println();

		

///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

		
		// Switch
		
		/*
		 * 		switch (variable) {
		 * 
		 * 			case x :
		 * 
		 * 				CODIGO QUE CUMPLE LAS CONDICIONES DEL PRIMER CASO
		 * 
		 * 			break;
		 * 
		 * 			case y :
		 * 
		 * 				CODIGO QUE CUMPLE LAS CONDICIONES DEL SEGUNDO CASO
		 * 
		 * 			break;
		 * 
		 * 			default:
		 * 
		 * 				CODIGO SI NO SE CUMPLE NINGUN CASO PREVIO
		 * 		}
		 *
		 * 
		 * */
		
// ---> EL BREAK SIRVE PARA QUE EL CODIGO NO SIGA EJECUTANDO LOS CASE POSTERIORES AL CASE QUE SOLUCIONA EL PROBLEMA
		
		
//EJEMPLO 	
		System.out.println();
		System.out.println("EJERCICIO SWTICH");
		System.out.println();
		
		int dia = 4;
		String nombreUsuario = "Adrian";
		
		switch (dia) {
		case 1 :
			System.out.println("El dia es Lunes");
			break;
		case 2 :
			System.out.println("El dia es Martes");
			break;
		case 3 :
			System.out.println("El dia es Miercoles");
			break;
		case 4 :
			System.out.println("El dia es Jueves");
			break;
		case 5,6 :
		case 7:
			System.out.println("Es Fin de Semana");
			break;
		default :
			System.out.println("No existe el dia");
			
		}
		
		
		switch(nombreUsuario) {
		case "Ninguno":
			System.out.println("El usuario se llama Ninguno");
			break;
		case "Marta":
			System.out.println("El usuario se llama Marta");
			break;
		case "Adrian":   // ES SENSIBLE A MAYUSCULAS O ACENTOS
			System.out.println("El usuario se llama Adrian");
			break;
		default:
			System.out.println("El usuario no tiene nombre");
		}
		
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println();
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

		
		// For
		
		/*
		 * 
		 * 		for (DONDE EMPIEZO, CONDICION DE PARADA, COMO LLEGAMOS){
		 * 
		 * 			CODIGO MIENTRAS SE CUMPLE LA CONDICION DE PARADA
		 * 
		 * 		}
		 * 
		 * 
		 * */
		
		
//EJEMPLO 		
		
		System.out.println();
		System.out.println("EJERCICIO FOR");
		System.out.println();
		
		for (int i=0; i <= 5 ; i++) {
			System.out.println("i vale : " + i);
		}
		
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println();
		
		
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
		
		
		// While
		
		/*
		 * 		while (condicion) {
		 * 
		 * 			CODIGO CUANDO ESTAMOS DENTRO DEL BUCLE
		 * 
		 * 		}
		 * 
		 * */
		
//EJEMPLO 		
		
		System.out.println();
		System.out.println("EJERCICIO WHILE");
		System.out.println();
		
		int n1= 0;
		
		while (n1!=10) {
			System.out.println("n1 vale : " + n1);
			n1++;  // --> n+=1 // --> n = n+1 // --> ++n (primero sumo y luego lo asigno a la variable)
		}
		
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println();
		
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////


// Do- While (LA DIFERENCIA ES QUE EJECUTO EL CODIGO AL MENOS UN VEZ)

/*
* 		
* 		do {
* 
* 			CODIGO CUANDO ESTAMOS DENTRO DEL BUCLE
* 
* 		} while (condicion);

* 
* */

//EJEMPLO 		
		
		System.out.println();
		System.out.println("EJERCICIO DO-WHILE");
		System.out.println();
		
		int n2 = 0;
		do {
			System.out.println("n2 vale: " + n2);
			n2++;
		}
		while (n2 != 10) ;
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println();
		
		
		
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
	
	// -- BREAK -- EL BUCLE PARA SI O SI CUANDO LLEGA A UN BREAK COMO EN LOS SWITCH 
		int ix = 0;
		while (ix<10) {
			if (ix==5) {
				break;
			}
			System.out.println("El valor de la i es: " + ix);
			ix++;
		}
		
		System.out.println("----------------");
		
	// -- CONTINUE -- SALTA A LA SIGUIENTE ITERACION DEL BUCLE
		//BUCLE INFINITO
		int ix2 = 0;
		while (ix2<10) {
			if (ix2==5) {
				//i++ AQUI PARA QUE ASI PASE A VALER 6 Y SALGA DEL BUCLE INFINITO
				continue;
			}
			System.out.println("El valor de la i es: " + ix2);
			ix2++;
		}
		
	
	// CON EL BREAK PARAMOS ANTES DE UN NUMERO MIENTRAS QUE EL CONTINUE HACE QUE NOS SALTEMOS ESE NUMERO
		
		
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////		
		
//EJERCICIO: SUMA NUMEROS DEL 1 AL 10

		System.out.println();
		System.out.println("EJERCICIO SUMAS CON BUCLES");
		System.out.println();
		
		//SUMA FOR
		int sumaFor = 0;
		
		for(int v1=1; v1<=10; v1++) {
			sumaFor += v1;
		}
		
		System.out.println("La suma con el FOR da: " + sumaFor);
		
		
		//SUMA WHILE
		int v2=0;
		int sumaWhile =0;
		
		while (v2<=10) {
			sumaWhile += v2;
			v2++;
		}
		
		System.out.println("La suma con el WHILE da: " + sumaWhile);
			
		
		//SUMA DO-WHILE
		int v3=0;
		int sumaDoWhile =0;
		
		do {
			sumaDoWhile += v3;
			v3++;
		}while (v3<=10);
		
		System.out.println("La suma con el DO-WHILE da: " + sumaDoWhile);
		
		//Crear un bucle que sume los numeros pares del 0 al 10
				int variable = 0;
				int sumaPares = 0;
				
				while(variable <= 10) {
					if(variable % 2 == 0) {
						sumaPares += variable;
						variable++;
					}else {
						variable++;
					}
				
				}
				System.out.println("La suma con WHILE de los numeros pares hasta 10 es: " + sumaPares);
				
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println();

/////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println();
		System.out.println("EJERCICIO EXTRA CON BUCLES");
		System.out.println();
		
		//Crea una aplicación que dibuje una escalera de asteriscos.
		int altura = 8;
		for (int numeroasteriscos=1;numeroasteriscos<=altura;numeroasteriscos++){
            for(int i=0;i<numeroasteriscos;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
		
		System.out.println();
		System.out.println();

/////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Crea una aplicación que dibuje una escalera inversa de asteriscos. 
		for (int numeroasteriscos= altura;numeroasteriscos>0;numeroasteriscos--){
            
            for(int i=numeroasteriscos;i>0;i--){
                System.out.print("*");
            }
            System.out.println("");
        }
		
		System.out.println();
		System.out.println();

/////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Crea una aplicación que dibuje una escalera de números, siendo cada linea un numero
		for (int numero=1;numero<=altura;numero++){
            for(int i=0;i<numero;i++){
                System.out.print(numero);
            }
            System.out.println("");
        }
		
		System.out.println();
		System.out.println();
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////

		//Crea una aplicación que dibuje una escalera inversa de números, siendo cada linea un numero
		for (int numero=altura;numero>0;numero--){
            for(int i=numero;i>0;i--){
                System.out.print(numero);
            }
            System.out.println("");
        }
		
		System.out.println();
		System.out.println();
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		//Crea una aplicacion que dibuje un escalera donde cada ultimo escalo sea el numero equivalente al nivel
		for (int numero=1;numero<=altura;numero++){
            for(int i=1;i<=numero;i++){
                System.out.print(i);
            }
            System.out.println("");
        }
		
		System.out.println();
		System.out.println();
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Crea una aplicacion que dibuje un escalera inversa donde cada ultimo escalo sea el numero equivalente al nivel
				for (int numero=altura;numero>0;numero--){
		            for(int i=numero;i>0;i--){
		                System.out.print(i);
		            }
		            System.out.println("");
		        }
				
				System.out.println();
				System.out.println();
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		
		
	}		
		
}


