package empleadosHerencia;

public class EmpleadoTiempoParcial extends Empleado{

	private int horasTrabajadas;
	private double tarifaPorHora;
	
	public EmpleadoTiempoParcial(String nombre, int edad, double salario, int horasTrabajadas, double tarifaPorHora) {
		super(nombre, edad, salario);
		this.horasTrabajadas=horasTrabajadas;
		this.tarifaPorHora=tarifaPorHora;
	}

	public void mostrarHorasTrabajadas() {
		System.out.println(getNombre() + " ha trabajado " + horasTrabajadas + " horas");
	}
	
	public void calcularSalario () {
		System.out.println("El salario de " + getNombre() + " es: " + (tarifaPorHora*horasTrabajadas));
	}
	
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getTarifaPorHora() {
		return tarifaPorHora;
	}

	public void setTarifaPorHora(double tarifaPorHora) {
		this.tarifaPorHora = tarifaPorHora;
	}

}
