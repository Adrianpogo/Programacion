package appRedSocial;

public class Notificacion {

	private Boolean leida;
	
	//////////////////////////////////////////////////////////////////
	
	public Notificacion () {
		this.leida=false;
	}
	
	public void marcarLeido() {
		this.leida=true;
	}
	
	
	//////////////////////////////////////////////////////////////////

	public Boolean getLeida() {
		return leida;
	}
	public void setLeida(Boolean leida) {
		this.leida = leida;
	}
	
}
