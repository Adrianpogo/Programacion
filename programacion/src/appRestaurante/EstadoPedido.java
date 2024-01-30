package appRestaurante;

public enum EstadoPedido{
	
	PENDIENTE("Pendiente"), EN_PREPARACION("En preparación"), ENTREGADO("Entregado"), PAGADO("Pagado");
	
	String valor;
	
	// Constructor
	EstadoPedido(String valor){
		this.valor = valor;
	}
	
	// Getter
	public String getValor() {
		return valor;
	}
}
