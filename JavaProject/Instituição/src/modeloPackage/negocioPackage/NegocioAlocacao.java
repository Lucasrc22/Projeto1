package negocioPackage;

import java.util.ArrayList;
import modeloPackage.Alocacao;
import modeloPackage.Curso;
import modeloPackage.NegocioException;
import modeloPackage.Professor;
import repositorioPackage.RepositorioAlocacao;
public class NegocioAlocacao {
    private RepositorioAlocacao repositorio;

    private static NegocioAlocacao instancia;

    public static NegocioAlocacao getInstancia(){
        if(instancia == null){
            instancia = new NegocioAlocacao();
        }
        return instancia;
    }

    private NegocioAlocacao(){
        repositorio = new RepositorioAlocacao();
    }

    public void inserirItem(Alocacao item) throws NegocioException{
        validarAlocacao(item);
        repositorio.inserirItem(item);
    }

    private void validarAlocacao(Alocacao item) throws NegocioException {
        if(repositorio.consultaPorProfessorECurso(item.getProfessor(), item.getCurso()) != null){
            throw new NegocioException("O item deve professor e curso devem ser composto por letras ");
        }
        ArrayList<Alocacao> alocacoesProfessorDia = repositorio.consultaPorProfessorEDiaDaSemana(item.getProfessor(), item.getDiaDaSemana());

        for(Alocacao alocacao: alocacoesProfessorDia){
            if(alocacao.getHora().equals(item.getHora())){
                throw new NegocioException("Já existe alocação para o professor informado no mesmo horario");
            }
        }
    }

    public void removeItem(Alocacao item){
        repositorio.removerItem(item);
    }
    public ArrayList<Alocacao> consultarTodos() {
        return null;
    }

    public Alocacao consultarPorProfessorECurso(Professor professor, Curso curso) {
        return null;
    }

    
}
