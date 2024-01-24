package appCine;

import java.util.ArrayList;
import java.util.List;

public class Cine {
	
	 private List<Pelicula> peliculas;
	 private List<Reserva> reservas;

	    public Cine() {
	        this.peliculas = new ArrayList<Pelicula>();
	        this.reservas = new ArrayList<Reserva>();
	    }

	    public void agregarPelicula(Pelicula pelicula) {
	        peliculas.add(pelicula);
	    }

	    public Reserva realizarReserva(Cliente cliente, Pelicula pelicula, int cantidadBoletos, List<String> asientos) {
	        if (peliculas.contains(pelicula)) {
	            if (verificarDisponibilidadAsientos(pelicula, asientos)) {
	                Reserva reserva = new Reserva(pelicula, cliente, cantidadBoletos, asientos);
	                reservas.add(reserva);
	                actualizarDisponibilidadAsientos(pelicula, asientos);
	                reserva.enviarConfirmacionPorCorreo();
	                return reserva;
	            } else {
	                System.out.println("\n>> ERROR: Alguno de los asientos seleccionados en la reserva no está disponible.");
	            }
	        } else {
	            System.out.println("\n>> ERROR: La película seleccionada no está disponible en este cine.");
	        }
	        return null;
	    }

	    private boolean verificarDisponibilidadAsientos(Pelicula pelicula, List<String> asientosSeleccionados) {
	        for (String asiento : asientosSeleccionados) {
	            if (!pelicula.getHorariosDisponibles().contains(asiento)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    private void actualizarDisponibilidadAsientos(Pelicula pelicula, List<String> asientosSeleccionados) {
	        pelicula.actualizarDisponibilidadAsientos(asientosSeleccionados);
	    }

	    public List<Reserva> obtenerHistorialReservas() {
	        return reservas;
	    }
	
	

}
