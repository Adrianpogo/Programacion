package libro_biblioteca;

public class Main {

	public static void main(String[] args) {
		Libro libro1 = new Libro("El señor de los anillos", "Luis", 2000);
		Libro libro2 = new Libro("El Quijote", "Andrea", 1993);
		Libro libro3 = new Libro("Harry Potter", "Lucia", 2007);
		Libro libro4 = new Libro("Culpa mía", "David", 2021);
		Libro libro5 = new Libro("After", "Juan", 1914);
		
		Biblioteca bibliotecaCEAC = new Biblioteca("Biblioteca CEAC");
		
		bibliotecaCEAC.listarLibrosDisponibles();
		bibliotecaCEAC.listarLibrosPrestados();
		
		bibliotecaCEAC.agregarLibro(libro1);
		bibliotecaCEAC.agregarLibro(libro2);
		bibliotecaCEAC.agregarLibro(libro3);
		bibliotecaCEAC.agregarLibro(libro4);
		bibliotecaCEAC.agregarLibro(libro5);
		
		bibliotecaCEAC.listarLibrosDisponibles();
		bibliotecaCEAC.listarLibrosPrestados();
		
		bibliotecaCEAC.prestarLibro("El Quijote");
		bibliotecaCEAC.prestarLibro("After");
		bibliotecaCEAC.prestarLibro("La Celestina");
		
		bibliotecaCEAC.listarLibrosDisponibles();
		bibliotecaCEAC.listarLibrosPrestados();
		
		bibliotecaCEAC.devolverLibro("After");
		bibliotecaCEAC.devolverLibro("La Celestina");
		
		bibliotecaCEAC.listarLibrosDisponibles();
		bibliotecaCEAC.listarLibrosPrestados();

	}

}
