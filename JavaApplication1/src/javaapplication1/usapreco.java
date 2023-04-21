package javaapplication1;

public class usapreco
{ 
 public static void main (String args[])
  { 
  preco A,B,C;
  A = new preco();
  B = new preco();
  C = new preco();
    
  A.codigo = 10;
  A.nome = "Sabonete";
  A.quantidade = 5;
  A.preco = 0.54;
  System.out.print(A.codigo + " " + A.nome + " "); 
  System.out.println(A.quantidade + " " + A.preco);
  A.mostraPreco();
  A.atualizaPreco(12);
  A.mostraPreco();
  
  B.preco = 5.45;
  B.mostraPreco();  
  B.atualizaPreco(25);
  B.mostraPreco();  
  }
}