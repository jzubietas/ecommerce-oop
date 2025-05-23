package ecommerce.usuarios;

public class Usuario {
    protected int id;
    protected String nombre;
    protected String email;
    protected String contraseña;

    public Usuario(int id, String nombre, String email, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public String getContraseña() { return contraseña; }
}
