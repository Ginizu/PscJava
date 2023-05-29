package pscteorica;

import java.util.Stack;

public class ArrayPilha {
    static void exemploPilha() {
        Stack<Character> pilha = new Stack<>();
        
        pilha.push('A');
        System.out.println(pilha);
        
        pilha.push('E');
        System.out.println(pilha);
        
        pilha.push('I');
        System.out.println(pilha);
        
        pilha.push('O');
        System.out.println(pilha);
        
        pilha.push('U');
        System.out.println(pilha);
        
        System.out.println("Tamanho " + pilha.size());
        
        char elementoTopo = pilha.peek();
        System.out.println("Elemento removido: " + elementoTopo);
        System.out.println(pilha);
        
        char elementoRemovido = pilha.pop();
        System.out.println("Elemento removido: " + elementoRemovido);
        System.out.println(pilha);
        
        System.out.println("A pilha tem vogal U: " + pilha.contains('U'));
        
        while (!pilha.isEmpty()) {
            System.out.println(pilha);
            char elemento = pilha.remove(elementoTopo);
            
        }
        
    }

    public static void main(String[] args) {
        exemploPilha();
}
}
