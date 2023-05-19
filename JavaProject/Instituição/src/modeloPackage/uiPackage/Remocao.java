package uiPackage;
import java.time.DayOfWeek;
import java.util.ArrayList;

import modeloPackage.Alocacao;
import modeloPackage.Area;
import modeloPackage.Curso;
import modeloPackage.Departamento;
import modeloPackage.Professor;
import negocioPackage.NegocioAlocacao;
import negocioPackage.NegocioCurso;
import negocioPackage.NegocioDepartamento;
import negocioPackage.NegocioProfessor;
public class Remocao {

    public static void processarRemocao(int tipo) {

        switch(tipo){
            case 1:
                removerDepartamento();
                break;
            case 2:
                removerCurso();
                break;
            case 3:
                removerProfessor();
                break;
            case 4:
                removerAlocacao();
                break;
        }
    }
    private static void removerAlocacao(){
        NegocioAlocacao negocioAlocacao = NegocioAlocacao.getInstancia();

        if(negocioAlocacao.consultarTodos().size()==0){
            System.out.println("Não há alocação cadastrada");
            return;
        }
        Professor professor = ScannerUtils.pedirProfessor();
        Curso curso = ScannerUtils.pedirCurso();

        Alocacao aRemover = negocioAlocacao.consultarPorProfessorECurso(professor, curso);

        if(aRemover == null){
            System.out.println("Não há alocação para professor e curso");
        }else{
            System.out.println(aRemover);
            String confirmacao = ScannerUtils.pedirString("Tem certeza que deseja remover essa alocação de professor? ");
            if(confirmacao == "S"){
                negocioAlocacao.removeItem(aRemover);
                System.out.println("Alocação removida com sucesso");
            }else{
                System.out.println("Operação cancelada");
            }
        }
    }

    private static void removerProfessor(){
        Professor aRemover = ScannerUtils.pedirProfessor();
    }
    private static void removerCurso(){
        Curso aRemover = ScannerUtils.pedirCurso();
        if(aRemover == null){
            System.out.println("Não há cursos cadastrados");
            return;
        if(NegocioAlocacao.getInstancia().consultarPorCurso(aRemover).size()>0){
            System.out.println("Não é possível remover o curso pois há departamentos associados");
        }else if(NegocioProfessor.getInstancia().consultarPorDepartamentoECurso(aRemover).size()>0){
            System.out.println("Não é possível remover o departamento pois há cursos associados");
            return;
        }
        System.out.println(aRemover);
        String confirmacao = ScannerUtils.pedirString("Tem certeza que deseja remover esse departamento?  ");
        if(confirmacao == "S"){
            NegocioCurso.getInstancia().removeItem(aRemover);
            System.out.println("Departamento removida com sucesso");
        }else{
            System.out.println("Operação cancelada");
        }
        
    }
    private static void removerDepartamento(){
        Departamento aRemover = ScannerUtils.pedirDepartamento();
        if(aRemover == null){
            System.out.println("Não há cursos cadastrados");
            return;
        }
        if(NegocioCurso.getInstancia().consultarPorDepartamento(aRemover).size()>0){
            System.out.println("Não é possível remover o departamento pois há cursos associados");
            return;

        }else if(NegocioProfessor.getInstancia().consultarPorProfessorECurso(aRemover).size()>0){
            System.out.println("Não é possível remover o departamento pois há professores associados");
            return;
        }
        System.out.println(aRemover);
        String confirmacao = ScannerUtils.pedirString("Tem certeza que deseja remover esse departamento?  ");
        if(confirmacao == "S"){
            NegocioDepartamento.getInstancia().removeItem(aRemover);
            System.out.println("Departamento removida com sucesso");
        }else{
            System.out.println("Operação cancelada");
        }
    }
    
}
