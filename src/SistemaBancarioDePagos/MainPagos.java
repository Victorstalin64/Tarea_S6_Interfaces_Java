public class MainPagos {
    void main() {
        Pagable pagable1 = new PagoEfectivo();
        Pagable pagable2 = new PagoTarjeta();
        Pagable pagable3 = new Transferencia();
        System.out.println("=== INICIANDO PAGOS ===");
        pagable1.procesarPago(200);
        pagable2.procesarPago(150);
        pagable3.procesarPago(123.4);
    }
}
