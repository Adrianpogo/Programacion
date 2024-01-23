package empleadosHerencia;

public class Empleado {

	private String nombre;
	private int edad;
	private double salario;
	
	public Empleado(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	
	public void trabajar() {
		System.out.println(nombre + " esta trabajando...");
	}

	public void descansar() {
		System.out.println(nombre + " esta descansando...");
	}

	public void calcularSalario() {
		System.out.println(nombre + " gana " + salario + "€");
	}

	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Salario: " + salario);
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
