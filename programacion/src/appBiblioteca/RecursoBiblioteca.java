package appBiblioteca;

public class RecursoBiblioteca {
	
	//Atributos
	private String id;
	private String titulo;
	private int añoPublicacion;
	
	
	//Constructor
	public RecursoBiblioteca(String id, String titulo, int añoPublicacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
	}
	
	//Métodos
	public void reservar() {
		
	}
	
	public void devolver () {
		
	}
	
	public void mostrarInfo () {
		System.out.println("\n>> RECURSO " + id);
		System.out.println("  - Titulo: " + titulo);
		System.out.println("  - Año de publicación: " + añoPublicacion);
	}
	
	//Getters&Setters
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
}
