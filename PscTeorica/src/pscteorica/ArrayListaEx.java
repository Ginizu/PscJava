
package pscteorica;
import java.util.ArrayList;

public class ArrayListaEx {
    
    static void exemploLista() {
    ArrayList<String> lista = new ArrayList<>();
    
        System.out.println("A lista está vazia?" + lista.isEmpty());
        System.out.println("Tamanho" + lista.size());
        
        lista.add("🍎"); // add maçã
        lista.add("🍉"); // melancia
        lista.add("🍓"); // melancia
        lista.add("🥑"); // melancia
        
        System.out.println("A lista está vazia?" + lista.isEmpty());
        System.out.println("Tamanho" + lista.size());
        
        for (String fruta : lista) {
            System.out.print(fruta + " ");
            
        }
        //Excluir 
        lista.remove(0);
        
        //Pesquisar
        System.out.println("A lista contém 🍎?" + lista.contains("🍎"));
        System.out.println("Indice do morango" + lista.indexOf("🍓"));
        
    }
    public static void main(String[] args) {
        exemploLista();
        
    }
}
