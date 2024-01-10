package libro_biblioteca;

public class Libro {

	/*
	Crear una clase llamada "Libro"
		Funciones (métodos):
			Constructor: Un constructor que acepte tres parámetros, el título (cadena de caracteres), el autor (cadena de caracteres) y 
			el año de publicación (entero), y los utilice para inicializar los atributos de la clase.
			Métodos getters y setters de todos los atributos
		Atributos:
			Un atributo llamado "título" de tipo String para almacenar el título del libro.
			Un atributo llamado "autor" de tipo String para almacenar el autor del libro.
			Un atributo llamado "añoPublicación" de tipo entero para almacenar el año de publicación del libro.
	*/
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// ATRIBUTOS
	private String titulo;
	private String autor;
	private int anioPublicacion;
	
	
	// CONSTRUCTOR
	public Libro (String titulo, String autor, int anioPublicacion) {
		this.titulo=titulo;
		this.autor=autor;
		this.anioPublicacion=anioPublicacion;
	}
	
	// FUNCIONES

	
	// GET&SET
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
}
