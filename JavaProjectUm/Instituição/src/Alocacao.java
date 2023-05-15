public class Alocacao {
    private Professor professor;
    private Curso curso;
    private DiaDaSemana diaDaSemana;
    private int hora;
    public Alocacao(Professor professor, Curso curso, DiaDaSemana diaDaSemana, int hora){
        this.professor = professor;
        this.curso = curso;
        this.diaDaSemana = diaDaSemana;
        this.hora = hora;
    }
    public Alocacao() {
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public DiaDaSemana getDiaDaSemana() {
        return diaDaSemana;
    }
    public void setDiaDaSemana(DiaDaSemana diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    
    
}
