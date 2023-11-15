package ejercicios;

public enum MenuListaCompra {
	AÑADIR_ELEMENTO(1), BORRAR_ELEMENTO(2), MOSTRAR_COMPRA(3), SALIR(4);
	
	int valor;
	
	MenuListaCompra(int valor) {
		this.valor=valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public static MenuListaCompra valor (int opcion) {
		switch (opcion) {
		case 1:
			return AÑADIR_ELEMENTO;
		case 2:
			return BORRAR_ELEMENTO;
		case 3:
			return MOSTRAR_COMPRA;
		case 4:
			return SALIR;
		default:
			break;
		}
		return null;
	}
	
}
