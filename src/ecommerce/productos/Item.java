package ecommerce.productos;

public abstract class Item {
    private int id;
    private String nombre;
    private double precio;

    public Item(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        setPrecio(precio);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }
}