import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {
        try{
            final Departamento deptoComp = new Departamento("Depto de Computação", Area.EXATAS,"DC");
            final Departamento deptoEnf = new Departamento("Depto de Enfermagem" , Area.BIOLOGICAS,"DENF");
            final Departamento deptoAds = new Departamento("Departamento de Administração", Area.EXATAS, "ADM");
            Curso cursoCc = new Curso("Eng. Computação", "Ecomp", deptoComp);
            Curso cursoAds = new Curso("Analise e Desenvolvimento de Sistemas", "ADS", deptoComp);
            Coordenador coordenador = new Coordenador("Carlos Silva", "70719240158", deptoComp);
            coordenador.addCursoCoord(cursoAds);
            coordenador.addCursoCoord(cursoCc);
        

            ArrayList<TemSigla> tudoComSigla = new ArrayList<TemSigla>();
            tudoComSigla.add(deptoComp);
            tudoComSigla.add(deptoEnf);
            tudoComSigla.add(deptoAds);

            for(TemSigla itemCoTemSigla : tudoComSigla){
                System.out.println(itemCoTemSigla.getSigla());
            }
    
        } catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
    

   

