package appBiblioteca;

public class Main {

	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca("CEAC B");
		
		Revista rev1 = new Revista("01", "Hola!", 2017, 23, "Prensa rosa");
		Revista rev2 = new Revista("02", "Adios!", 2012, 1, "Prensa rosa");
		Revista rev3 = new Revista("03", "Marca", 2019, 67, "Deporte");
		Revista rev4 = new Revista("04", "AS", 2022, 178, "Deporte");
		Revista rev5 = new Revista("05", "Pesca y Caza", 2010, 27, "Ocio");
		
		Libro lib1 = new Libro("06", "Harry Potter 1", 1997, "JK Rowling", "Wizzard");
		Libro lib2 = new Libro("07", "Harry Potter 2", 2000, "JK Rowling", "Wizzard");
		Libro lib3 = new Libro("08", "Harry Potter 3", 2003, "JK Rowling", "Wizzard");
		Libro lib4 = new Libro("09", "El arte de ser nosotros", 2003, "Inmma Rubiales", "Planeta");
		Libro lib5 = new Libro("10", "Star Wars the High Republic", 2021, "Charles Soule", "PLaneta Cómic");
		
		biblioteca.añadirRecurso(rev1);
		biblioteca.añadirRecurso(rev2);
		biblioteca.añadirRecurso(rev3);
		biblioteca.añadirRecurso(rev4);
		biblioteca.añadirRecurso(rev5);
		biblioteca.añadirRecurso(lib1);
		biblioteca.añadirRecurso(lib2);
		biblioteca.añadirRecurso(lib3);
		biblioteca.añadirRecurso(lib4);
		biblioteca.añadirRecurso(lib5);

		
		biblioteca.buscarTema("Prensa rosa");
		biblioteca.buscarTema("Deporte");
		biblioteca.buscarTema("Cocina");
		
		biblioteca.buscarAutor("JK Rowling");
		biblioteca.buscarAutor("Charles Soule");
		biblioteca.buscarAutor("Federico García Lorca");

		biblioteca.mostrarReservas();
		
		biblioteca.reservarRecurso(lib1, "001");
		biblioteca.reservarRecurso(lib1, "002");
		biblioteca.reservarRecurso(lib2, "001");
		biblioteca.reservarRecurso(lib4, "013");
		biblioteca.reservarRecurso(rev1, "004");
		biblioteca.reservarRecurso(rev5, "104");
		
		biblioteca.mostrarReservas();
		
		lib1.devolver();
		lib2.devolver();
		
		biblioteca.reservarRecurso(lib1, "076");
		biblioteca.mostrarReservas();
	}

}
