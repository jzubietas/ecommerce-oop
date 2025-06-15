
package ecommerce.observer;

public class UIObserver implements Observador {
    public void actualizar(String mensaje) {
        System.out.println("Interfaz de Usuario actualizada: " + mensaje);
    }
}
