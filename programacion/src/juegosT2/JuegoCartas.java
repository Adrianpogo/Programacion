package juegosT2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class JuegoCartas {

	public static void main(String[] args) {

		HashMap<String, ArrayList<String[]>> baraja = new HashMap<String, ArrayList<String[]>>();
		generarBaraja(baraja);

		// Añadimos 4 jugadores a la mesa
		HashMap<String, ArrayList<String[]>> mesa = new HashMap<String, ArrayList<String[]>>();
		mesa.put("Luis", null);
		mesa.put("Andrea", null);
		mesa.put("Cristian", null);
		mesa.put("Adrian", null);

		// Repartimos las cartas
		repartirCartas(mesa, baraja, "Luis");
		repartirCartas(mesa, baraja, "Andrea");
		repartirCartas(mesa, baraja, "Cristian");
		repartirCartas(mesa, baraja, "Adrian");

		verCartas(mesa);

		// Ver las cartas restantes

		// Ver cartas de un jugador

		// Usar cartas de un jugador

		// Ver cartas de todos los jugadores

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
				String[] carta = { "oros", i + "" };
				oros.add(carta);
			} else if (i > 12 && i <= 24) {
				String[] carta = { "espadas", (i - 12) + "" };
				espadas.add(carta);
			} else if (i > 24 && i <= 36) {
				String[] carta = { "copas", (i - 24) + "" };
				copas.add(carta);
			} else {
				String[] carta = { "bastos", (i - 36) + "" };
				bastos.add(carta);
			}
		}

		// Añadimos los palos al diccionario
		baraja.put("copas", copas);
		baraja.put("espadas", espadas);
		baraja.put("bastos", bastos);
		baraja.put("oros", oros);

	}

	// Función para imprimir la baraja de cartas
	public static void imprimirBaraja(HashMap<String, ArrayList<String[]>> baraja) {
		for (String clave : baraja.keySet()) {
			System.out.println("\nCartas de " + clave + ": ");
			for (String[] carta : baraja.get(clave)) {
				System.out.println("   Palo: " + carta[0] + ", Carta: " + carta[1]);
			}
			System.out.println("___________________________________");

		}
	}

	// Función para generar una carta
	public static void generarCarta(String palo, HashMap<String, ArrayList<String[]>> mesa,
			HashMap<String, ArrayList<String[]>> baraja, ArrayList<String[]> manoJugador) {

		Random rd = new Random();
		int carta = rd.nextInt(1, 13);
		String[] cartaJugador = { palo, carta + "" };
		boolean valido = false;

		while (!valido) {
			if (!cartaRepartida(cartaJugador, baraja)) {
				manoJugador.add(cartaJugador);
				eliminarCarta(cartaJugador, baraja);
				valido = true;
			}
		}

	}

	// Función para comprobar si una carta es repetida
	public static boolean cartaRepartida(String[] cartaJugador, HashMap<String, ArrayList<String[]>> baraja) {
		return true;
	}

	// Función para eliminar una carta de la baraja
	public static void eliminarCarta(String[] cartaJugador, HashMap<String, ArrayList<String[]>> baraja) {

	}

	// Función para repartir 2 cartas a cada jugador
	public static void repartirCartas(HashMap<String, ArrayList<String[]>> mesa,
			HashMap<String, ArrayList<String[]>> baraja, String jugador) {

		Random rd = new Random();
		ArrayList<String[]> manoJugador = new ArrayList<String[]>();

		for (int i = 0; i < 2; i++) {
			int palo = rd.nextInt(4);

			switch (palo) {
			case 0: {
				generarCarta("oros", mesa, baraja, manoJugador);

				break;
			}
			case 1: {
				generarCarta("espadas", mesa, baraja, manoJugador);

				break;
			}
			case 2: {
				generarCarta("copas", mesa, baraja, manoJugador);

				break;
			}
			case 3: {
				generarCarta("bastos", mesa, baraja, manoJugador);

				break;
			}
			default:
				break;
			}

		}

		mesa.put(jugador, manoJugador);

	}

	// Función para ver las cartas de un jugador en concreto
	public static void verCartasJugador(HashMap<String, ArrayList<String[]>> mesa, String jugador) {
		System.out.println("Jugador: " + jugador);

		for (String[] mano : mesa.get(jugador)) {
			System.out.println(mano[1] + " de " + mano[0]);
		}

	}

	// Función para ver las cartas de todos los jugadores
	public static void verCartas(HashMap<String, ArrayList<String[]>> mesa) {
		for (String clave : mesa.keySet()) {
			System.out.println("Jugador: " + clave);

			for (String[] mano : mesa.get(clave)) {
				System.out.println(mano[1] + " de " + mano[0]);
			}
			System.out.println();
		}
	}

	// Función para devolver las cartas de un jugador a la barja
	public static void usarCartas(HashMap<String, ArrayList<String[]>> mesa,
			HashMap<String, ArrayList<String[]>> baraja, String jugador) {

	}

}
