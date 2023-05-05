//Elaborar um programa que o resultado de uma soma de 2 milhões se repete pelo 
//total da mesma, inseridas por meio entrada de dados pelo teclado

package javaapplication1;
import java.io.*;

public class TryCatch {
    public static void main(String[] args) {
        float n1 =0, n2=0, r=0;
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
            r= n1 + n2;
            for (int i=1;i<+r;i++){
                System.out.println("soma: " + r);
                
            }
            
        }
         catch (IOException e){
                 System.out.println("Houve um erro na entrada de dados");
                 }
        
    }
}
