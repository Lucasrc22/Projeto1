package repositorioPackage;
import java.util.ArrayList;

import modeloPackage.Area;
import modeloPackage.Departamento;

public class RepositorioDepartamento extends RepositorioGenerico<Departamento> {

    public ArrayList<Departamento> consultarPorArea(Area area){
        ArrayList<Departamento> resultado = new ArrayList<Departamento>();

        for(Departamento depto : colecao){
            if(depto.getArea().equals(area)){
                resultado.add(depto);
            }
        }
        return resultado;
    }
    public Departamento consultarPorSigla(String sigla){
        Departamento resultado = null;
        for(Departamento depto : colecao){
            if(depto.getSigla().equals(sigla)){
                resultado = depto;
                break;
            }
        }
       return resultado;
    }

    public ArrayList<Departamento> consultarNome(String nome){
        ArrayList<Departamento> resultado = new ArrayList<Departamento>();
        for(Departamento depto: colecao){
            if(depto.getNome().contains(nome)){
                resultado.add(depto);
            }
        }
        return resultado;
    }

    public Departamento consultarPorNomeExatoEArea(String nome, Area area){
        Departamento resultado = null;

        for(Departamento depto : colecao){
            if(depto.getNome().equals(nome) && depto.getArea().equals(area)){
                resultado = depto;
                break;
            }
        }
        return resultado;
    }
}
