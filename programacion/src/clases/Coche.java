package clases;

public class Coche {

	/*
	 * Crear una clase llamada "Coche" Métodos: Constructor: Un constructor que
	 * acepte los atributos mencionados despues como parámetros y los utilice para
	 * inicializar los atributos de la clase. encenderMotor(): Un método que
	 * encienda el motor del coche, estableciendo el atributo "encendido" a true.
	 * apagarMotor(): Un método que apague el motor del coche, estableciendo el
	 * atributo "encendido" a false. acelerar(double cantidad): Un método que
	 * aumente la velocidad del coche en la cantidad especificada en kilómetros por
	 * hora, si el motor está encendido. frenar(double cantidad): Un método que
	 * reduzca la velocidad del coche en la cantidad especificada en kilómetros por
	 * hora, si el motor está encendido y la velocidad actual es mayor que la
	 * cantidad especificada. calcularConsumo(double distancia): Un método que
	 * calcule y devuelva el consumo de combustible en litros para una distancia
	 * dada en kilómetros. mostrarInformacion(): Un método que muestre la
	 * información completa del coche, incluyendo todos los atributos. Atributos:
	 * marca (String): Para almacenar la marca del coche. modelo (String): Para
	 * almacenar el modelo del coche. anioFabricacion (int): Para almacenar el año
	 * de fabricación del coche. color (String): Para almacenar el color del coche.
	 * velocidadActual (double): Para almacenar la velocidad actual del coche en
	 * kilómetros por hora. encendido (boolean): Para representar si el coche está
	 * encendido o apagado (true o false). consumoPorKilometro (double): Para
	 * almacenar el consumo de combustible por kilómetro en litros.
	 * 
	 */

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// ATRIBUTOS
	private String marca;
	private String modelo;
	private int anioFabricacion;
	private String color;
	private double velocidadActual;
	private boolean encendido;
	private double consumoPorKilometro;

	// CONSTRUCTOR
	public Coche(String marca, String modelo, int anioFabricacion, String color, double consumoPorKilometro) {
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.color = color;
		this.consumoPorKilometro = consumoPorKilometro;
		this.velocidadActual = 0.0;
		this.encendido = false;
	}

	// FUNCIONES
	public void encenderMotor() {
		encendido = true;
		System.out.println("El motor del coche se ha encendido");
	}

	public void apagarMotor() {
		encendido = false;
		System.out.println("El motor del coche se ha apagado");
	}

	public void acelerar(double cantidad) {
		if (encendido) {
			velocidadActual += cantidad;
			System.out.println("El coche aceleró a " + velocidadActual + " km/h.");
		} else {
			System.out.println("El coche está apagado, no se puede acelerar");
		}
	}

	public void frenar(double cantidad) {
		if (encendido && velocidadActual > cantidad) {
			velocidadActual -= cantidad;
			System.out.println("El coche frenó a " + velocidadActual + " km/h.");

		} else {
			System.out.println("El coche está apagado, no se puede frenar");
		}

	}

	public double calcularConsumo(double distancia) {
		if (encendido && distancia > 0) {
            return distancia * consumoPorKilometro;
        } else {
            return 0.0;
        }
	}

	public void mostrarInformacion() {
		System.out.println("+------------------------------------+");
		System.out.println("| Información del coche:");
		System.out.println("+------------------------------------+");
        System.out.println("| Marca: " + marca);
        System.out.println("| Modelo: " + modelo);
        System.out.println("| Año de Fabricación: " + anioFabricacion);
        System.out.println("| Color: " + color);
        System.out.println("| Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("| Motor Encendido: " + encendido);
        System.out.println("| Consumo por Kilómetro: " + consumoPorKilometro + " litros");
        System.out.println("+------------------------------------+");
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Método principal para probar la clase
	public static void main(String[] args) {
		Coche miCoche = new Coche("Toyota", "Corolla", 2022, "Azul", 0.05);

		miCoche.encenderMotor();
		miCoche.acelerar(60);
		miCoche.frenar(20);
		double consumo = miCoche.calcularConsumo(100);
		System.out.println("Consumo de combustible para 100 km: " + consumo + " litros");
		miCoche.mostrarInformacion();
	}

}
