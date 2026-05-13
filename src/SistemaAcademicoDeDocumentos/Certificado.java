public class Certificado implements Imprimible {
    public int numeroDocumento = 1;
    @Override
    public void imprimir(){
        System.out.println("Imprimiendo certificado");
        System.out.println("Numero de documento: "+numeroDocumento+"\n");
    }
}
