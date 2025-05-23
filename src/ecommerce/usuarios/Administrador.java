package ecommerce.usuarios;

public class Administrador extends Usuario {

    public Administrador(int id, String nombre, String email) {
        super(id, nombre, email);
    }

    public void gestionarInventario() {
        System.out.println("Inventario actualizado.");
    }

    public void crearPromocion() {
        System.out.println("Promoción creada.");
    }
}