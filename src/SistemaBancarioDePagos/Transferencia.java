public class Transferencia implements Pagable{
    public double comision = 15;

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            double calculoComision = monto*(comision/100);
            System.out.println("Pago con transferencia: "+monto);
            System.out.println("Comision: "+calculoComision);
            System.out.println("Pago total: $" + (monto+calculoComision));
            System.out.println("Pago con Transferencia procesado\n");
        } else {
            System.out.println("Monto inválido");
        }
    }
}
