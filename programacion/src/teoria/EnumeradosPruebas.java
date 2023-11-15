package teoria;

public enum EnumeradosPruebas {
	// Se escriben en mayusculas siempre
	LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5), SABADO(6), DOMINGO(7);	
	
	int valor;
	
	// Constructor
	EnumeradosPruebas(int valor){
		this.valor = valor;
	}
	
	// Getter
	public int getValor() {
		return valor;
	}
	
}
