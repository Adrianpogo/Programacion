package appCine;

import java.util.List;

public class Cliente {
	
	private  String nombre;
	private String detallesContacto;

    public Cliente(String nombre, String detallesContacto) {
        this.setNombre(nombre);
        this.setDetallesContacto(detallesContacto);
    }

    public void buscarPeliculas(List<Pelicula> peliculas, String criterio) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().contains(criterio) || pelicula.getGenero().contains(criterio)) {
                System.out.println(pelicula.obtenerDetallesPelicula());
            }
        }
    }

    public void seleccionarHorario(Pelicula pelicula, String horario) {
        if (pelicula.getHorariosDisponibles().contains(horario)) {
            System.out.println("Horario seleccionado: " + horario);
        } else {
            System.out.println("El horario no está disponible para esta película.");
        }
    }

    public Reserva realizarReserva(Pelicula pelicula, int cantidadBoletos, List<String> asientos) {
        return new Reserva(pelicula, this, cantidadBoletos, asientos);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetallesContacto() {
		return detallesContacto;
	}

	public void setDetallesContacto(String detallesContacto) {
		this.detallesContacto = detallesContacto;
	}
	

}
