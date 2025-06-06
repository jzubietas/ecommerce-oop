
package ecommerce.inventario;

import ecommerce.productos.Producto;

public abstract class GestorInventario {
    public abstract void añadirProducto(Producto producto);
    public abstract void eliminarProducto(int id);
    public abstract void actualizarStock(int id, int nuevoStock);
}
