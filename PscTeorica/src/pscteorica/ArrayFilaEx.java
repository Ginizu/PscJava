
package pscteorica;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayFilaEx {
     static void exemploFila() {
      Queue<String> fila = new LinkedList<>();
      ArrayList<String> listaDePessoasAtendidas = new ArrayList<>();
      
      fila.add("Angelica");
      fila.add("Maria");
      fila.add("Estovao");
      
      System.out.println("Tamanho" + fila.size());
         
      String elementoFrente = fila.peek(); // Peek cria uma cópia do elemento
      System.out.println("Quem é o próximo? " + elementoFrente);
      
      //Desenfileirar: remover e retornar quem está no inicio da fila
      String primeiroDaFila = fila.remove();
         System.out.println(primeiroDaFila + " saiu da fila!");
         listaDePessoasAtendidas.add(primeiroDaFila);
         System.out.println(fila.peek() + " está agora no inicio da fila.");
      
         //Pesquisar
         System.out.println("João está na fila? " + fila.contains("João"));
         
         //Visitar todos da fila
         //Vamos fazer a fila andar
         while (fila.isEmpty()) {
             
             System.out.println(fila);
             String pessoa = fila.remove();
             // String 
         }
        
}
    
    public static void main(String[] args) {
        
        exemploFila();
        
    }
}
