package appBiblioteca;

public class RecursoBiblioteca {
	
	//Atributos
	private String id;
	private String titulo;
	private int añoPublicacion;
	private boolean disponible;
	
	
	//Constructor
	public RecursoBiblioteca(String id, String titulo, int añoPublicacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		disponible=true;
	}
	
	//Métodos
	public void reservar() {
		if(disponible) {
			this.disponible= false;
		}else {
			System.out.println("--> El libro ya está reservado");
		}
	}
	
	public void devolver () {
		if(!disponible) {
			this.disponible= true;
		}else {
			System.out.println("--> El libro ya está en la biblioteca");
		}
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

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
