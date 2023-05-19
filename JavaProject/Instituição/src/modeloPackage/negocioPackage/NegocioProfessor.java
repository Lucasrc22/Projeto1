package negocioPackage;

import java.util.ArrayList;

import modeloPackage.Alocacao;
import modeloPackage.Curso;
import modeloPackage.Departamento;
import modeloPackage.NegocioException;
import modeloPackage.Professor;
import repositorioPackage.RepositorioProfessor;
public class NegocioProfessor {
    private RepositorioProfessor repositorio;

    private static NegocioProfessor instancia;

    public static NegocioProfessor getInstancia(){
        if(instancia == null){
            instancia = new NegocioProfessor();
        }
        return instancia;
    }

    private NegocioProfessor(){
        repositorio = new RepositorioProfessor();
    }

    public void inserirItem(Professor item) throws NegocioException{
        validarProfessor(item);
        repositorio.inserirItem(item);
    }

    private void validarProfessor(Professor item) throws NegocioException{

        ValidacaoNome.validarNome(item.getNome());
        validarCpf(item);

        if(repositorio.consultarPorCpf(item.getCpf()) != null){
            throw new NegocioException("Professor com mesmo CPF");
        }
    }

    private void validarCpf(Professor item) throws NegocioException {

        if(item.getCpf() == null || item.getCpf().length() != 11){
            throw new NegocioException("O CPF precisa ter 11 caracteres ");
        }else{
            for(char caractere : item.getCpf().toCharArray()){
                if(!Character.isDigit(caractere)){
                    throw new NegocioException("O CPF deve ser composto só por números");
                }
            }
        }
    }

    public ArrayList<Professor> consultarTodos() {
        return null;
    }

    public ArrayList<Alocacao> consultarPorProfessorECurso(Departamento aRemover) {
        return null;
    }

    public ArrayList<Alocacao> consultarPorDepartamentoECurso(Curso aRemover) {
        return null;
    }

    public ArrayList<Alocacao> consultarPorProfessorEDepartamento(Professor aRemover) {
        return null;
    }

    public void removeItem(Professor aRemover) {
    }
}
