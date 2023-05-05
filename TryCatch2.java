// Elabora um programa que o usurio determina a quantidade da repetição da palavra
//teste, por meio Entrada de dados do Teclado

package javaapplication1;
import java.io.*;

public class TryCatch2 {
    public static void main(String[] args) {
        int n=0;
        String s="";
        DataInputStream dado;
        try{
            System.out.println("Entre com o numero de repeticoes");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            n = Integer.parseInt(s);
            for (int i=1;i<n;i++) {
                System.out.println("teste");
            }
         
            }
         catch (IOException e) {
            System.out.println("Houve um erro na entrada de dado");
         }
   }
}
