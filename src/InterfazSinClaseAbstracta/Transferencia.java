public class Transferencia implements Pagable{
    @Override
    public void procesarPago(double monto) { if (monto > 0) {
        System.out.println("Transferencia realizada: $" + monto);
    } else {
        System.out.println("Monto inválido");
    }
    }
}
