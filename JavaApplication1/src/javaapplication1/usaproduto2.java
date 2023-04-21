package javaapplication1;

public class usaproduto2
{ 
 public static void main (String args[])
  { 
  produto2 A,B,C;
  A = new produto2();
  B = new produto2();
  C = new produto2();
    
  A.codigo = 1;
  System.out.println("Valor de codigo em A : " + A.codigo);
  System.out.println("Valor de codigo em B : " + B.codigo);
  B.codigo = 2;
  System.out.println("Valor de codigo em A : " + A.codigo);
  System.out.println("Valor de codigo em B : " + B.codigo);
  System.out.println("Valor de codigo em C : " + C.codigo);
  }
}