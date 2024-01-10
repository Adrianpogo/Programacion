package publicacion_blog_comentario;

import java.util.Date;

public class Comentario {

	/* 
	  Crear una clase llamada "Comentario" que representa un comentario en una publicación en el blog.
	  Funciones (métodos):
	    Constructor: Un constructor que inicializa el comentario con un contenido y autor.
	  Atributos:
	    Contenido del comentario (String).
	    Autor del comentario (String).
	    Fecha de comentario (Date).
	 */
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//ATRIBUTOS
	private String contenido;
	private String autor;
	private Date fecha;
	
	
	//CONSTRUCTOR
	public Comentario(String contenido, String autor) {
		this.contenido = contenido;
		this.autor = autor;
		this.fecha = new Date();
	}
	
	//FUNCIONES
	
	
	
	//GET&SET
	public String getContenido() {
		return contenido;
	}
	
	
	public String getAutor() {
		return autor;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
}
