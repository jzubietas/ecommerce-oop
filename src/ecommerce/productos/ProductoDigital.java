package ecommerce.productos;

public class ProductoDigital extends Producto {
    private String urlDescarga;

    public ProductoDigital(int id, String nombre, String descripcion, double precio, int stock, String urlDescarga) {
        super(id, nombre, descripcion, precio, stock);
        this.urlDescarga = urlDescarga;
    }
}
