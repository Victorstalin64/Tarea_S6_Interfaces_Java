public class MainAcademico {
    void main() {
        Imprimible imprimible1 = new Certificado();
        Imprimible imprimible2 = new ActaNotas();
        Imprimible imprimible3 = new HorarioAcademico();
        System.out.println("=== INICIANDO IMPRESIONES ===");
        imprimible1.imprimir();
        imprimible2.imprimir();
        imprimible3.imprimir();
    }
}
