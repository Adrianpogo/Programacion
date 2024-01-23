package buscaminas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tablero {

	private char [][] casillas;
	private int numMinas;
	private List<Mina> listaMinas;
	
	public Tablero (int tamaño, int numMinas) {
		this.casillas= new char[tamaño][tamaño];
		this.numMinas=numMinas;
		this.listaMinas= new ArrayList<Mina>();
		
		
	}
	
	public void rellenarTablero () {
		for (int i = 0 ; i < numMinas; i++) {
			Mina mina = crearMina();
			if(!this.listaMinas.contains(mina)) {
				this.listaMinas.add(crearMina());
			}else {
				i--;
			}	
		}
		
		for (Mina mina : listaMinas) {
			casillas[mina.getPosX()][mina.getPosY()] = 'X';
		}
		
		for(int i = 0 ; i < casillas.length; i++) {
			for(int j = 0 ; j < casillas.length; j++) {
				if(casillas[i][j] != 'X') {
					casillas[i][j] = '-' ;
				}
			}
		}
		
		
	}
	
	public Mina crearMina () {
		Random rd = new Random();
		Mina mina = new Mina(rd.nextInt(0,casillas.length), rd.nextInt(0,casillas.length));
		return mina;
	}
	
	public void mostrarTablero () {
		for(int i = 0 ; i < casillas.length; i++) {
			for(int j = 0 ; j < casillas.length; j++) {
				System.out.print(casillas[i][j] + " ");
			}
			System.out.println();
		}
	}
}
