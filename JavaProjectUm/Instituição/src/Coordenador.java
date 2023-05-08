import java.util.ArrayList;

public class Coordenador extends Professor{
    ArrayList<Curso> cursosCoordenados;
    public Coordenador(String nome, String cpf, Departamento departamento){
        super(nome,cpf,departamento);

        cursosCoordenados = new ArrayList<Curso>();
    }
    public void setNome(String nome){
        String nomeComCoord = "Coord." + nome;
        super.setNome(nomeComCoord);
    }

    public void addCursoCoord(Curso novoCurso){
        if(novoCurso.getDepartamento().equals(this.getDepartamento())){
            cursosCoordenados.add(novoCurso);
        } else {
            System.out.println("O curso não é do mesmo coordenador");
        }
    }

    
}
