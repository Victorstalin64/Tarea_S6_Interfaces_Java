void main() {
    Pagable pago1 = new PagoTarjeta();
    Pagable pago2 = new Transferencia();
    System.out.println("--- Iniciando pagos ---");
    pago1.procesarPago(150.50);
    pago2.procesarPago(500.00);
    pago1.procesarPago(-10);
}
