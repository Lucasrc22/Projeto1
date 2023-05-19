package uiPackage;

import java.util.ArrayList;
import java.util.Scanner;

import modeloPackage.Area;
import modeloPackage.Curso;
import modeloPackage.Departamento;
import negocioPackage.NegocioCurso;
import negocioPackage.NegocioDepartamento;

public class ScannerUtils {
    private static Scanner scanner;
    public static void setScanner(Scanner scanner) {
        ScannerUtils.scanner = scanner;
    }

    public static int pedirInt(String mensagem){
        System.out.println(mensagem);
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public static String pedirString(String mensagem){
        System.out.print(mensagem);
        return scanner.nextLine();
    }
    public static Area pedirArea(){
        int codArea= 0;

        while(codArea < 1 || codArea > 3){
            codArea = ScannerUtils.pedirInt("Informe a área: \n1 para Biologicas \n2 para Exatas \n3");
        }
        Area area = null;
        if(codArea==1){
            area= Area.BIOLOGICAS;
        }else if(codArea == 2){
            area=Area.EXATAS;
        }else if(codArea ==3){
            area= Area.HUMANAS;
        }
        return area;
    }
    public static Departamento pedirDepartamento(){
        return pedirDepartamento(NegocioDepartamento.getInstancia().consultarTodos());
    }

    private static Departamento pedirDepartamento(ArrayList<Departamento> deptos) {
        if(deptos == null || deptos.size()==0) return null;

        System.out.println("Departamentos disponíveis: \nCódigo - Nome (Sigla)");
        for(int i = 0;i< deptos.size();i++){
            Departamento item = deptos.get(i);
            System.out.println((i+1)+ " - "+ item.getNome()+ " - "+item.getSigla()+ ")");
        }
        int posicaoDepto = 0;
        while(posicaoDepto < 1 || posicaoDepto>deptos.size()){
            posicaoDepto = ScannerUtils.pedirInt("Informe o código do departamento: ");
        }
        Departamento depto = deptos.get(posicaoDepto-1);
        return depto;
        
    }
    public static Curso pedirCurso(){
        return pedirCurso(NegocioCurso.getInstancia().consultarTodos());
    }

    public static Curso pedirCurso(ArrayList<Curso> cursos){
        return null;
    }
}
