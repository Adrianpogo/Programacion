package appRestaurante;

public class Main {

	public static void main(String[] args) {

		//Se crea el restaurante
		Restaurante restaurante = new Restaurante("La mia Mamma"); 
		
		//Se crea los artículos
		Articulo art1 = new Articulo("Lasaña de carne",
				"Finas láminas de pasta importada desde italia con capas intermedias de carne bolognesa de recet casera",
				9.75);
		Articulo art2 = new Articulo("Lasaña de atún",
				"Finas láminas de pasta importada desde italia con capas intermedias de atún con verduritas", 8.75);
		Articulo art3 = new Articulo("Lasaña de espinacas",
				"Finas láminas de pasta importada desde italia con capas intermedias de espinacas cultivadas es nuestra propia huerta",
				8.75);
		Articulo art4 = new Articulo("Pizza barbacoa",
				"Pizza barbacoa mediada con masa fina y borde relleno de queso de cabra", 9.5);
		Articulo art5 = new Articulo("Pizza margarita",
				"Pizza margarita mediada con masa fina y borde relleno de queso de cabra", 9);
		Articulo art6 = new Articulo("Pizza 6 Quesos",
				"Pizza 6 quesos mediada con masa fina y borde relleno de queso de cabra", 9.5);
		
		//Añadimos los articulos al restaurante
		restaurante.añadirArticulo(art1);
		restaurante.añadirArticulo(art2);
		restaurante.añadirArticulo(art3);
		restaurante.añadirArticulo(art4);
		restaurante.añadirArticulo(art5);
		restaurante.añadirArticulo(art6);
		
		// Creamos clientes
		Cliente mesa1 = new Cliente(1);
		Cliente mesa2 = new Cliente(2);
		Cliente mesa3 = new Cliente(3);
		

		//Mostramos el menu del restaurante
		restaurante.mostrarArticulos();
		
		/*
		 
		---> SE HAN PROBADO Y FUNCIONAN
		 
		
		//Eliminamos la dispoinibilidad de algun artículo
		art1.agotarProducto();
		art4.agotarProducto();
		
		//Mostramos el menu del restaurante
		restaurante.mostrarArticulos();

		//Añadimos algun articulo disponible
		art1.reponerProducto();
		
		//Mostramos el menu del restaurante
		restaurante.mostrarArticulos();
		
		*/
		

		Pedido pedido1 = restaurante.relizarPedido(mesa1, 2);
		restaurante.mostrarPedidos();
		
		Pedido pedido2 = restaurante.relizarPedido(mesa2, 1);
		restaurante.mostrarPedidos();
		
		
		restaurante.prepararPedido(pedido1);
		restaurante.prepararPedido(pedido2);
		
		restaurante.mostrarPedidos();
		
		Pedido pedido3 = restaurante.relizarPedido(mesa3, 1);
		
		restaurante.entregarPedido(pedido1);
		restaurante.pedirCuenta(mesa1);
		
		restaurante.mostrarPedidos();
	}

}
