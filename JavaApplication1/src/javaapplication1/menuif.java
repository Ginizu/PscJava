package javaapplication1;

import java.io.*;

public class menuif {
    public static void main (String args[]){
        String s="";
        int sexo=0;
        DataInputStream dado;
        
        try
        {
            System.out.println("1-Homem");
            System.out.println("2-Mulher");
            System.out.println("3-Indefinido");
            
            System.out.println("Entre com seu sexo");
            dado= new DataInputStream(System.in);
            s=dado.readLine();
            sexo=Integer.parseInt(s);
            
          if (sexo>0 && sexo<2)
          {
              System.out.println("vc é homem");
          }
          if (sexo>1 && sexo<3)
          {
              System.out.println("vc é mulher");
          }
          if (sexo>2 && sexo<4)
          {
              System.out.println("vc é Gustavo");
          }
          if (sexo>3){
              System.out.println("vc digitou a opção errada");
          }
        }
        catch (IOException e)
        {
            System.out.println("Houve um erro na entrada de dados");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Houve erro na conversão, digite apenas caracteres numéricos");
        }
    }
}
