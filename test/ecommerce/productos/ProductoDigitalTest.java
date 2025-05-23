package ecommerce.productos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoDigitalTest {

    @Test
    public void testGetPrecio() {
        ProductoDigital producto = new ProductoDigital(1, "Curso", "Curso online", 49.99, 50, "http://link.com");
        assertEquals(49.99, producto.getPrecio(), 0.01);
    }
}
