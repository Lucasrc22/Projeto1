public class Programa {
private static final Departamento deptoComp = new Departamento("Depto de Computação");
private static final Departamento deptoEnf = new Departamento("Depto de Enfermagem");
private static final Departamento deptoExatas = new Departamento("Departamento de Química ");
    public static void main(String[] args) {

        Curso cursoCc = new Curso("Eng. Computação", "Ecomp", deptoComp);
        Curso cursoAds = new Curso("Analise e Desenvolvimento de Sistemas", "ADS", deptoComp);
        Curso cursoEnf = new Curso("Enfermagem", "Enf", deptoEnf);
        Curso cursoQuim = new Curso("Química", "Quim", deptoExatas);
        Professor professorJoao = new Professor("João Silva", "01417176458", deptoComp);
        Professor professorJandyson = new Professor("Jandyson da Silva", "02252360445", deptoExatas);
        Coordenador coordenador = new Coordenador("Carlos Silva", "70719240158", deptoComp);
        coordenador.addCursoCoord(cursoAds);
        coordenador.addCursoCoord(cursoCc);
        coordenador.addCursoCoord(cursoEnf);
        coordenador.addCursoCoord(cursoQuim);

        Alocacao alocacao = new Alocacao(professorJoao, cursoCc, null, 0);
        Alocacao alocacao2 = new Alocacao(professorJandyson,cursoQuim, null, 0);
        System.out.println(alocacao);
        System.out.println(alocacao2);

    }
    

   
}
