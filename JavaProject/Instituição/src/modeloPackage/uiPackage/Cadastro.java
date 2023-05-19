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
public class Cadastro {
    public static void processarCadastro(int tipo){
        switch(tipo){
            case 1:
                cadastrarDepartamento();
                break;
            case 2:
                cadastrarDepartamento();
                break;
            case 3:
                cadastrarDepartamento();
                break;
            case 4:
                cadastrarDepartamento();
                break;
        }
    }
    private static void cadastrarAlocacao(){
        ArrayList<Curso> todosCursos = NegocioCurso.getInstancia().consultarTodos();
        if(todosCursos.size()==0){
            System.out.println("\nVocê precisa primeiro cadastrar um curso ");
            return;
        }

        ArrayList<Professor> todosProfessores = NegocioProfessor.getInstancia().consultarTodos();
        if(todosProfessores.size()==0){
            System.out.println("\nVocê precisa primeiro cadastrar um professor ");
            return;
        }
        Curso curso = ScannerUtils.pedirCurso(todosCursos);
        Professor prof = ScannerUtils.pedirProfessor(todosProfessores);
        DayOfWeek dia = ScannerUtils.pedirDiaDaSemana();
        String hora = ScannerUtils.pedirString("Informe a hora da alocação");

        Alocacao alocacao = new Alocacao(prof, curso, null, hora);
        try{
            NegocioAlocacao.getInstancia().inserirItem(alocacao);
            System.out.println("Alocação cadastrada com sucesso");
        } catch(Exception e){
            System.out.println("Erro ao cadastrar alocação: "+ e.getMessage()+ "\n\n");
        }
    }

    private static void cadastrarProfessor(){
        ArrayList<Departamento> todosDeptos = NegocioDepartamento.getInstancia().consultarTodos();
        if(todosDeptos.size() == 0){
            System.out.println("\n Você precisa cadastrar departamento antes");
            return;
        }
        String nomeProf = ScannerUtils.pedirString("\n Informe o nome do Professor: ");
        String cpfProf = ScannerUtils.pedirString("Informe o cpf do profesor: ");

        Departamento depto = ScannerUtils.pedirDepartamento(todosDeptos);

        try{
            Professor professor = new Professor(nomeProf, cpfProf, depto);
            NegocioProfessor.getInstancia().inserirItem(professor);
            System.out.println("Professor cadastrado com sucesso\n\n");
        } catch(Exception e){
            System.out.println("\n Você precisa cadastrar um professor antes "+ e.getMessage()+ "\n\n");
        }
    }

    private static void cadastrarCurso(){
        ArrayList<Departamento> todosDeptos = NegocioDepartamento.getInstancia().consultarTodos();
        if(todosDeptos.size()==0){
            System.out.println("\n Você precisa cadastrar um curso antes");
            return;
        }
        String nomeCurso = ScannerUtils.pedirString("\nInforme o nome do curso: ");
        String siglaCurso = ScannerUtils.pedirString("Digite a sigla do curso: ");

        Departamento depto = ScannerUtils.pedirDepartamento(todosDeptos);

        try{
            Curso curso = new Curso(nomeCurso, siglaCurso, depto);
            NegocioCurso.getInstancia().inserirItem(curso);
            System.out.println("Curso cadastrado com sucesso\n\n");
        }catch(Exception e){
            System.out.println("Erro ao cadastrar o curso "+e.getMessage() +"\n\n");
        }
    }

    private static void cadastrarDepartamento(){
        String nomeDepto = ScannerUtils.pedirString("\nInforme o nome do departamento: ");
        String siglaDepto = ScannerUtils.pedirString("Informe a sigla do departamento: ");
        Area areaDepto = ScannerUtils.pedirArea();

        try{
            Departamento departamento = new Departamento(nomeDepto, areaDepto, siglaDepto);
            NegocioDepartamento.getInstancia().inserirItem(departamento);
            System.out.println("Departamento cadastrado com sucesso!");
            
        }catch(Exception e){
            System.out.println("Erro ao cadastrar o departamento "+e.getMessage()+"\n\n");
        }
    }
    private static void pedirDiaDaSemana() {
    }
}
