package ejerciciosT1;

public enum MenuOperacionesCalculadora {
	SUMA(1), RESTA(2), MULTIPLICACION(3), DIVISION(4), EXPONENTES(5), SALIR(6);

	int valor;

	MenuOperacionesCalculadora(int valor) {
		this.valor=valor;
	}

	public int getValor() {
		return valor;
	}
	
	public static MenuOperacionesCalculadora valor (int opcion) {
		switch (opcion) {
		case 1:
			return SUMA;
		case 2:
			return RESTA;
		case 3:
			return MULTIPLICACION;
		case 4:
			return DIVISION;
		case 5:
			return EXPONENTES;
		case 6:
			return SALIR;
		default:
			break;
		}
		return null;
	
	}
}
