package ecommerce.carrito;

import ecommerce.productos.ProductoDigital;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarritoDeComprasTest {

    @Test
    public void testCalcularTotal() {
        CarritoDeCompras carrito = new CarritoDeCompras();
        ProductoDigital producto = new ProductoDigital(1, "Curso", "Curso online", 10.00, 100, "http://descarga.com");

        carrito.agregarProducto(producto, 3);
        assertEquals(30.00, carrito.calcularTotal(), 0.01);
    }
}
