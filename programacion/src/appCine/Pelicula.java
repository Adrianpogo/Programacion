package appCine;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	
	String titulo;
    String genero;
    int duracion;
    List<String> horariosDisponibles;

    public Pelicula(String titulo, String genero, int duracion, List<String> horariosDisponibles) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.horariosDisponibles = new ArrayList<>(horariosDisponibles); // Crear una nueva lista modificable
    }

    public String obtenerDetallesPelicula() {
        return "Título: " + titulo + ", Género: " + genero + ", Duración: " + duracion + " minutos";
    }

    public List<String> listarHorariosDisponibles() {
        return horariosDisponibles;
    }

    public void actualizarDisponibilidadAsientos(List<String> asientosSeleccionados) {
        for (String asiento : asientosSeleccionados) {
            if (horariosDisponibles.contains(asiento)) {
                horariosDisponibles.remove(asiento);
            } else {
                System.out.println("El asiento " + asiento + " no está disponible.");
            }
        }
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<String> getHorariosDisponibles() {
		return horariosDisponibles;
	}

	public void setHorariosDisponibles(List<String> horariosDisponibles) {
		this.horariosDisponibles = horariosDisponibles;
	}
	

}
