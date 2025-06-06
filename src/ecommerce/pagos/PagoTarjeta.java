
package ecommerce.pagos;

public class PagoTarjeta implements ProcesoPago {
    @Override
    public void iniciarPago(double monto) {
        System.out.println("Procesando pago con tarjeta por: $" + monto);
    }

    @Override
    public boolean verificarPago() {
        return true;
    }

    @Override
    public void confirmarPago() {
        System.out.println("Pago con tarjeta confirmado.");
    }
}
