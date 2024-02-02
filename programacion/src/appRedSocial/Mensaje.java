package appRedSocial;

import java.util.Date;

public class Mensaje {

	private Usuario remitente;
	private Usuario destinatario;
	private Date fecha;
	private String contenido;
	private Boolean leido;
	
	/////////////////////////////////////////////////////////////////////
	
	public Mensaje (Usuario remitente, Usuario destinatario, String contenido, Date fecha) {
		this.remitente=remitente;
		this.destinatario=destinatario;
		this.contenido=contenido;
		this.fecha = new Date();
		this.leido=false;
	}
	
	
	////////////////////////////////////////////////////////////////////
	
	public void mostrarInfo() {
		System.out.println("MENSAJE: " + remitente + " para " + destinatario);
		System.out.println(" -Fecha: " + fecha);
		System.out.println(" -Leido: " + leido);
		System.out.println(" -Contenido: " + contenido);
	}
	
	
	
	
	////////////////////////////////////////////////////////////////////
	public Usuario getRemitente() {
		return remitente;
	}
	public void setRemitente(Usuario remitente) {
		this.remitente = remitente;
	}
	public Usuario getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Usuario destinatario) {
		this.destinatario = destinatario;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Boolean getLeido() {
		return leido;
	}
	public void setLeido(Boolean leido) {
		this.leido = leido;
	}
}
