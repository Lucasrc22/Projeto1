public class Departamento {
    private String nome;
    private Area area;
    Departamento(String nome, Area area){
        this.nome = nome;
        this.area = area;
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
    
}
