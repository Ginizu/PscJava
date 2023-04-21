package javaapplication1;

import java.io.*;
import javax.swing.JOptionPane;

public class SomarVetor {
    public static void main (String [] args) {
        double [] v = {2.5, 6.4, 7.5, 1 ,1, 2, 7, 5};
        double soma = 0;
        
        soma = soma + v[0];
        soma = soma + v[1];
        soma = soma + v[2];
        soma = 0;
        
        for (int i = 0; i <v.length; i++) {
            soma = soma + v [1];
           
        }
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
    
}
