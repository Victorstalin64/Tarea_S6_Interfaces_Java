public class ActaNotas implements Imprimible{
    public String periodoAcademico = "2026A";

    @Override
    public void imprimir(){
        System.out.println("Imprimiendo Acta Notas");
        System.out.println("Periodo Academico: "+periodoAcademico+"\n");
    }
}
