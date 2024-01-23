package empleadosHerencia;

public class EmpleadoTiempoParcial extends Empleado{

	private int horasTrabajadas;
	private int tarifaPorHora;
	
	public EmpleadoTiempoParcial(String nombre, int edad, double salario) {
		super(nombre, edad, salario);
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

	public int getTarifaPorHora() {
		return tarifaPorHora;
	}

	public void setTarifaPorHora(int tarifaPorHora) {
		this.tarifaPorHora = tarifaPorHora;
	}

}
