package clases;

import java.util.HashMap;

public class TiendaEnLinea {

	/*
	 Propiedades de Clase:
		inventario: Un mapa que almacena los productos disponibles y su cantidad en stock.
		precios: Un mapa que mantiene los precios de los productos en el inventario.
		carrito: Un mapa que representa el carrito de compras actual.
		saldoTotal: Un valor que registra el saldo total acumulado por las ventas.
		
		
	Funciones:
		agregarProducto(String producto, int cantidad, double precio): 
			Agrega un producto al inventario con una cantidad inicial y un precio.

		agregarAlCarrito(String producto, int cantidad): 
			Agrega un producto al carrito de compras.
		
		mostrarCarrito(): 
			Muestra el contenido actual del carrito de compras.

		calcularTotal():
			Calcula el precio total de los productos en el carrito.

		procesarPago(double monto): 
			Procesa el pago y actualiza el saldo de la tienda.

		mostrarSaldoTotal(): 
			Muestra el saldo total acumulado por todas las ventas.

		eliminarDelCarrito(String producto, int cantidad):
		 	Elimina un producto específico del carrito.

		vaciarCarrito():
		 	Elimina todos los productos del carrito de compras.

		ajustarPrecio(String producto, double nuevoPrecio):
		 	Ajusta el precio de un producto en el inventario.

	 * */
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//ATRIBUTOS
	private HashMap<String, Integer> inventario;
	private HashMap<String,Double> precios;
	private HashMap<String,Integer> carrito;
	private double saldoTotal;
	
	//CONSTRUCTOR
	 public TiendaEnLinea() {
	        inventario = new HashMap<>();
	        precios = new HashMap<>();
	        carrito = new HashMap<>();
	        saldoTotal = 0;
	    }
	
	//FUNCIONES
	 
	//Función para añadir un producto (es necesario añadirlo al inventario y a los precios)
	public void agregarProducto(String producto, int cantidad, double precio) {
		inventario.put(producto, cantidad);
		precios.put(producto, precio);
		System.out.println(cantidad + " unidades de " + producto + " con valor de : $" + precio + "añadidas a la tienda");
	}
	
	//Función para añadir un producto al carrito
	public void agregarAlCarrito(String producto, int cantidad) {
		//Comprobamos si el producto está disponible en el inventario
		if (inventario.containsKey(producto)) {
			//Comprobamos si disponemos de suficiente stock para añadirlo al carrito
			int stock = inventario.get(producto);
			if(stock >= cantidad) {
				//Si tenemos suficiente stock comprobamos si ya tenemos el producto en el cartrito
				if (carrito.containsKey(producto)) {
					//Si ya lo tenemos añadimos la cantidad para modificar su valor
                    int cantidadActual = carrito.get(producto);
                    carrito.put(producto, cantidadActual + cantidad);
                } else {
                	// Si no lo tenemos añadimos el producto normal
                    carrito.put(producto, cantidad);
                }
				//Actualizamos el valor del stock en el inventario
                inventario.put(producto, stock - cantidad);
                System.out.println(cantidad + " unidades de " + producto + " agregadas al carrito.");
				
			}else {
				System.out.println("No hay suficiente stock");
			}
		}else {
			System.out.println("El producto (" + producto + ") no está dispoible en la tienda");
		}
	}

	//Función para mostrar el carrito
	public void mostrarCarrito () {
		 System.out.println("Carrito de compras:\n");
		 //Recorremos el Mapa para obtener cada producto con su cantidad
	        for (String producto : carrito.keySet()) {
	            int cantidad = carrito.get(producto);
	            //Buscamos el precio que tiene el producto en concreto para calcular el total del carrito
	            double precioUnitario = precios.get(producto);
	            double subtotal = cantidad * precioUnitario;
	            System.out.println(">> " + producto + " - Cantidad: " + cantidad + " - Precio unitario: $" + precioUnitario + " - Subtotal: $" + subtotal);
	        }
	}
	
	//Función que recorre el carrito para calcular el total de la suma de sus productos
	public double calcularTotal () {
		double subtotal = 0;
		for (String producto : carrito.keySet()) {
			int cantidad = carrito.get(producto);
            double precioUnitario = precios.get(producto);
            subtotal += (cantidad * precioUnitario);
		}
		
		return subtotal;
	}
	
	//Función para actualizar el saldo de la tienda despues de una compra
	public void procesarPago(double monto) {
		//Comprobamos que el dinero ingresado es suficiente para llevar a cabo la compra
		if (monto >= calcularTotal()) {
			//Modificamos el saldo de la tienda sumando el valor total de la compra y tras ello eliminamos el carrito
			saldoTotal += calcularTotal();
			vaciarCarrito();
			System.out.println("Pago exitoso. Gracias por su compra.");
		} else {
			System.out.println("El monto ingresado es insuficiente para completar la compra.");
		}
	}
	
	//Función para mostrar el saldo actual de la tienda
	public void mostrarSaldoTotal() {
		System.out.println("El saldo de la tienda es : $" + saldoTotal);
	}
	
	//Función para eliminar un elemento del carrito
	public void eliminarDelCarrito (String producto, int cantidad) {
		//Comprobamos si el carrito está o no vacio
		if(carrito.isEmpty()) {
			System.out.println("El carrito de la compra está vacio");
		}else {
			//En caso de que el carrito no esté vacio comprobamos si contiene el producto
			if(carrito.containsKey(producto)) {
				//Si contiene el producto comprobamos que la cantidad que queremos eliminar es mayor a la cantidad de la que disponemos
				int cantidadCarrito = carrito.get(producto);
				if(cantidadCarrito>=cantidad) {
					carrito.put(producto, cantidadCarrito - cantidad);
					//Una vez actualizado el carrito debemos actulizar también el inventario en el que se encuentra el stock del producto
	                int stock = inventario.get(producto);
	                inventario.put(producto, stock - cantidad);
	                System.out.println(cantidad + " unidades de " + producto + " eliminadas del carrito.");
				}else {
					System.out.println("No hay suficiente stock");
				}
			}else {
				System.out.println("El producto (" + producto + ") no existe en el carrito");
			}
		}
	}
	
	public void vaciarCarrito () {
		carrito.clear();
		System.out.println("El carrito ha sido vaciado.");
	}
	
	public void ajustarPrecio (String producto, double nuevoPrecio) {
		if(precios.containsKey(producto)) {
			precios.put(producto, nuevoPrecio);
			System.out.println("El precio de " + producto + " ha sido ajustado a $" + nuevoPrecio);
		}else {
			System.out.println("El producto (" + producto + ") no está dispoible en la tienda");
		}
	}

	
	//GET&SET
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {

		TiendaEnLinea tienda = new TiendaEnLinea();

        tienda.agregarProducto("Producto A", 10, 25.0);
        tienda.agregarProducto("Producto B", 5, 50.0);
        tienda.agregarProducto("Producto C", 15, 60.0);
        tienda.agregarProducto("Producto D", 12, 58.0);
        tienda.agregarProducto("Producto E", 3, 5.5);
        System.out.println("______________________________________\n");
        tienda.agregarAlCarrito("Producto A", 3);
        tienda.agregarAlCarrito("Producto B", 2);
        tienda.agregarAlCarrito("Producto D", 8);
        System.out.println("______________________________________\n");
        tienda.mostrarCarrito();
        System.out.println("\nTotal a pagar: " + tienda.calcularTotal());
        System.out.println("______________________________________\n");
        tienda.ajustarPrecio("Producto A", 28.75);
        System.out.println("______________________________________\n");
        tienda.eliminarDelCarrito("Producto D", 5);
        tienda.eliminarDelCarrito("Producto A", 2);
        System.out.println("______________________________________\n");
        tienda.mostrarCarrito();
        System.out.println("Total a pagar: " + tienda.calcularTotal());
        System.out.println("\n______________________________________\n");
        tienda.procesarPago(1500.0);
        System.out.println("______________________________________\n");
        tienda.mostrarSaldoTotal();
		
	}
	
}
