package juegos;

public enum TresEnRayaEnum {
	EQUIPO_1("X"), EQUIPO_2("O"), VACIO("-");
	
	private String valor;
	
	TresEnRayaEnum(String valor) {
		this.valor=valor;
	}
	
	public String getValor () {
		return valor;
	}
}
