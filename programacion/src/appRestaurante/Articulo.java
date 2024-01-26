package appRestaurante;

public class Articulo {
	
	//Atributos
	private String nombre;
	private String descripcion;
	private double precio;
	private boolean disponible;

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Constructor
	public Articulo (String nombre, String descripcion, double precio) {
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.precio=precio;
		this.disponible=true;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Métodos
	public void agotarProducto(){
		if(disponible) {
			disponible=false;
		}else {
			System.out.println("El producto ya está agotado");
		}
	}
	
	public void reponerProducto(){
		if(!disponible) {
			disponible=true;
		}else {
			System.out.println("El producto ya está disponible, no es necesario reponerlo");
		}
	}

	public void mostrarInfo() {
		System.out.println("\n- Artículo: " + nombre);
			System.out.println("Descripcion: " + descripcion);
			System.out.println("Precio: " + precio + "€");
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Getter&Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
