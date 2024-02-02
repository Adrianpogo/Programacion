package appRedSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private List <Mensaje> mensajes;
	private List <Notificacion> notificaciones;
	private List <Usuario> usuariosBloqueados;
	
	////////////////////////////////////////////////////////////////////
	
	public Usuario (String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.mensajes= new ArrayList<Mensaje>();
		this.notificaciones= new ArrayList<Notificacion>();
		this.usuariosBloqueados = new ArrayList<Usuario>();
	}
	
	///////////////////////////////////////////////////////////////////

	public void enviarMensaje(Usuario destinatario, Mensaje mensaje) {
	
		
	}

	public void recibirMensaje(Usuario destinatario, Mensaje mensaje) {

	}

	public void bloquearUsuario(Usuario usuario) {

	}

	public void desbloquearUsuario(Usuario usuario) {

	}

	public void mostrarBloqueados(Usuario usuario) {

	}
	
	////////////////////////////////////////////////////////////////////
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public List<Mensaje> getMensajes() {
		return mensajes;
	}
	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
	public List<Notificacion> getNotificaciones() {
		return notificaciones;
	}
	public void setNotificaciones(List<Notificacion> notificaciones) {
		this.notificaciones = notificaciones;
	}
	public List<Usuario> getUsuariosBloqueados() {
		return usuariosBloqueados;
	}
	public void setUsuariosBloqueados(List<Usuario> usuariosBloqueados) {
		this.usuariosBloqueados = usuariosBloqueados;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	

}
