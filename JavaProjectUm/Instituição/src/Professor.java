public class Professor {
    private String nome;
    private String cpf;
    private Departamento departamento;

    public Professor(String nome, String cpf, Departamento departamento){
        this.nome= nome;
        this.cpf = cpf;
        this.departamento = departamento;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
