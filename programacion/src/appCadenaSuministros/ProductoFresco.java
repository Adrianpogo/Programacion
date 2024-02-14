package appCadenaSuministros;

public class ProductoFresco extends ProductoAlimenticio {

	// Atributos
	private String fechaEnvasado;
	private double temperaturaRecomendada;

	// Constructor
	public ProductoFresco(String idProducto, String nombre, String fechaCaducidad, String origen, String fechaEnvasado,
			double temperaturaRecomendada) {
		
		super(idProducto, nombre, fechaCaducidad, origen);
		this.fechaEnvasado = fechaEnvasado;
		this.temperaturaRecomendada=temperaturaRecomendada;
	}

	// Métodos
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("    - Fecha de envasado: " + fechaEnvasado);
		System.out.println("    - Temperatura de conservación: " + temperaturaRecomendada);
	}
	
	public void mostrarRecomendaciones () {
		System.out.println("\n>> Para el producto: " + getNombre().toUpperCase() + " se recomienda...");
		System.out.println("    - Consumir antes de: " + getFechaCaducidad());
		System.out.println("    - Conservar a: " + temperaturaRecomendada + "ºC");
	}

	// Getters&Setters
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public double getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}

	public void setTemperaturaRecomendada(double temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

}
