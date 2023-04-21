package javaapplication1;

public class preco 
{  
    int codigo;
  String nome;
  int quantidade;
  double preco;
  
  public void mostraPreco()
  {
   System.out.println(preco);
  }	

  public void atualizaPreco(double porc)
  {
   preco = preco + preco * porc / 100;
  }	
}
