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
	
	public void reservarRecurso (RecursoBiblioteca recurso, String idUsuario) {
		if(listaElementos.contains(recurso) && recurso.isDisponible()) {
			if (listaReservas.containsKey(recurso.getId())) {
                listaReservas.get(recurso.getId()).add(idUsuario);
            } else {
                ArrayList<String> usuarios = new ArrayList<>();
                usuarios.add(idUsuario);
                listaReservas.put(recurso.getId(), usuarios);
            }
            recurso.reservar();
		}else {
			System.out.println("El recurso no está disponible en esta biblioteca");
		}

	}
	
	
	public void mostrarReservas (){
		System.out.println("\n >> RESERVAS <<");
		System.out.println("---------------");
		for(String id : listaReservas.keySet()) {
			System.out.println("\n  -ID RECURSO: " + id);
			List<String> usuarios = listaReservas.get(id);
			System.out.println("  -RESERVADO POR: ");
			for (String usuario : usuarios) {
				System.out.println("     +Usuario: " + usuario );
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
