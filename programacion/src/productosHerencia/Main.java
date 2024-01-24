package productosHerencia;

public class Main {

	public static void main(String[] args) {

        ProductoElectronico laptop = new ProductoElectronico("Laptop", 799.99, 10, "Dell", "XPS 15");
        ProductoAlimenticio leche = new ProductoAlimenticio("Leche", 2.49, 20, "01/02/2024");
        
        // Mostrar información del producto electrónico
        System.out.println("Información del Producto Electrónico:");
        laptop.mostrarInfo(); 
        
        // Mostrar información del producto alimenticio
        System.out.println("\nInformación del Producto Alimenticio:");
        leche.mostrarInfo();   
        leche.mostrarInfo();   

	}

}
