package repositorioPackage;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import modeloPackage.Area;
import modeloPackage.Curso;
import modeloPackage.Departamento;


public class RepositorioCurso extends RepositorioGenerico<Curso> {

    public ArrayList<Curso> consultarPorArea(Area area){
        ArrayList<Curso> resultado = new ArrayList<Curso>();

        for(Curso curso : colecao){
            if(curso.getDepartamento().getArea().equals(area)){
                resultado.add(curso);
            }
        }
        return resultado;
    }
    public ArrayList<Curso> consultarDepartamento(Departamento depto){
        ArrayList<Curso> resultado = new ArrayList<Curso>();
        for(Curso curso: colecao){
            if(curso.getDepartamento().equals(depto)){
                resultado.add(curso);
            }
        }
        return resultado;
    }
    public Curso consultarPorSigla(String sigla){
        Curso resultado = null;
        for(Curso curso : colecao){
            if(curso.getSigla().equals(sigla)){
                resultado = curso;
                break;
            }
        }
        return resultado;
       
    }
    public ArrayList<Curso> consultarPorNome(String nome){
        ArrayList<Curso> resultado = new ArrayList<Curso>();
        for(Curso curso: colecao){
            if(curso.getNome().contains(nome)) {
                resultado.add(curso);
            }
        }
        return resultado;
    }
}