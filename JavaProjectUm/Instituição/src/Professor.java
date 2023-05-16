public class Professor {
    private String nome;
    private String cpf;
    private Departamento departamento;

    public Professor(String nome, String cpf, Departamento departamento)throws Exception{
        setNome(nome);
        this.cpf = cpf;
        this.departamento = departamento;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if(cpf == null || cpf.length() != 11){
            throw new Exception("Cpf precisa ter 11 caracteres");
        }else{
            for(char caracteres: cpf.toCharArray()){
                if(!Character.isDigit(caracteres)){
                    throw new Exception("O cpf deve ser composto somente de números");
                }
            }
        }
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
