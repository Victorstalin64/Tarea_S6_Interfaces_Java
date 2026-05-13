public class PagoEfectivo implements Pagable {
    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago en Efectivo: $" + monto);
            System.out.println("Pago en Efectivo procesado \n");
        } else {
            System.out.println("Monto inválido");
        }
    }
}
