public class Programa {
private static final Departamento deptoComp = new Departamento("Depto de Computação");
private static final Departamento deptoEnf = new Departamento("Depto de Enfermagem");
    public static void main(String[] args) {

        Curso cursoCc = new Curso("Eng. Computação", "Ecomp", deptoComp);
        Curso cursoAds = new Curso("Analise e Desenvolvimento de Sistemas", "ADS", deptoComp);
        Curso cursoEnf = new Curso("Enfermagem", "Enf", deptoEnf);

        Professor professorJoao = new Professor("João Silva", "01417176458", deptoComp);
        Coordenador coordenador = new Coordenador("Carlos Silva", "70719240158", deptoComp);
        coordenador.addCursoCoord(cursoAds);
        coordenador.addCursoCoord(cursoCc);
        coordenador.addCursoCoord(cursoEnf);

        Alocacao alocacao = new Alocacao(professorJoao, cursoCc, "Quarta-feira", "19 horas");

        System.out.println(alocacao);
    }
    

   
}
