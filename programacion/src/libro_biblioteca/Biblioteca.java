package libro_biblioteca;

import java.util.ArrayList;

public class Biblioteca {

	/*
	 Crear una clase llamada "Biblioteca"
		Funciones (métodos):
			Constructor: Un constructor que acepte un parámetro, el nombre de la biblioteca (cadena de caracteres), 
			y lo utilice para inicializar el atributo de la clase.
			Método "agregarLibro": Un método llamado "agregarLibro" que acepte un objeto de tipo "Libro" como parámetro y
			 	lo agregue a una lista de libros disponibles en la biblioteca.
			Método "prestarLibro": Un método llamado "prestarLibro" que acepte el título de un libro (cadena de caracteres)
			 	como parámetro y verifique si el libro está en la lista de libros disponibles. 
			 	Si está disponible, se marca como prestado y se elimina de la lista de libros disponibles.
			Método "devolverLibro": Un método llamado "devolverLibro" que acepte el título de un libro (cadena de caracteres) 
				como parámetro y verifique si el libro está marcado como prestado. Si es así, se marca como disponible y
				se agrega a la lista de libros disponibles.
			Método "listarLibrosDisponibles": Un método llamado "listarLibrosDisponibles" que no tome ningún parámetro y
				muestre en la consola la lista de libros disponibles en la biblioteca.
			Método "listarLibrosPrestados": Un método llamado "listarLibrosPrestados" que no tome ningún parámetro y 
				 muestre en la consola la lista de libros prestados en la biblioteca.
			Métodos getters y setters de todos los atributos que lo necesiten
		Atributos:
			Un atributo llamado "nombreBiblioteca" de tipo String para almacenar el nombre de la biblioteca.
			Una lista de libros disponibles.
			Una lista de libros prestados.
			
	*/
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//ATRIBUTOS
	private String nombreBiblioteca;
	private ArrayList<Libro> disponibles;
	private ArrayList<Libro> prestados;
	
	//CONSTRUCTOR
	public Biblioteca (String nombreBiblioteca) {
		this.nombreBiblioteca=nombreBiblioteca;
		this.disponibles = new ArrayList<>();
        this.prestados = new ArrayList<>();
	}
	
	//FUNCIONES
	public void agregarLibro (Libro libro) {
		disponibles.add(libro);
		System.out.println("Añadiendo nuevo libro...");
		System.out.println("------------------------------------");
	}
	
	public void prestarLibro (String tituloLibro) {
		for (Libro libro : disponibles) {
			if(libro.getTitulo().equals(tituloLibro)) {
				disponibles.remove(libro);
				prestados.add(libro);
				System.out.println("Prestando un libro...");
				System.out.println("------------------------------------");
				return;
			}
		}
		System.out.println("Prestando un libro... ERROR: No se ha encontrado el libro en la biblioteca");
		System.out.println("------------------------------------");
	}
	
	public void devolverLibro (String tituloLibro) {
		for (Libro libro : prestados) {
			if(libro.getTitulo().equals(tituloLibro)) {
				prestados.remove(libro);
				disponibles.add(libro);
				System.out.println("Devolviendo un libro...");
				System.out.println("------------------------------------");
				return;
			}
		}
		System.out.println("Devolviendo un libro... ERROR: No se ha encontrado el libro en la biblioteca");
		System.out.println("------------------------------------");
	}
	
	public void listarLibrosPrestados() {
        System.out.println(">> Libros prestados:");
        if(prestados.isEmpty()) {
        	System.out.println("- No hay libros prestados");
        	System.out.println("------------------------------------");
        }else {
        	for (Libro libro : prestados) {
                System.out.println("- " + libro.getTitulo());
            }
        	System.out.println("------------------------------------");
        }
        
        
    }

	public void listarLibrosDisponibles() {
		System.out.println(">> Libros disponibles en la biblioteca:");
		if(disponibles.isEmpty()) {
			System.out.println("- No hay libros disponibles");
			System.out.println("------------------------------------");
		}else {
			for (Libro libro : disponibles) {
				System.out.println("- " + libro.getTitulo());
			}
			System.out.println("------------------------------------");
		}
		
		
	}
	
	//GET&SET
	public String getNombreBiblioteca() {
		return nombreBiblioteca;
	}
	public void setNombreBiblioteca(String nombreBiblioteca) {
		this.nombreBiblioteca = nombreBiblioteca;
	}
	public ArrayList<Libro>  getDisponibles() {
		return disponibles;
	}
	public void setDisponibles(ArrayList<Libro>  disponibles) {
		this.disponibles = disponibles;
	}
	public ArrayList<Libro>  getPrestados() {
		return prestados;
	}
	public void setPrestados(ArrayList<Libro>  prestados) {
		this.prestados = prestados;
	}
	
}
