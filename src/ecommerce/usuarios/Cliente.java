package ecommerce.usuarios;

public class Cliente extends Usuario {
    private String preferencias;
    private String historialCompras;

    public Cliente(int id, String nombre, String email, String preferencias, String historialCompras) {
        super(id, nombre, email);
        this.preferencias = preferencias;
        this.historialCompras = historialCompras;
    }
}