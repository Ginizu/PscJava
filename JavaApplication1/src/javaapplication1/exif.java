package javaapplication1;

import java.io.*;

public class exif {
    public static void main (String args[])
    {
        String s=" ";
        float nota1=0, nota2=0, nota3=0, nota4=0, media=0;
        DataInputStream dado;
       
     try
      {
         System.out.println("Entre com a nota 1");
         dado= new DataInputStream(System.in);
         s=dado.readLine();
         nota1=Float.parseFloat(s);
         
         System.out.println("Entre com a nota 2");
         dado= new DataInputStream(System.in);
         s=dado.readLine();
         nota1=Float.parseFloat(s);
         
         System.out.println("Entre com a nota 3");
         dado= new DataInputStream(System.in);
         s=dado.readLine();
         nota1=Float.parseFloat(s);
         
         System.out.println("Entre com a nota 4");
         dado= new DataInputStream(System.in);
         s=dado.readLine();
         nota1=Float.parseFloat(s);
         
         media=(nota1+nota2+nota3+nota4)/4;
         System.out.println("Media : "+ media);
         if (media>=7){
             System.out.println("Vc passou");
         }
         else{
             System.out.println("vc esta em Rec");
         }
     }
     catch (IOException e)
     {
         System.out.println("Houve erro na entrada de dados");
     }
    
     catch (NumberFormatException e)
     {
         System.out.println("Houve erro na conversao, digite apenas caracteres numericos");
     }
    }
}