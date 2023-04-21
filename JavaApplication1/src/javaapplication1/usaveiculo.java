package javaapplication1;

public class usaveiculo
{
    public static void main (String args[]) 
    {
    veiculo v1;
    v1 = new veiculo();	
    v1.nome = "Gol";
    System.out.println(v1.nome);
   
    v1.mostraVelocidade();
    for (int i=1;i<=5;i++)
       v1.acelera();
    v1.mostraVelocidade();
    
    }
  }