
package javaapplication1;

import java.io.*;
import javax.swing.JOptionPane;

public class Vetor1 {
    public static void main(String[] args){
        int [] v = new int [10];
        //assim fica repetitivo
        v[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        v[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        v[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        for (int i = 0; i < v.length; i++){
            v[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        }
        int i = 0;
        while (i < v.length) {
            JOptionPane.showMessageDialog(null, v[i]);
            i++;
        }
        //para exibir todos de uma vez poderiamos concatenar os valores
        //em uma string
        String s = "";
        for (i = 0; i<v.length; i++){
        s = s + v[i]+ "";
    }
        //exibimos depois do for
        JOptionPane.showMessageDialog(null,s);
        
        }
    }
    

