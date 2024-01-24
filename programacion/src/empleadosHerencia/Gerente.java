package empleadosHerencia;

public class Gerente extends Empleado{

	private String departamento;
	private int numSubordinados;
	
	public Gerente(String nombre, int edad, double salario, String departamento, int numSubordinados) {
		super(nombre, edad, salario);
		this.departamento=departamento;
		this.numSubordinados=numSubordinados;
	}

    public void asignarTareas() {
        System.out.println("El gerente " + getNombre() + " está asignando tareas a sus subordinados.");
    }

    public void realizarRevisiones() {
        System.out.println("El gerente " + getNombre() + " está realizando revisiones de desempeño.");
    }
	
	
	
	public int getNumSubordinados() {
		return numSubordinados;
	}

	public void setNumSubordinados(int numSubordinados) {
		this.numSubordinados = numSubordinados;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
