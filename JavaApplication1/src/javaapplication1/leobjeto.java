package javaapplication1;

import java.io.*;

public class leobjeto
{
    public static void main(String args[])
    {
     try
       {
       FileInputStream f = new FileInputStream("computador.arq");
       ObjectInputStream s = new ObjectInputStream(f);
       computador x = (computador)s.readObject();
       System.out.println(x.nome);
       System.out.println(x.velocidade);
       System.out.println(x.memoria);
       System.out.println(x.revendedor);
       }
      catch (Exception e)
        { System.out.println(e); }
    }
}