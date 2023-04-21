package javaapplication1;

import java.io.*;

public class aula8concatena {
    public static void main (String args[])
    {
        String s="";
        String nome1="", nome2="", concatena="";
        DataInputStream dado;
        
        try
        {
            System.out.println("Entre com o primeiro nome");
            dado= new DataInputStream(System.in);
            s=dado.readLine();
            nome1=(s);
            
            System.out.println("Entre com o segundo nome");
            dado = new DataInputStream(System.in);
            s=dado.readLine();
            nome2=(s);
            
            System.out.println();
            concatena=(nome1    +" "+   nome2);
            
            System.out.println("Concatenacao : "+ concatena);
        }
        
        catch (IOException e)
        {
            System.out.println("Houve erro na entrada de dados");
        }
    }
}
