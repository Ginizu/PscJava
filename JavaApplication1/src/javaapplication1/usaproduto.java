package javaapplication1;

public class usaproduto
{ 
 public static void main (String args[])
  { 
     produto A;
     produto B;
     produto C;
  A = new produto();
  B = new produto();
  C = new produto();
  
  System.out.print(A.codigo + " " + A.nome + " ");
  System.out.println(A.quantidade + " " + A.preco);
    
  A.codigo = 10;
  A.nome = "Sabonete";
  A.quantidade = 5;
  A.preco = 0.54;

  System.out.print(A.codigo + " " + A.nome + " "); 
  System.out.println(A.quantidade + " " + A.preco);
    
  B.codigo = 11;
  B.nome = "Detergente";
  B.quantidade = 35;
  B.preco = 1.25;
  
  System.out.print(B.codigo + " " + B.nome + " ");
  System.out.println(B.quantidade + " " + B.preco);
  
  C.codigo = 12;
  C.nome = "Shampoo";
  C.quantidade = 3;
  C.preco = 3.65;
  
  System.out.print(C.codigo + " " + C.nome + " ");
  System.out.println(C.quantidade + " " + C.preco);

  }
}
