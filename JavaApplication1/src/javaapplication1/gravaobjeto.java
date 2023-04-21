package javaapplication1;

import java.io.*;

public class gravaobjeto
{
        public static void main(String args[])
        {
        computador c1 = new computador();
        c1.nome = "Pentium 4";
        c1.velocidade = "1,5 GigaHertz";
        c1.memoria = "256 MegaBytes";
        c1.revendedor = "Novo Pc";
        try
                {
                FileOutputStream f = new FileOutputStream("computador.arq");
                ObjectOutputStream s = new ObjectOutputStream(f);
                s.writeObject(c1);
                s.flush();
                System.out.println("Gravacao realizada com sucesso!");
                }
        catch (Exception e)
                { System.out.println(e); }
        }
}