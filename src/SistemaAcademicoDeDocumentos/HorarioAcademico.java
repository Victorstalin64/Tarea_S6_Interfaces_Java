public class HorarioAcademico implements Imprimible {
    public String carrera = "Desarrollo de Software";

    @Override
    public void imprimir(){
        System.out.println("Imprimiendo certificado");
        System.out.println("Carrera: "+carrera+"\n");
    }
}
