package appCadenaSuministros;

import java.util.ArrayList;
import java.util.List;

public class ProductoEnvasado extends ProductoAlimenticio {

	// Atributos
	private double pesoNeto;
	private List<String> listaIngredientes;

	// Constructor
	public ProductoEnvasado(String idProducto, String nombre, String fechaCaducidad, String origen, Double pesoNeto) {
		
		super(idProducto, nombre, fechaCaducidad, origen);
		this.pesoNeto=pesoNeto;
		this.listaIngredientes= new ArrayList<String>();
	}
	
	//Métodos
	public void añadirIngrediente (String ingrediente) {
		if(verificarIngrediente(ingrediente)) {
			listaIngredientes.add(ingrediente);
		}else {
			System.out.println("No se puede añadir un ingrediente que ya existe en el producto");
		}
	}
	@Override
	public void mostrarInfo(){
		super.mostrarInfo();
		System.out.println("    - Peso neto: " + pesoNeto + "kg");
		System.out.println("    - Ingredientes --> ");
		for(String ingrediente : listaIngredientes) {
			System.out.println("      + " + ingrediente);
		}
	}
	
	public boolean verificarIngrediente(String ingrediente) {
		return !listaIngredientes.contains(ingrediente);
	}
	
	//Getters&Setters
	public double getPesoNeto() {
		return pesoNeto;
	}

	public void setPesoNeto(double pesoNeto) {
		this.pesoNeto = pesoNeto;
	}

	public List<String> getListaIngredientes() {
		return listaIngredientes;
	}

	public void setListaIngredientes(List<String> listaIngredientes) {
		this.listaIngredientes = listaIngredientes;
	}

}
