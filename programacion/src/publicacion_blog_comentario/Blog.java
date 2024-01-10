package publicacion_blog_comentario;

import java.util.ArrayList;

public class Blog {

	/* 
	  Crear una clase llamada "Blog" que representa un blog en línea.
	  Funciones (métodos):
	    Constructor: Un constructor que inicializa el blog con un nombre.
	    Método "agregarPublicacion": Un método que permite agregar una publicación al blog.
	    Método "agregarComentario": Un método que permite a los usuarios agregar comentarios a una publicación.
	    Método "buscarPublicacionesPorAutor": Un método que busca publicaciones por el nombre del autor y
	     	devuelve una lista de publicaciones.
	    Método "obtenerComentariosDePublicacion": Un método que devuelve una lista de comentarios de una
	     	publicación específica.
	  Atributos:
	    Nombre del blog (String).
	    Una lista de publicaciones (List<Publicacion>).
	 */
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//ATRIBUTOS
	private String nombre;
	private ArrayList<Publicacion> listaPublicaciones;
	
	//CONSTRUCTOR
	public Blog(String nombre ) {
		this.nombre = nombre;
		this.listaPublicaciones = new ArrayList<Publicacion>();
	}

	//FUNCIONES
	public void agregarPublicacion(Publicacion publicacion) {
		listaPublicaciones.add(publicacion);
	}
		
	public void agregarComentario (Publicacion publicacion, Comentario comentario) {
			if(listaPublicaciones.contains(publicacion)) {
				publicacion.agregarComentario(comentario);
			}else {
				System.out.println("El blog no contiene la publicación indicada");
			}
		}
	
	public ArrayList<Publicacion> buscarPublicacionesPorAutor (String autor) {
		ArrayList<Publicacion> publicacionesPorAutor = new ArrayList<>();
		for(Publicacion publicacion : listaPublicaciones) {
			if(publicacion.getAutor().equals(autor)) {
				publicacionesPorAutor.add(publicacion);
			}
		}
		return publicacionesPorAutor;
	}
	
	public ArrayList<Comentario> obtenerComentariosDePublicacion (Publicacion publicacion) {
		  if (listaPublicaciones.contains(publicacion)) {
	            return publicacion.getListaComentarios();
	        } else {
	            System.out.println("La publicación no está en el blog.");
	            return new ArrayList<>();
	        }
	}
	
	//GET&SET
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Publicacion> getListaPublicaciones() {
		return listaPublicaciones;
	}
}
