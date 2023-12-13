package juegosT1;

import java.util.Scanner;

public class NumAleatorioSOL {

	public static void main(String[] args) {
		
		int numAleatorio = (int) (Math.random() * 100);
		int contador = 0;
		
		while(true) {
			int numUsuario = pedirNum();
			contador++;
			if(numUsuario > numAleatorio) {
				System.out.println("El numero buscado es menor");
				
			}else if (numUsuario<numAleatorio) {
				System.out.println("El numero buscado es mayor");
				
			}else {
				System.out.println("Felicidades, ha ganado, numero de intentos: " + contador);
				break;
			}
		}

	}
	
	public static int pedirNum() {
		System.out.println("Introduce un numero entre 0 y 99");
		Scanner sc = new Scanner (System.in);
		int numUsuario;
		
		try {
			numUsuario = sc.nextInt();
		} catch (Exception e) {
			System.err.println("No has introducido un numero");
			return pedirNum();
		}
		
		if(numUsuario<0 || numUsuario>99) {
			System.err.println("Fuera de rango");
			return pedirNum();
		}
		return numUsuario;
		
	}

}
