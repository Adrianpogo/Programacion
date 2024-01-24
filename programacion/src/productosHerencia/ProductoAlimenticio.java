package productosHerencia;

public class ProductoAlimenticio extends Producto{


	private String fechaCaducidad;
	
	public ProductoAlimenticio(String nombre, double precio, int cantidadDisponible, String fechaCaducidad) {
		super(nombre, precio, cantidadDisponible);
		this.fechaCaducidad = fechaCaducidad ;
	}
	
	public void verificarCaducidad() {
		
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

}
