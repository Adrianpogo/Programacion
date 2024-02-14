package appBiblioteca;

public class Libro extends RecursoBiblioteca{

	// Atributos
	private String autor;
	private String editorial;
	

	// Constructor
	public Libro(String id, String titulo, int añoPublicacion, String autor, String editorial) {
		super(id, titulo, añoPublicacion);
		this.autor=autor;
		this.editorial=editorial;
	}

	// Métodos
	//Función para mostrar la información de un libro
	@Override
	public void mostrarInfo () {
		super.mostrarInfo();
		System.out.println("  - Tipo de Recusro: Libro");
		System.out.println("  - Autor: " + autor);
		System.out.println("  - Editorial: " + editorial);
	}

	// Getters&Setters
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
}
