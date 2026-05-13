public class PagoTarjeta implements Pagable{
    public double comision = 12;
    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            double calculoComision = monto*(comision/100);
            System.out.println("Pago con tarjeta: "+monto);
            System.out.println("Comision: "+calculoComision);
            System.out.println("Pago total: $" + (monto+calculoComision));
            System.out.println("Pago con Tarjeta procesado\n");
        } else {
            System.out.println("Monto inválido");
        }
    }
}
