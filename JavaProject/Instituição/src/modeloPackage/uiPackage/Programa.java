package uiPackage;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScannerUtils.setScanner(scanner);

        try{
            boolean continuar = true;

            while(continuar){
                int opcao = imprimirMenuPrincipal();
                continuar = processarOpcao(opcao);
            }
        } finally{
            scanner.close();
        }
       
    }

    private static boolean processarOpcao(int opcao) {
        return false;
    }

    private static int imprimirMenuPrincipal() {
        System.out.println("\nEscolha uma opção para continuar: ");
        System.out.println("0: Sair do Sistema");
        System.out.println("1: Cadastrar");
        System.out.println("2: Consultar");
        System.out.println("3: Remover");
        return ScannerUtils.pedirInt("Digite a opção deseja ");
    }

    private static int imprimirSubMenuGenerico(){
        System.out.println("O: Voltar");
        System.out.println("1: Departamento");
        System.out.println("2: Curso");
        System.out.println("3: Professor");
        System.out.println("4: Alocacao");
        return ScannerUtils.pedirInt("Digite a opção desejada: ");
    }

    private static void processarOpcaoCadastro() {
        System.out.println("\nO que você deseja cadastrar? ");
    
        int opcao = imprimirSubMenuGenerico();
        if (opcao == 0) {
            System.out.println("Opção inválida");// Opção inválida
        } else {
            Consulta.processarConsulta(opcao);
        }
        System.out.println("Só devia rodar no else");
        opcao = ScannerUtils.pedirInt("Digite a opção desejada");
    }
    
    private static void processarOpcaoRemocao() {
        System.out.println("\nO que você deseja remover? ");
        int opcao = imprimirSubMenuGenerico();
        if (opcao == 0) {
            System.out.println("Opção inválida");// Opção inválida
        } else {
            Remocao.processarRemocao(opcao);
        }
        opcao = ScannerUtils.pedirInt("Digite a opção desejada");
    }
    
}
