package ecommerce.usuarios;

import java.util.regex.Pattern;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String contraseña;

    public Usuario(int id, String nombre, String email, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        setEmail(email);
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!Pattern.matches("^[\w.-]+@[\w.-]+\.[a-zA-Z]{2,6}$", email)) {
            throw new IllegalArgumentException("Correo electrónico inválido.");
        }
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}