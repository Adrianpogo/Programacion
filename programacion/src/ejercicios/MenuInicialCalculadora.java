package ejercicios;

public enum MenuInicialCalculadora {
	AÑADIR_NUMERO(1), MOSTRAR_CALCULADORA(2), OPERACIONES(3),SALIR(4);

	int valor;

	MenuInicialCalculadora(int valor) {
		this.valor=valor;
	}

	public int getValor() {
		return valor;
	}
	
	public static MenuInicialCalculadora valor (int opcion) {
		switch (opcion) {
		case 1:
			return AÑADIR_NUMERO;
		case 2:
			return MOSTRAR_CALCULADORA;
		case 3:
			return OPERACIONES;
		case 4:
			return SALIR;
		default:
			break;
		}
		return null;
	
	}
}
