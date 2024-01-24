package empleadosHerencia;

public class EmpleadoTiempoCompleto extends Empleado{


	private double bonoAnual;
	private String tipoContrato;
	
	public EmpleadoTiempoCompleto(String nombre, int edad, double salario, double bonoAnual, String tipoContrato) {
		super(nombre, edad, salario);
		this.bonoAnual=bonoAnual;
		this.tipoContrato=tipoContrato;
	}

	public void recibirBono() {
		System.out.println(getNombre() + " ha recibido " + bonoAnual + "€");
	}
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Tipo contrato: " + tipoContrato);
	}
	
	
	public double getBonoAnual() {
		return bonoAnual;
	}

	public void setBonoAnual(double bonoAnual) {
		this.bonoAnual = bonoAnual;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

}
