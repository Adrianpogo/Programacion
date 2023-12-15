package ejerciciosT2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class NumerosAleatorio {

	public static void main(String[] args) {

		HashMap<Integer, ArrayList<Integer>> mapa = new HashMap<Integer, ArrayList<Integer>>();

		Random rd = new Random();
		int numero;

		
		for (int i = 0; i < 10000; i++) {
			numero = rd.nextInt(1, 11);

			// Si el mapa no contiene el numero como clave creamos una nueva clave
			if (!mapa.containsKey(numero)) {
				ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
				listaNumeros.add(numero);
				mapa.put(numero, listaNumeros);
			} else {
				mapa.get(numero).add(numero);
			}
		}

		int contador = 0;
		for (Integer clave : mapa.keySet()) {
			System.out.println("El número de veces que se repite el " + clave + " es: " + mapa.get(clave).size());
			contador += mapa.get(clave).size();
		}

		System.out.println(contador);

	}

}
