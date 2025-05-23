package ecommerce.productos;

public class Producto extends Item {
    private String descripcion;
    private int stock;

    public Producto(int id, String nombre, String descripcion, double precio, int stock) {
        super(id, nombre, precio);
        this.descripcion = descripcion;
        setStock(stock);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stock = stock;
    }

    public void mostrarDetalle() {
        System.out.println("Producto: " + getNombre() + ", Precio: $" + getPrecio());
    }
}