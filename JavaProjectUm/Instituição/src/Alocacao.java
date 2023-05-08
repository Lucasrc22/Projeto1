public class Alocacao {
    Professor professor;
    Curso curso;
    String diaDaSemana;
    String horario;
    public Alocacao(Professor professor, Curso curso, String diaDaSemana, String horario){
        this.professor = professor;
        this.curso = curso;
        this.diaDaSemana = diaDaSemana;
        this.horario = horario;
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
    public String getDiaDaSemana() {
        return diaDaSemana;
    }
    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String toString(){
        return this.getProfessor().getNome() + " dá aula no curso "+ this.getCurso().getNome() + " às " + this.getHorario() + " das " + this.getDiaDaSemana();

    }
}
