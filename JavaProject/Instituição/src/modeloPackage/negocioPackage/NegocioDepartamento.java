package negocioPackage;
import java.util.ArrayList;

import modeloPackage.Area;
import modeloPackage.Departamento;
import modeloPackage.NegocioException;
import repositorioPackage.RepositorioDepartamento;

public class NegocioDepartamento {
    private RepositorioDepartamento repositorio;

    private static NegocioDepartamento instancia;

    public static NegocioDepartamento getInstancia(){
        if(instancia == null){
            instancia = new NegocioDepartamento();
        }
        return instancia;
    }

    private NegocioDepartamento(){
        repositorio = new RepositorioDepartamento();
    }

    public void inserirItem(Departamento item) throws Exception{
        validarDepartamento(item);

        repositorio.inserirItem(item);
    }

    public void validarDepartamento(Departamento item) throws NegocioException{
        ValidacaoNome.validarNome(item.getNome());

        if(repositorio.consultarPorNomeExatoEArea(item.getNome(), item.getArea()) != null){
            throw new NegocioException("Departamento com mesmo nome da mesma área já existe");
        } 

        if(NegocioIntemComSigla.getInstancia().consultarPorSigla(item.getSigla()) != null){
            throw new NegocioException("Outro item com a mesma sigla existe");
        }
    }
    public ArrayList<Departamento> consultarArea(Area area){
        return repositorio.consultarPorArea(area);
    }

    public ArrayList<Departamento> consultarTodos() {
        return null;
    }

    public void removeItem(Departamento aRemover) {
    }
}
