package producto_tienda;

public class Producto {

	/*
	 
	Crear una clase llamada "TiendaOnline"
		Funciones (métodos):
			Constructor: Un constructor que acepte 2 parámetros, el nombre del producto (cadena de caracteres) y el precio del producto,
				y lo utilice para inicializar el atributo de la clase.
			Métodos getters y setters de todos los atributos que lo necesiten
		Atributos:
			nombre: Almacena el nombre del producto como una cadena de caracteres.
			precio: Almacena el precio del producto como un número decimal (double).
			cantidadEnStock: Almacena la cantidad en stock del producto como un número entero (int).	  
	*/

	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//ATRIBUTOS
	private String nombre;
	private double precio;
	private int cantidadStock;
	
	
	//CONSTRUCTOR
	public Producto(String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
		this.cantidadStock=0;
		
	}
	
	
	//FUNCIONES
	
	
	
	//GET&SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidadStock() {
		return cantidadStock;
	}
	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}
}
