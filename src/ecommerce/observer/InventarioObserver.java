
package ecommerce.observer;

public class InventarioObserver implements Observador {
    public void actualizar(String mensaje) {
        System.out.println("Inventario recibió notificación: " + mensaje);
    }
}
