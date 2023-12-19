package juegosT2;

import java.util.ArrayList;
import java.util.HashMap;

public class JuegoCartas {

	public static void main(String[] args) {

		HashMap<String, ArrayList<String[]>> baraja = new HashMap<String, ArrayList<String[]>>();
		generarBaraja(baraja);
		imprimirBaraja(baraja);
		
	}

	// Función para generar la baraja de cartas
	public static void generarBaraja(HashMap<String, ArrayList<String[]>> baraja) {
		// Añadimos las carta a cada palo
		ArrayList<String[]> oros = new ArrayList<String[]>();
		ArrayList<String[]> espadas = new ArrayList<String[]>();
		ArrayList<String[]> bastos = new ArrayList<String[]>();
		ArrayList<String[]> copas = new ArrayList<String[]>();

		// Generamos las cartas de cada palo
		
		for (int i = 1; i < 49; i++) {

			if (i <= 12) {
				String[] carta = { "OroS", i+"" };
				oros.add(carta);
			} else if (i > 12 && i <= 24) {
				String[] carta = { "Espadas", (i-12)+ "" };
				espadas.add(carta);
			} else if (i > 24 && i <= 36) {
				String[] carta = { "Copas", (i-24) + "" };
				copas.add(carta);
			} else {
				String[] carta = { "Bastos", (i-36) + "" };
				bastos.add(carta);
			}
		}

		// Añadimos los palos al diccionario
		baraja.put("copas", copas);
		baraja.put("espadas", espadas);
		baraja.put("bastos", bastos);
		baraja.put("oros", oros);

	}
	
	public static void imprimirBaraja (HashMap<String, ArrayList<String[]>> baraja) {
		for (String clave : baraja.keySet()) {
			System.out.println("\nCartas de " + clave + ": " );
			ArrayList<String[]> palo = baraja.get(clave);
			for (String[]carta : palo) {
				System.out.println("   Palo: " + carta[0] + ", Carta: " + carta[1]);
			}
			System.out.println("___________________________________");
			
		}
	}
}
