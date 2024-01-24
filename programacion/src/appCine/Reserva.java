package appCine;

import java.util.List;

public class Reserva {
	 Pelicula pelicula;
	    Cliente cliente;
	    int cantidadBoletos;
	    List<String> asientosSeleccionados;
	    double costoTotal;

	    public Reserva(Pelicula pelicula, Cliente cliente, int cantidadBoletos, List<String> asientosSeleccionados) {
	        this.pelicula = pelicula;
	        this.cliente = cliente;
	        this.cantidadBoletos = cantidadBoletos;
	        this.asientosSeleccionados = asientosSeleccionados;
	        this.costoTotal = calcularCostoTotal();
	    }

	    private double calcularCostoTotal() {
	        return cantidadBoletos * 8.99; 
	    }

		public String generarConfirmacionReserva() {
			return "---------------------------------------------\n"
					+ "Confirmación de Reserva:\n" + cliente.getNombre()
					+ " ha reservado " + cantidadBoletos + " boletos para la película '" + pelicula.getTitulo() + "'.\n"
					+ "Asientos: " + asientosSeleccionados + "\nCosto Total: $" + costoTotal 
					+ "\n---------------------------------------------\n";
		}

	    public void enviarConfirmacionPorCorreo() {
	        // Lógica para enviar correo electrónico (simplificada)
	        System.out.println("\n>> Enviando confirmación por correo a: " + cliente.getDetallesContacto());
	        System.out.println("Contenido del correo:\n" + generarConfirmacionReserva());
	    }
}
