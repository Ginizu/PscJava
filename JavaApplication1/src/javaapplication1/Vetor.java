package javaapplication1;

import java.io.*;

import javax.swing.JOptionPane;

public class Vetor {
    public static void main (String [] args) {
        // essa é uma variável de referência capaz de refernciar um vetor de ints,
        int []  v1;
        //também podemos declarar assim
        int v2[];
        int [] v3 = new int [4];
        //observe, contudo, que somente temos um vetor, no indice zero atribuindo o valor
        v3 [0] = 2;
        //também podemos exibi-lo
        System.out.println(v3[0]);
        //aqui exibimos o valor 0, já que o compilador inicializa as posições automatico
        System.out.println(v3[2]);
        //Também podemos solicitar ao usuario que digite um valor a ser guardado em uma 
        //um vetor
        v3[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
        //e exibir também
        JOptionPane.showMessageDialog(null, v3[1]);
        //podemos checar o tamanho do vetor assim
        System.out.println(v3.length);
        //Também podemos fazer continhas
        v3[0] = 2;
        v3[1] = 3;
        int r = v3 [0] + v3[1];
        //e o indice pode ser qualquer expressão inteira
        System.out.println(v3[3 - 2]);
        System.out.println(v3[3 - v3.length +2]);
        
     
    }
    
}
