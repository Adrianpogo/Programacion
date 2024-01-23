package casasHerencia;

public class Cabaña extends Casa{

	private boolean tieneChimenea;
	
	public Cabaña(String direccion, int numHabitaciones, double precio, boolean tieneChimenea) {
		super(direccion, numHabitaciones, precio);
		this.setTieneChimenea(tieneChimenea);
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		if(isTieneChimenea()) {
			System.out.println("La cabaña tiene chimenea");
		}else {
			System.out.println("La cabaña no tiene chimenea");
		}
	}
	
	public boolean isTieneChimenea() {
		return tieneChimenea;
	}

	public void setTieneChimenea(boolean tieneChimenea) {
		this.tieneChimenea = tieneChimenea;
	}

	
	

}
