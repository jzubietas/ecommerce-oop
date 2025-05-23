package ecommerce.productos;

public class Producto {
    protected int id;
    protected String nombre;
    protected String descripcion;
    private double precio;
    protected int stock;

    public Producto(int id, String nombre, String descripcion, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.setPrecio(precio);
        this.stock = stock;
    }
    
    public String getNombre() { return nombre; }

    public void mostrarDetalle() {
        System.out.println("Producto: " + nombre + ", Precio: $" + getPrecio());
    }

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}