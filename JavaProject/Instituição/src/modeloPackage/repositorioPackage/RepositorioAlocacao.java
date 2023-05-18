package repositorioPackage;
import java.util.ArrayList;

import modeloPackage.Alocacao;
import modeloPackage.Curso;
import modeloPackage.Departamento;
import modeloPackage.DiaDaSemana;
import modeloPackage.Professor;
public class RepositorioAlocacao extends RepositorioGenerico<Alocacao> {
    public ArrayList<Alocacao> consultarPorDepartamento(Departamento depto){
        ArrayList<Alocacao> resultado = new ArrayList<Alocacao>();

        for(Alocacao alocacao : colecao){
            if(alocacao.getCurso().getDepartamento().equals(depto)){
                resultado.add(alocacao);
            }
        }
        return resultado;
    }
    
    public ArrayList<Alocacao> consultarPorCurso(Curso curso){
        ArrayList<Alocacao> resultado = new ArrayList<Alocacao>();
        for(Alocacao alocacao: colecao){
            if(alocacao.getCurso().equals(curso)){
                resultado.add(alocacao);
            }
        }
        return resultado;
    }

    public Alocacao consultaPorProfessorECurso(Professor prof, Curso curso){
        Alocacao resultado = null;
        for(Alocacao alocacao : colecao){
            if(alocacao.getProfessor().equals(prof) && alocacao.getCurso().equals(curso)){
                resultado = alocacao;
                break;
            }
        }
        return resultado;
    }

    public ArrayList<Alocacao> consultaPorProfessorEDiaDaSemana(Professor professor, DiaDaSemana diaDaSemana) {
        ArrayList<Alocacao> resultado = new ArrayList<Alocacao>();
        for(Alocacao alocacao: colecao){
            if(alocacao.getProfessor().equals(professor) && alocacao.getDiaDaSemana().equals(diaDaSemana)){
                resultado.add(alocacao);
            }
        }
        return resultado;
    }
}
