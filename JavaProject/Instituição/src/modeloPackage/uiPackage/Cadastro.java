package uiPackage;
import java.time.DayOfWeek;
import java.util.ArrayList;

import modeloPackage.Curso;
import modeloPackage.Professor;
import negocioPackage.NegocioCurso;
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
        Object todosCursos = NegocioCurso.getInstancia().consultarTodos();
        if(todosCursos.size()==0){
            System.out.println("\nVocê precisa primeiro cadastrar um curso ");
            return;
        }

        ArrayList<Professor> todosProfessores = NegocioProfessor.getInstancia().consultarTodos();
        
    }
}
