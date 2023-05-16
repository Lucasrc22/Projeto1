package modeloPackage;
public class NomeUtils {
    public static void validarNome(String nome) throws Exception{
        if(nome == null){
            throw new Exception("O nome deve ter pelo menos dois caracteres");
        }
    };
}
