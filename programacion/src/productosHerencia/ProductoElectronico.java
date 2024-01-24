package productosHerencia;

public class ProductoElectronico extends Producto{
	
	
	private String marca;
	private String modelo;
	
	public ProductoElectronico(String nombre, double precio, int cantidadDisponible, String marca, String modelo) {
		super(nombre, precio, cantidadDisponible);
		this.marca = marca ;
		this.modelo = modelo;
	}
	
	@Override
	public void mostrarInfo () {
		super.mostrarInfo();
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	

}
