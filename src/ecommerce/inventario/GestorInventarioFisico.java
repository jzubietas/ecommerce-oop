
package ecommerce.inventario;

import ecommerce.productos.Producto;
import java.util.HashMap;

public class GestorInventarioFisico extends GestorInventario {
    private HashMap<Integer, Producto> inventario = new HashMap<>();

    @Override
    public void añadirProducto(Producto producto) {
        inventario.put(producto.getId(), producto);
    }

    @Override
    public void eliminarProducto(int id) {
        inventario.remove(id);
    }

    @Override
    public void actualizarStock(int id, int nuevoStock) {
        if (inventario.containsKey(id)) {
            inventario.get(id).setStock(nuevoStock);
        }
    }
}
