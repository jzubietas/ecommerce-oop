
package ecommerce.productos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductoTest {

    @Test
    public void testNombreProducto() {
        Producto producto = new Producto("Teclado", 29.99);
        assertEquals("Teclado", producto.getNombre());
    }

    @Test
    public void testPrecioProducto() {
        Producto producto = new Producto("Mouse", 19.99);
        assertEquals(19.99, producto.getPrecio(), 0.01);
    }
}
