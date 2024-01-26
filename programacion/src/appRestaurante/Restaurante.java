package appRestaurante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Restaurante {

	private String nombre;
	private List<Articulo> listaArticulos;
	private List<Pedido> listaPedidos;
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Constructor
	public Restaurante (String nombre) {
		this.nombre=nombre;
		this.listaArticulos=new ArrayList<Articulo>();
		this.listaPedidos=new ArrayList<Pedido>();
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Métodos
	
	//Función para añadir articulos a un restaurante
	public void añadirArticulo (Articulo articulo) {
		if(listaArticulos.contains(articulo)) {
			System.out.println("Ya disponemos de este articulo");
		}else {
			listaArticulos.add(articulo);
		}
	}
	
	//Función que realiza los pedidos de un cliente y los añade a la lista de pedidios
	public Pedido relizarPedido (Cliente cliente, int numArticulos) {
		//Declaramos el nuevo mapa del pedido, que contiene articulos y sus cantidades
		HashMap<Articulo, Integer> pedido= new HashMap<Articulo, Integer>();
		Scanner sc = new Scanner(System.in);
		String eleccion;
		int cantidad;
		
		//Realizamos un bucle con el numero de articulos que va a pedir
		System.out.println("\n>> Pedido de " + numArticulos + " articulos:");
		for(int i = 0 ; i < numArticulos; i++) {
			System.out.print("\n- Articulo " + (i+1) + ": ");
			eleccion=sc.nextLine();
			System.out.print("Cantidad de " + eleccion + ": ");
			cantidad=sc.nextInt();
			//LLamada la función auxiliar para añadir un articulo y su cantidad al pedido
			añadirArticuloPedido(eleccion,cantidad, pedido);
			sc.nextLine();
		}
		
		//Creamos un nuevo pedido con la mesa del cliente y el mapa del pedido
		Pedido pedidoCliente = new Pedido(cliente.getMesaCliente(), pedido);
		listaPedidos.add(pedidoCliente);
		return pedidoCliente;
	}
	
	//Función que añade un pedido con su nombre y cantidad al mapa de pedidos
	public void añadirArticuloPedido (String nombreArticulo, int cantidad, HashMap<Articulo, Integer> pedido) {
		//Recorremos la lista de articulos para comprobar si hay alguno con el nombre del pedido
		for(Articulo articulo : listaArticulos) {
			if(articulo.getNombre().equalsIgnoreCase(nombreArticulo)) {
				//Si lo hay comprobamos si el articulo esta disponible
				if(articulo.isDisponible()) {
					//Si esta disponible comprobamos si es un articulo del pedido exixtente
					//Si existe sumamos su cantidad, si no lo creamos de 0
					if(pedido.containsKey(articulo)) {
						pedido.put(articulo, pedido.put(articulo, pedido.get(articulo)+cantidad));
					}else {
						pedido.put(articulo, cantidad);
					}
					
				}
			}
		}
	}

	public void mostrarPedidos (){
		for(Pedido pedido : listaPedidos) {
			System.out.println("\n------ PEDIDO ------");
			pedido.mostrarInfo();
			System.out.println("\n--------------------\n");
		}
	}
	
	public void mostrarArticulos() {
		System.out.println("------  MENU  ------");
		for(Articulo articulo : listaArticulos) {
			if(articulo.isDisponible()) {
				articulo.mostrarInfo();
			}
		}
		System.out.println("\n--------------------\n");
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Getter&Setter
	public List<Articulo> getListaArticulos() {
		return listaArticulos;
	}

	public void setListaArticulos(List<Articulo> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pedido> getListaPedidos() {
		return listaPedidos;
	}

	public void setListaPedidos(List<Pedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}
}
