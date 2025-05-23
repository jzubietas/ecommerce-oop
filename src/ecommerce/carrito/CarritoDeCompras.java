package ecommerce.carrito;

import java.util.ArrayList;
import java.util.List;
import ecommerce.productos.Producto;

public class CarritoDeCompras {
    private List<ItemCarrito> items;

    public CarritoDeCompras() {
        items = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        items.add(new ItemCarrito(producto, cantidad));
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemCarrito item : items) {
            total += item.getProducto().getPrecio() * item.getCantidad();
        }
        return total;
    }
}
