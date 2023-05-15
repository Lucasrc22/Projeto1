public class Departamento implements TemSigla{
    private String nome;
    private String sigla;
    private Area area;
    Departamento(String nome, Area area, String sigla){
        this.nome = nome;
        this.area = area;
        this.sigla = sigla;
    }
    String getNome(){
        return this.nome;
    }
    void setNome(String nome){
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
