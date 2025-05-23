package ecommerce.usuarios;

public class UsuarioPremium extends Usuario {
    private double descuento;

    public UsuarioPremium(int id, String nombre, String email, String contraseña, double descuento) {
        super(id, nombre, email, contraseña);
        this.descuento = descuento;
    }

    public double getDescuento() { return descuento; }
    public void setDescuento(double descuento) { this.descuento = descuento; }
}
