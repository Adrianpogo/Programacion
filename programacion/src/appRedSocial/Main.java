package appRedSocial;

public class Main {

	public static void main(String[] args) {
		
		Sistema redSocial = new Sistema();
		
		Usuario user1 = new Usuario("Adrian", "Perez");
		Usuario user2 = new Usuario("Dario", "Gonzalez");
		Usuario user3 = new Usuario("Sergio", "Pascual");	
		
		redSocial.añadirUsuario(user1);
		redSocial.añadirUsuario(user1);
		redSocial.añadirUsuario(user2);
		redSocial.añadirUsuario(user3);

	}

}
