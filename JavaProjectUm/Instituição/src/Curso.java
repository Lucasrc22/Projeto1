public class Curso implements TemSigla{
    private String nome;
    private String sigla;
    private Departamento departamento;
    public Curso(String nome, String sigla, Departamento departamento){
        this.nome= nome;
        this.sigla = sigla;
        this.departamento = departamento;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getSigla(){
        return this.sigla;
    }
    public void setSigla(String sigla){
        this.sigla= sigla;
    }
    public Departamento getDepartamento(){
        return this.departamento;
    }
    public void setDepartamento(Departamento departamento){
        this.departamento= departamento;
    }
}
