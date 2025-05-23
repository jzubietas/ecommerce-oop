package ecommerce.productos;

public class ProductoFisico extends Producto {
    private double peso;
    private String dimensiones;

    public ProductoFisico(int id, String nombre, String descripcion, double precio, int stock, double peso, String dimensiones) {
        super(id, nombre, descripcion, precio, stock);
        this.peso = peso;
        this.dimensiones = dimensiones;
    }
}
