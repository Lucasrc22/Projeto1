package modeloPackage;

public enum DiaDaSemana implements TemAbreviacao {
    Segunda(1, "seg"),
    Terca(2, "ter"),
    Quarta(3, "qua"),
    Quinta(4, "qui"),
    Sexta(5, "sex"),
    Sabado(6, "sab"),
    Domingo(7, "dom");

    private final int ordem;
    private final String abreviacao;

    private DiaDaSemana(int ordem, String abreviacao){
        this.ordem = ordem;
        this.abreviacao = abreviacao;
        
    }
    public int getOrdem(){
        return this.ordem;

    }
    public String getAbreviacao(){
        return this.abreviacao;
    }
}
