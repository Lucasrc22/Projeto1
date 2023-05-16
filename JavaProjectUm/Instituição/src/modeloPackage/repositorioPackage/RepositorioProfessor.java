package repositorioPackage;

import modeloPackage.Departamento;
import modeloPackage.Professor;
import java.util.ArrayList;

public class RepositorioProfessor extends RepositorioGenerico<Professor>{
    public ArrayList<Professor> consultarPorDepartamento(Departamento depto){
        ArrayList<Professor> resultado = new ArrayList<Professor>();
        for(Professor prof: colecao){
            if(prof.getDepartamento().equals(depto)){
                resultado.add(prof);
            }
        }
        return resultado;
    }

    public Professor consultarPorCpf(String cpf){
        Professor resultado = null;
        for(Professor prof : colecao){
            if(prof.getCpf().equals(cpf)){
                resultado = prof;
                break;
            }
        }
        return resultado;
    }
    public ArrayList<Professor> consultarPorNome(String nome){
        ArrayList<Professor> resultado = new ArrayList<Professor>();
        for(Professor curso: colecao){
            if(curso.getNome().contains(nome)){
                resultado.add(curso);
            }
        }
        return resultado;
    }
}
