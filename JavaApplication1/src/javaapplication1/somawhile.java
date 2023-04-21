package javaapplication1;

import java.io.*;

public class somawhile {
    public static void main (String args[]) {
        int n1=0, n2=0, r=0;
        String s;
        DataInputStream dado;
        
        try {
            System.out.println("Entre com o valor1");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            n1 = Integer.parseInt(s);
            
            System.out.println("Entre com o valor2");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            n2 = Integer.parseInt(s);
            r = n1+ n2;
            
            int i=1;
            while (i<=r)
            {
                System.out.println("Soma    " + r);
                i++;
            }
            
        } catch (IOException e) 
        {
            System.out.println("Houve um erro na entrada dos dados");
        }
    }
}
