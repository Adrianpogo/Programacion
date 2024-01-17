package interfaces;

public interface CorreoElectronico {

	/* 
	  Esta interfaz define métodos para enviar y recibir correos electrónicos.
	  Funciones (métodos):
	    Método "enviarCorreo": Envía un correo electrónico.
	    Método "recibirCorreo": Recibe y muestra los correos electrónicos en la bandeja de entrada.
	 */
	
	/**
     * Envía un correo electrónico.
     */
    void enviarCorreo(String destinatario, String asunto, String mensaje);

    /**
     * Recibe y muestra los correos electrónicos en la bandeja de entrada.
     */
    void recibirCorreo();
}
