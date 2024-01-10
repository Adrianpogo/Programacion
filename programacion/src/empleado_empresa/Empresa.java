package empleado_empresa;

import java.util.ArrayList;

public class Empresa {

	/*

	Crear una clase llamada "Empresa"
		Funciones (métodos):
			Constructor: Un constructor que acepte 1 parámetro, el nombre de la empresa (cadena de caracteres),
				y lo utilice para inicializar el atributo de la clase.
			contratarEmpleado(Empleado): añado un empleado a la empresa
			despedirEmpleado(Empleado): en caso de que el empleado exista en la empresa llo despido,
			 	sino digo que no trabaja en esta empresa
			 mostrarListaEmpleados(): muestro todos los empleados de la lista
		Atributos:
			nombre: Almacena el nombre del producto como una cadena de caracteres.
			precio: Almacena el precio del producto como un número decimal (double).
			cantidadEnStock: Almacena la cantidad en stock del producto como un número entero (int).	  
	*/
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	//ATRIBUTOS
	private String nombre;
	private ArrayList<Empleado> listaEmpleados;
	
	//CONSTRUCTOR
	public Empresa (String nombre) {
		this.nombre=nombre;
		this.listaEmpleados= new ArrayList<Empleado>();
	}
	
	//FUNCIONES
	public void contratarEmpleado (Empleado empleado) {
		listaEmpleados.add(empleado);
	}
	
	public void despedirEmpleado (Empleado empleado) {
		if (listaEmpleados.contains(empleado)) {
			listaEmpleados.remove(empleado);
		}else {
			System.out.println("El empleado " + empleado.getNombre() + " " + empleado.getApellido() + " no trabaja en esta empresa");
		}
	}

	public void mostrarListaEmpleados () {
		System.out.println(">> LISTA DE EMPLEADOS \n");
		if (listaEmpleados.isEmpty()) {
			System.out.println("No hay empledos\n");
		}
		
		for(Empleado empleado : listaEmpleados) {
			System.out.println("- " + empleado.getNombre() + ", " + empleado.getApellido() + " (" + empleado.getEdad() + ")");
		}
	}


	//GET&SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
}
