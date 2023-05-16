package repositorioPackage;
import java.util.ArrayList;
public class RepositorioGenerico<T> {
    protected ArrayList<T> colecao;

    public RepositorioGenerico(){
        colecao = new ArrayList<T>();
    }

    public void inserirItem(T item){
        colecao.add(item);
    }

    public void removerItem(T item){
        colecao.remove(item);
    }

    public ArrayList<T> consultarTodos(){
        return new ArrayList<T>(colecao);
    }
}
