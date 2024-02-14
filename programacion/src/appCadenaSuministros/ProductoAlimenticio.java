package appCadenaSuministros;

public class ProductoAlimenticio {
	
	//Atributos
	private String idProducto;
	private String nombre;
	private String fechaCaducidad;
	private String origen;
	
	//Constructor
	public ProductoAlimenticio(String idProducto, String nombre, String fechaCaducidad, String origen) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.fechaCaducidad = fechaCaducidad;
		this.origen = origen;
	}
	
	//Métodos
	public void verificarCaducidad () {
		System.out.println("La fecha de caducidad de: " + nombre + " es --> " + fechaCaducidad + "\n");
	}
	
	public void mostrarInfo(){
		System.out.println("\n>> " + 	nombre.toUpperCase());
		System.out.println("    - ID: " + idProducto);
		System.out.println("    - Fecha de caducidad: " + fechaCaducidad);
		System.out.println("    - Origen: " + fechaCaducidad);
	}
	
	//Getters&Setters
	public String getIdProducto() {
		return idProducto;
	}
	
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	

}
