package appCadenaSuministros;

public class Main {

	public static void main(String[] args) {
		
		ProductoAlimenticio productoGen1 = new ProductoAlimenticio("0001", "Salsa de tomate", "23/09/2032", "España");
		ProductoAlimenticio productoGen2 = new ProductoAlimenticio("0002", "Yatekomo", "13/04/2033", "Japón");
		
		ProductoEnvasado prodEnvasado1 = new ProductoEnvasado("0003", "Lata de atún", "09/12/2028", "España", 0.3);
		ProductoEnvasado prodEnvasado2 = new ProductoEnvasado("0004", "Chorizo pamplonica", "03/10/2025", "España", 1.5);
		
		ProductoFresco prodFresco1 = new ProductoFresco("0005", "Bolsa de patatas", "07/07/2024", "India", "06/02/2024", 17);
		ProductoFresco prodFresco2 = new ProductoFresco("0006", "Filetes de lomo", "10/02/2024", "India", "06/12/2023", 10.5);
		
		productoGen1.mostrarInfo();
		productoGen2.mostrarInfo();
		
		prodFresco1.mostrarInfo();
		prodFresco1.mostrarRecomendaciones();
		prodFresco2.mostrarInfo();
		prodFresco2.mostrarRecomendaciones();
		
		prodEnvasado1.añadirIngrediente("Atún");
		prodEnvasado1.añadirIngrediente("Aceite");
		prodEnvasado1.añadirIngrediente("Sal");
		prodEnvasado2.añadirIngrediente("Carne de cerdo");
		prodEnvasado2.añadirIngrediente("Pimentón dulce");
		prodEnvasado1.mostrarInfo();
		prodEnvasado2.mostrarInfo();
	}

}
