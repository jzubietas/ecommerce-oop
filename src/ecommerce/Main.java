package ecommerce;

import ecommerce.usuarios.Usuario;
import ecommerce.usuarios.UsuarioPremium;
import ecommerce.usuarios.Cliente;
import ecommerce.usuarios.Administrador;
import ecommerce.productos.Producto;
import ecommerce.productos.ProductoFisico;
import ecommerce.productos.ProductoDigital;
import ecommerce.carrito.CarritoDeCompras;

public class Main {
    public static void main(String[] args) {
    	Usuario usuario = new UsuarioPremium(1, "Jhonathan", "jhonathan@email.com", "secure123", 0.15);
    	
        Cliente cliente = new Cliente(1, "Laura", "laura@email.com", "email", "Libros", "Orden123");
        Administrador admin = new Administrador(2, "Carlos", "admin@email.com","clave");

        Producto producto = new ProductoDigital(1, "Curso Java", "Curso de introducción a Java", 49.99, 100, "http://descarga.com/java");
        ProductoFisico libro = new ProductoFisico(1, "Libro Java", null, 25.99, 0, 0.5, "21x29cm");
        ProductoDigital ebook = new ProductoDigital(2, "Ebook Python", "Manual básico", 15.50, 50, "http://link.com/ebook");

        admin.gestionarInventario();
        admin.crearPromocion();
        
        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.agregarProducto(producto, 2);

        System.out.println("Cliente y productos instanciados correctamente.");
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Producto agregado: " + producto.getNombre());
        System.out.println("Total del carrito: $" + carrito.calcularTotal());
    }
}