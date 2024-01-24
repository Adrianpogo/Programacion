package appCine;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		// Crear instancias de películas
        Pelicula pelicula1 = new Pelicula("Inception", "Sci-Fi", 150, Arrays.asList("A1", "A2", "B1", "B2"));
        Pelicula pelicula2 = new Pelicula("The Shawshank Redemption", "Drama", 142, Arrays.asList("C1", "C2", "D1", "D2"));
        Pelicula pelicula3 = new Pelicula("The Shawshank Redemption 2", "Drama", 134, Arrays.asList("C1", "C2", "D1", "D2"));
        
        // Crear instancia de cine
        Cine cine = new Cine();
        cine.agregarPelicula(pelicula1);
        cine.agregarPelicula(pelicula2);

        // Crear instancia de cliente
        Cliente cliente1 = new Cliente("Juan", "juan@example.com");
        Cliente cliente2 = new Cliente("Sofia", "sofia@example.com");

        // Realizar reserva
        Reserva reserva1 = cine.realizarReserva(cliente1, pelicula1, 2, Arrays.asList("A1", "A2"));
        Reserva reserva2 = cine.realizarReserva(cliente2, pelicula2, 3, Arrays.asList("A1", "A2"));
        Reserva reserva3 = cine.realizarReserva(cliente2, pelicula3, 3, Arrays.asList("A1", "A2"));
        Reserva reserva4 = cine.realizarReserva(cliente2, pelicula2, 3, Arrays.asList("C1", "C2", "D1"));

        // Imprimir historial de reservas
        System.out.println("\nHistorial de Reservas:");
        for (Reserva r : cine.obtenerHistorialReservas()) {
            System.out.println(r.generarConfirmacionReserva());
        }

	}

}
