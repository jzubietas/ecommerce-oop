package ecommerce;

import ecommerce.usuarios.Cliente;
import ecommerce.usuarios.Administrador;
import ecommerce.productos.ProductoFisico;
import ecommerce.productos.ProductoDigital;
import ecommerce.carrito.CarritoDeCompras;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Laura", "laura@email.com","clave", "Libros", "Orden123");
        Administrador admin = new Administrador(2, "Carlos", "admin@email.com","clave");

        ProductoFisico libro = new ProductoFisico(1, "Libro Java", "Aprende Java", 25.99, 10, 0.5, "21x29cm");
        ProductoDigital ebook = new ProductoDigital(2, "Ebook Python", "Curso avanzado", 15.50, 50, "https://descargas.com/python");

        admin.gestionarInventario();
        admin.crearPromocion();

        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.agregarProducto(libro);
        carrito.agregarProducto(ebook);
        carrito.agregarProducto(100); // producto genérico por ID
        carrito.agregarProducto("Curso Git", 12.99); // por nombre y precio

        carrito.listarProductos();
        carrito.calcularTotal();

        System.out.println("Simulación completada con éxito.");
    }
}