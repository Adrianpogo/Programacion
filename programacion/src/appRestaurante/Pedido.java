package appRestaurante;

import java.util.Map;

public class Pedido {

	
	//Atributos
	private int mesaPedido;
	private Map<Articulo, Integer> articulosPedido;
	private EstadoPedido estadoPedido;
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Constructor
	public Pedido (int mesaPedido, Map<Articulo, Integer> articulosPedido) {
		this.mesaPedido=mesaPedido;
		this.articulosPedido=articulosPedido;
		this.estadoPedido=EstadoPedido.PENDIENTE;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Métodos
	public double calcularTotal() {
		double total = 0;

		for (Articulo articulo : articulosPedido.keySet()) {
			total += (articulo.getPrecio()* articulosPedido.get(articulo));
		}

		return total;
	}
	
	public void actualizarEstado(EstadoPedido estado) {
		this.estadoPedido=estado;
	}
	
	public void mostrarInfo() {
		System.out.println("- Mesa: " + mesaPedido);
		for(Articulo articulo : articulosPedido.keySet()) {
			System.out.println("Articulo: " + articulo.getNombre() + " (" + articulosPedido.get(articulo) + ")");
			System.out.println("Descripcion: " + articulo.getDescripcion());
			System.out.println("Precio: " + (articulo.getPrecio()*articulosPedido.get(articulo)) + "€");
			
		}
		System.out.println("\n\nPrecio TOTAL: " + calcularTotal());
		System.out.println("Estado: " + estadoPedido.getValor());
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Getter & Setter
	public int getMesaPedido() {
		return mesaPedido;
	}
	public void setMesaPedido(int mesaPedido) {
		this.mesaPedido = mesaPedido;
	}
	public Map<Articulo, Integer> getArticulosPedido() {
		return articulosPedido;
	}
	public void setArticulosPedido(Map<Articulo, Integer> articulosPedido) {
		this.articulosPedido = articulosPedido;
	}
	public EstadoPedido getEstadoPedido() {
		return estadoPedido;
	}
	public void setEstadoPedido(EstadoPedido estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	
	
	
}
