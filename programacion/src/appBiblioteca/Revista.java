package appBiblioteca;

public class Revista extends RecursoBiblioteca{

	
	// Atributos
	private int numero;
	private String tema;
	
	
	// Constructor
	public Revista(String id, String titulo, int añoPublicacion, int numero, String tema) {
		super(id, titulo, añoPublicacion);
		this.numero=numero;
		this.tema=tema;
	}


	// Métodos
	//Función para mostrar la información de una revista
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("  - Tipo de Recusro: Revista");
		System.out.println("  - Número: " + numero);
		System.out.println("  - Tema: " + tema);
	}

	// Getters&Setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
}
