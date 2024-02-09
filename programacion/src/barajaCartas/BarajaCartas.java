package barajaCartas;

import java.util.ArrayList;
import java.util.List;

public class BarajaCartas {
	
	//Atributos
	private List<Carta> baraja;
	
	//Constructor
	public BarajaCartas () {
		this.baraja= new ArrayList<Carta>();
		String[] palos = {"oros", "espadas", "copas", "bastos"};
		int[] valores = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		//Creamos la baraja creando un objeto Carta por cada combinación de palos  y valores
		for(String palo : palos) {
			for(int valor : valores) {
				baraja.add(new Carta(palo, valor));
			}
		}
	
	}
	
	//Métodos
	public Carta crearCarta (String palo, int valor) {
		return new Carta(palo, valor);
	}
	
	//Getters&Setters
	public List<Carta> getBaraja() {
		return baraja;
	}
	public void setBaraja(List<Carta> baraja) {
		this.baraja = baraja;
	}

	/*************************************************  C A R T A   *****************************************/
	
	//Clase privada
	private class Carta {
		
		//Atributos CP
		private int valor;
		private String palo;
		
		//Constructor CP
		public Carta (String palo, int valor) {
			this.palo=palo;
			this.valor=valor;
		}
		
		//Métodos CP
		public String toString() {
			return "\nPalo: " + palo + " | Valor: " + valor ;
		}
		
		//Sobreescribimos la función equals para que se considere que una carta es igual a otra si su valor y palo coincide
		public boolean equals (Carta carta) {
			return (this.valor==carta.valor && this.palo.equals(carta.palo));
		}
		
		//Sobreescribimos la función HashCode para que cada palo empiece por 1,2,3,4 y el siguiente valor sea su id (de 00 a 12)
		public int hashCode(){
			int numCode = 0;
			switch (palo) {
			case "espadas": {
				numCode = numCode + 200 + valor;
				break;
			}
			case "copas": {
				numCode = numCode + 300 + valor;
				break;
			}
			case "bastos": {
				numCode = numCode + 400 + valor;
				break;
			}
			default:
				numCode = numCode + 100 + valor;
			}
			
			
			return numCode;
		}
		
		//Getter&Setter
		
	}
	
	/************************************************  M A I N   *********************************************/
	
	public static void main(String[] args) {
		BarajaCartas baraja = new BarajaCartas();
		
		Carta cartaBuscada = baraja.crearCarta("espadas", 2);
		
		for(Carta carta : baraja.getBaraja()) {
			//Se imprime el valor del objeto ya que se aplica el .toString
			System.out.println(carta);
			System.out.println("HashCode: " + carta.hashCode());
			if(carta.equals(cartaBuscada)) {
				System.out.println(">> Esta carta la carta buscada");
			}
		}
	}

	
}
