package productosHerencia;

public class Producto {
	
    private String nombre;
    private double precio;
    private int cantidadDisponible;

   
    public Producto(String nombre, double precio, int cantidadDisponible) {
        super();
    	this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad Disponible: " + cantidadDisponible);
    }

    public void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= cantidadDisponible) {
            cantidadDisponible -= cantidad;
            System.out.println("Se vendieron " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("No hay suficiente stock de " + nombre + " para realizar la venta.");
        }
    }

    // Get&Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

}
