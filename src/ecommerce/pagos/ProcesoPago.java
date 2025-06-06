
package ecommerce.pagos;

public interface ProcesoPago {
    void iniciarPago(double monto);
    boolean verificarPago();
    void confirmarPago();
}
