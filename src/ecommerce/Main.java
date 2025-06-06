package ecommerce;

import ecommerce.usuarios.Usuario;
import ecommerce.usuarios.UsuarioPremium;
import ecommerce.productos.Producto;
import ecommerce.productos.ProductoDigital;
import ecommerce.carrito.CarritoDeCompras;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new UsuarioPremium(1, "Jhonathan", "jhonathan@email.com", "secure123", 0.15);
        Producto producto = new ProductoDigital(1, "Curso Java", "Curso de introducción a Java", 49.99, 100, "http://descarga.com/java");

        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.agregarProducto(producto, 2);

        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Producto agregado: " + producto.getNombre());
        System.out.println("Total del carrito: $" + carrito.calcularTotal());

        // Semana 6: Pruebas de inventario y pagos
        Producto productoInventario = new ProductoDigital(2, "Ebook Java", "Guía PDF de Java", 29.99, 50, "http://descarga.com/ebook");
        GestorInventario gestor = new GestorInventarioDigital();
        gestor.añadirProducto(productoInventario);
        gestor.actualizarStock(2, 45);


        ProcesoPago pago = new PagoTarjeta();
        pago.iniciarPago(29.99);
        if (pago.verificarPago()) {
            pago.confirmarPago();
        }


    }
}
