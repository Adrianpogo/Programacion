package empleado_empresa;

public class Empleado {

	/*

	Crear una clase llamada "Empleado"
		Funciones (métodos):
			Constructor: Un constructor que acepte 2 parámetros, el nombre del producto (cadena de caracteres) y el precio del producto,
				y lo utilice para inicializar el atributo de la clase.
			enviarCorreo(String mensaje): Un método que permita al cliente enviar un correo electrónico con un mensaje especificado.
			realizarLlamada(String numeroDestino): Un método que permita al cliente realizar una llamada telefónica al número de destino especificado.
			mostrarInformacion(): Un método que muestre la información completa del cliente, incluyendo todos los atributos.
			aumentarSalario(double porcentaje): En caso de que se quiera aumentar el salario en un porcentaje concreto. 
				En caso de que el porcentaje sea negativo mostrar un mensaje de error
			Métodos getters y setters de todos los atributos que lo necesiten
		Atributos:
			nombre (String): Para almacenar el nombre del cliente.
			apellido (String): Para almacenar el apellido del cliente.
			edad(int): Para almacenar el nombre.
			salario(double): Para señalar el salario actual del empleado
			email (String): Para almacenar la dirección de correo electrónico del cliente.
			telefono (String): Para almacenar el número de teléfono del cliente.
			direccion (String): Para almacenar la dirección postal del cliente.

	*/
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// ATRIBUTOS
	private String nombre;
	private String apellido;
	private int edad;
	private double salario;
	private String email;
	private String telefono;

	// CONSTRUCTOR
	public Empleado(String nombre, String apellido, int edad, double salario, String email, String telefono) throws Exception {
		if (telefono.length()==9) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.salario = salario;
			this.email = email;
			this.telefono = telefono;
		} else {
			throw new Exception("El número de telefono no contiene un formato adecuado");
		}

	}

	// FUNCIONES
	
	//Función para enviar un mensaje de correo
	public void enviarCorreo(String mensaje) {
		System.out.println("Mensasje desde " + email + ": " + mensaje);
	}

	//Función para hacer una llamada a un número de teléfono
	public void realizarLlamada(String numeroDestino) {
		System.out.println("Llamada desde " + telefono + " a " + numeroDestino);
	}

	//Función para mostrar la información de un empleado
	public void mostrarInformacion() {
		System.out.println(">> EMPLEADO : ");
		System.out.println("- Nombre: " + nombre + "\n- Apellido: " + apellido + "\n- Edad: " + edad + "\n- Email: "
				+ email + "\n- Telefono: " + telefono + "\n- Salario: " + salario + "€");
	}

	//Función para aumentar el salario en un % a un empleado
	public void aumentarSalario(double porcentaje) {
		if (porcentaje < 0) {
			System.err.println("ERROR: Porcentaje inválido");
		} else {
			setSalario(salario + (salario * (porcentaje / 100)));
		}
	}

	// GET&SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
