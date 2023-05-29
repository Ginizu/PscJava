
package pscteorica;

import java.util.HashMap;
import java.util.Map;


public class TabelaHash {
    
    static void exemploTabelaHash() {
        Map<String, Integer> tabela = new HashMap<>();
        
       // add alementos a tabela
       tabela.put("Maçã", 200);
       tabela.put("Melancia", 300);
       tabela.put("Banana", 180);
       tabela.put("Kiwi", 80);
       
        System.out.println("Linhas " + tabela.size());
        
        //consulta a tabela
        System.out.println("Quantidade de banana" + tabela.get("Banana"));
        
    }
    public static void main(String[] args) {
        exemploTabelaHash();
        
    }
}
