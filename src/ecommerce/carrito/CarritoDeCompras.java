package ecommerce.carrito;

import java.util.ArrayList;
import java.util.List;
import ecommerce.productos.Producto;

public class CarritoDeCompras {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getClass().getSimpleName());
    }

    public void agregarProducto(int id) {
        Producto producto = new Producto(id, "Genérico", "Descripción por defecto", 9.99, 10);
        agregarProducto(producto);
    }

    public void agregarProducto(String nombre, double precio) {
        Producto producto = new Producto(999, nombre, "Auto-generado", precio, 1);
        agregarProducto(producto);
    }

    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarDetalle();
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        System.out.println("Total del carrito: $" + total);
        return total;
    }
}