package appBiblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
	
	//Atributos
	private String nombre;
	private Map<String, List<String>> listaReservas ;
	private List<RecursoBiblioteca> listaElementos;
	
	//Constructor
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		this.listaElementos = new ArrayList<RecursoBiblioteca>();
		this.listaReservas = new HashMap<String, List<String>>();
	}
	
	//Métodos
	//Función para añadir un Libro o Revista a la biblioteca
	public void añadirRecurso (RecursoBiblioteca recurso){
		if(!listaElementos.contains(recurso)) {
			listaElementos.add(recurso);
		}
	}
	
	//Función para buscar una Revista por tema
	public void buscarTema (String tema) {
		System.out.println("____________________________________________________________");
		System.out.println("\nRevistas encontradas con el tema (" + tema + ") : ");
		for(RecursoBiblioteca elemento : listaElementos) {
			try {
				Revista revista = (Revista)elemento;
				if(revista.getTema().equals(tema)) {
					revista.mostrarInfo();
				}
			} catch (Exception e) {
				
			}
		}
	}
	
	//Función para buscar un libro por autor
	public void buscarAutor (String autor) {
		System.out.println("____________________________________________________________");
		System.out.println("\nLibros encontrados con el autor (" + autor + ") : ");
		for(RecursoBiblioteca elemento : listaElementos) {
			try {
				Libro libro = (Libro)elemento;
				if(libro.getAutor().equals(autor)) {
					libro.mostrarInfo();
				}
				
			} catch (Exception e) {
				
			}
		}
	}
	
	
	//Getters&Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Map<String, List<String>> getListaReservas() {
		return listaReservas;
	}
	public void setListaReservas(Map<String, List<String>> listaReservas) {
		this.listaReservas = listaReservas;
	}
	public List<RecursoBiblioteca> getListaElementos() {
		return listaElementos;
	}
	public void setListaElementos(List<RecursoBiblioteca> listaElementos) {
		this.listaElementos = listaElementos;
	}

}
