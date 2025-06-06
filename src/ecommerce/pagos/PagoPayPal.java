
package ecommerce.pagos;

public class PagoPayPal implements ProcesoPago {
    @Override
    public void iniciarPago(double monto) {
        System.out.println("Redirigiendo a PayPal para el monto: $" + monto);
    }

    @Override
    public boolean verificarPago() {
        return true;
    }

    @Override
    public void confirmarPago() {
        System.out.println("Pago con PayPal confirmado.");
    }
}
