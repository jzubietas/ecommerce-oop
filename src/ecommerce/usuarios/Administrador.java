package ecommerce.usuarios;

public class Administrador extends Usuario {

    public Administrador(int id, String nombre, String email, String contraseña) {
        super(id, nombre, email,contraseña);
    }

    public void gestionarInventario() {
        System.out.println("Inventario actualizado.");
    }

    public void crearPromocion() {
        System.out.println("Promoción creada.");
    }
}