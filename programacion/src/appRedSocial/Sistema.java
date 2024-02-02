package appRedSocial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Sistema {

	private List <Usuario> usuarios;
	
	//////////////////////////////////////////////////////////////////

	public Sistema () {
		this.usuarios= new ArrayList<Usuario>();
	}
	
	//////////////////////////////////////////////////////////////////
	
	public void añadirUsuario (Usuario usuario) {
		if(!usuarios.contains(usuario)) {
			System.out.println("\n>> Añdiendo usuario al sistema...");
			usuarios.add(usuario);
		}else {
			System.out.println("\nERROR: El usuario ya está en el sistema");
		}
		
	}
	
	public Mensaje crearMensaje (Usuario remitente, Usuario destinatario) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>Introduce tu mensaje: ");
		String mensaje = sc.nextLine();
		return new Mensaje(remitente, destinatario, mensaje, new Date());
	}
	
	public void generarMensaje (Usuario remitente, Usuario destinatario) {
		if(usuarios.contains(destinatario) && usuarios.contains(remitente)
				&& !destinatario.getUsuariosBloqueados().contains(remitente)) {
			Mensaje mensaje = crearMensaje(remitente, destinatario);
			remitente.enviarMensaje(destinatario, mensaje);
			
		}

	}
	
	public void mostrarMensajes (Usuario usuario) {
		for(Mensaje mensaje : usuario.getMensajes()) {
			mensaje.mostrarInfo();
		}
	}
	
	
	//////////////////////////////////////////////////////////////////
	public List <Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List <Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
