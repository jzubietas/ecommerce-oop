package ecommerce.productos;

public class ProductoFisico extends Producto {
    private double peso;
    private String dimensiones;

    public ProductoFisico(int id, String nombre, String descripcion, double precio, int stock, double peso, String dimensiones) {
        super(id, nombre, descripcion, precio, stock);
        setPeso(peso);
        this.dimensiones = dimensiones;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            throw new IllegalArgumentException("El peso no puede ser negativo.");
        }
        this.peso = peso;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.println("Peso: " + peso + "kg, Dimensiones: " + dimensiones);
    }
}