package modeloPackage;

public class Departamento implements TemSigla{
    private String nome;
    private String sigla;
    private Area area;
    public Departamento(String nome, Area area, String sigla) throws Exception{
        setNome(nome);;
        this.area = area;
        this.sigla = sigla;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) throws Exception{
        NomeUtils.validarNome(nome);

        this.nome = nome;
        
    }
    public Area getArea() {
        return area;
    }
    public void setArea(Area area) {
        this.area = area;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    
}
