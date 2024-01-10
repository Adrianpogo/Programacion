package producto_tienda;

public class Main {

	public static void main(String[] args) {

		Producto prod1 = new Producto("Lavadora", 220);
		Producto prod2 = new Producto("Television", 174.99);
		Producto prod3 = new Producto("Frigorífico", 199.99);
		Producto prod4 = new Producto("Horno", 149.99);
		Producto prod5 = new Producto("Aspiradora", 47.45);
		Producto prod6 = new Producto("Secadora", 79.99);
		Producto prod7 = new Producto("Vitrocerámica", 180);
		Producto prod8 = new Producto("Microondas", 54.95);
		
		TiendaOnline tienda = new TiendaOnline("ElectroMarket");
		
		System.out.println("	>> BIENVENIDO A " + tienda.getNombre().toUpperCase() + " <<");
		
		System.out.println("________________________________________________\n");
		tienda.listarProductosDisponibles();
		
		System.out.println("________________________________________________\n");
		tienda.agregarProducto(prod1);
		tienda.agregarProducto(prod2);
		tienda.agregarProducto(prod3);
		tienda.agregarProducto(prod4);
		tienda.agregarProducto(prod5);
		tienda.agregarProducto(prod6);
		tienda.agregarProducto(prod7);
		tienda.agregarProducto(prod8);
		
		System.out.println("________________________________________________\n");
		tienda.listarProductosDisponibles();
		
		System.out.println("________________________________________________\n");
		tienda.agregarStock("Lavadora", 10);
		tienda.agregarStock("Television", 20);
		tienda.agregarStock("Frigorífico", 15);
		tienda.agregarStock("Horno", 10);
		tienda.agregarStock("Aspiradora", 15);
		tienda.agregarStock("Secadora", 20);
		tienda.agregarStock("Vitrocerámica", 5);
		tienda.agregarStock("Microondas", 10);
		tienda.agregarStock("Lavavajillas", 5);
		tienda.agregarStock("Cafetera", 10);
		
		System.out.println("________________________________________________\n");
		tienda.listarProductosDisponibles();
		
		System.out.println("________________________________________________\n");
		tienda.realizarCompra("Lavadora", 2);
		tienda.realizarCompra("Horno", 1);
		tienda.realizarCompra("Microondas", 2);
		tienda.realizarCompra("Cafetera", 2);
		tienda.realizarCompra("Vitrocerámica", 10);
		
		System.out.println("________________________________________________\n");
		tienda.listarProductosDisponibles();
		
		
		
		
		
	}

}
