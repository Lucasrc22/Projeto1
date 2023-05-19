package negocioPackage;
import java.util.ArrayList;

import modeloPackage.Alocacao;
import modeloPackage.Curso;
import modeloPackage.Departamento;
import modeloPackage.NegocioException;
import repositorioPackage.RepositorioCurso;
public class NegocioCurso {
    private RepositorioCurso repositorio;
    private static NegocioCurso instancia;

    public static NegocioCurso getInstancia(){
        if(instancia == null){
            instancia = new NegocioCurso();
        }
        return instancia;
    }

    private NegocioCurso(){
        repositorio = new RepositorioCurso();
    }

    public void inserirItem(Curso item) throws NegocioException{
        validarCurso(item);

        repositorio.inserirItem(item);
    }

    private void validarCurso(Curso item) throws NegocioException{
        ValidacaoNome.validarNome(item.getNome());

        ArrayList<Curso> cursosDoMesmoDepto = repositorio.consultarDepartamento(item.getDepartamento());

        for(Curso curso: cursosDoMesmoDepto){
            if(curso.getNome().equals(item.getNome())){
                throw new NegocioException("Curso com o mesmo nome dá existe no departamento");
            }
        }

        if(NegocioIntemComSigla.getInstancia().consultarPorSigla(item.getSigla()) != null){
            throw new NegocioException("Outro item com a mesma sigla já existe");
        }
    }
    public void removeItem(Curso item){
        repositorio.removerItem(item);
    }

    public ArrayList<Curso> consultarTodos() {
        return null;
    }

    public ArrayList<Alocacao> consultarPorDepartamento(Departamento aRemover) {
        return null;
    }

    
}
