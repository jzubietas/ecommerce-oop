
package ecommerce.observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoObservable {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void notificarCambio(String mensaje) {
        for (Observador obs : observadores) {
            obs.actualizar(mensaje);
        }
    }
}
