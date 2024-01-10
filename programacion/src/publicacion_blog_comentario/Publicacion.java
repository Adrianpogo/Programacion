package publicacion_blog_comentario;

import java.util.ArrayList;
import java.util.Date;


public class Publicacion {
	
	/* 
	  Crear una clase llamada "Publicacion" que representa una publicación en el blog.
	  Funciones (métodos):
	    Constructor: Un constructor que inicializa la publicación con un título, contenido y autor.
	    Método "agregarComentario": Un método que permite agregar un comentario a la publicación.
	  Atributos:
	    Título de la publicación (String).
	    Contenido de la publicación (String).
	    Autor de la publicación (String).
	    Fecha de publicación (Date).
	    Una lista de comentarios (List<Comentario>).
	 */
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//ATRIBUTOS
	private String titulo;
	private String contenido;
	private String autor;
	private Date fecha;
	private ArrayList<Comentario> listaComentarios;
	
	
	//CONSTRUCTOR
	public Publicacion(String titulo, String contenido, String autor) {
		this.titulo = titulo;
		this.contenido = contenido;
		this.autor = autor;
		this.fecha = new Date();
		this.listaComentarios= new ArrayList<Comentario>();
	}
	
	//FUNCIONES
	public void agregarComentario (Comentario comentario) {
		listaComentarios.add(comentario);
	}
	
	//GET&SET
	public String getTitulo() {
		return titulo;
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public ArrayList<Comentario> getListaComentarios() {
		return listaComentarios;
	}
	
}

