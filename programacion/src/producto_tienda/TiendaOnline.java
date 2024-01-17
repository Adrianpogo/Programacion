package producto_tienda;

import java.util.ArrayList;

public class TiendaOnline {

	/*
	 
	Crear una clase llamada "TiendaOnline"
		Funciones (métodos):
			Constructor: Un constructor que acepte un parámetro, el nombre de la tienda (cadena de caracteres),
				y lo utilice para inicializar el atributo de la clase.
			Método "agregarProducto": Un método llamado "agregarProducto" que acepte un objeto de tipo "Producto"
				como parámetro y lo agregue a la lista de productos disponibles en la tienda.
			Método "realizarCompra": Un método llamado "realizarCompra" que acepte el nombre de un producto (cadena de caracteres)
			 	y la cantidad deseada (entero) como parámetros. Este método debe verificar si el producto
			 	está disponible en la tienda y si hay suficiente cantidad en stock para realizar la compra.
			 	Si es así, debe restar la cantidad comprada del stock y calcular el costo total de la compra.
			Método "agregarStock": Un método llamado "agregarStock" que acepte el nombre de un producto (cadena de caracteres)
				y la cantidad a agregar al stock (entero) como parámetros.
				Este método debe aumentar la cantidad en stock del producto en la tienda.
			Método "listarProductosDisponibles": Un método llamado "listarProductosDisponibles"
				que no tome ningún parámetro y muestre en la consola la lista de productos disponibles en la tienda,
				incluyendo su nombre, precio y cantidad en stock.
			Métodos getters y setters de todos los atributos que lo necesiten
		Atributos:
			Un atributo llamado "nombreTienda" de tipo String para almacenar el nombre de la tienda.
			Una lista de productos disponibles en la tienda, donde cada producto es un objeto de tipo "Producto" que tiene nombre, precio y cantidad en stock. 
		  
	*/
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//ATRIBUTOS
	private String nombre;
	private ArrayList<Producto> productosDisponibles;
	
	//CONSTRUCTOR
	public TiendaOnline (String nombre) {
		this.nombre=nombre;
		this.productosDisponibles= new ArrayList<Producto>();
	}
	
	//FUNCIONES
	public void agregarProducto (Producto producto) {
		productosDisponibles.add(producto);
		System.out.println(">> Añadiendo " + producto.getNombre() + " ... ");
	}
	
	public void realizarCompra (String nombreProducto, int cantidad) {
		for(Producto producto : productosDisponibles) {
			if(producto.getNombre().equals(nombreProducto)) {
				int stockActual = producto.getCantidadStock();
				if(cantidad<=stockActual) {
					double costo = cantidad * producto.getPrecio();
					producto.setCantidadStock(stockActual-cantidad);
					System.out.println("- Producto: " + producto.getNombre() + " || Precio: " + producto.getPrecio() + " || Cantidad: " + cantidad);
					System.out.println("El costo de la compra es: " + costo + "€\n");
					return;
				}else {
					System.out.println("ERROR: No hay suficiente stock para realizar la compra\n");
					return;
				}
			}
		}
		System.out.println("ERROR: No existe el producto para la compra\n");
		
		
	}
	 
	public void agregarStock (String nombreProducto, int cantidad) {
		for (Producto producto: productosDisponibles) {
			int stockActual = producto.getCantidadStock();
			if(producto.getNombre().equals(nombreProducto)) {
				producto.setCantidadStock(stockActual+cantidad);
				System.out.println("Modificando stock de: " + producto.getNombre() + " || " + stockActual + " --> " + producto.getCantidadStock());
				return;
			}
		}
		System.out.println("Modificando stock ... ERROR: No existe el producto especificado");
	}
	
	public void listarProductosDisponibles () {
		if(productosDisponibles.isEmpty()) {
			System.out.println("La tienda aún está vacía ");
		}else {
			System.out.println(">> LISTA DE PRODUCTOS");
			System.out.println("________________________________________________\n");
			for (Producto producto : productosDisponibles) {
				System.out.println("- " + producto.getNombre() + "(" + producto.getPrecio() + "€) --> Stock: "  + producto.getCantidadStock() + "\n");
			}
		}
		
	}
	 
	
	
	//GET&SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Producto> getProductosDisponibles() {
		return productosDisponibles;
	}
	public void setProductosDisponibles(ArrayList<Producto> productosDisponibles) {
		this.productosDisponibles = productosDisponibles;
	}
	
}
