public class Programa {
private static final Departamento deptoComp = new Departamento("Depto de Computação", Area.EXATAS);
private static final Departamento deptoEnf = new Departamento("Depto de Enfermagem", Area.BIOLOGICAS);

    public static void main(String[] args) {

        Curso cursoCc = new Curso("Eng. Computação", "Ecomp", deptoComp);
        Curso cursoAds = new Curso("Analise e Desenvolvimento de Sistemas", "ADS", deptoComp);
        Curso cursoEnf = new Curso("Enfermagem", "Enf", deptoEnf);

        Professor professorJoao = new Professor("João Silva", "01417176458", deptoComp);
        Coordenador coordenador = new Coordenador("Carlos Silva", "70719240158", deptoComp);
        coordenador.addCursoCoord(cursoAds);
        coordenador.addCursoCoord(cursoCc);
    

        Alocacao alocacao = new Alocacao(professorJoao, cursoCc, null, 0);
        
        System.out.println(alocacao);
        

    }
    

   
}
