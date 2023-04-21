package javaapplication1;

public class veiculo
  {  	
    String nome;
   	private float velocidade;
	
	public void acelera() 
	{
	if (velocidade<=10)
		velocidade++;
	}

	void frea()
	{
	if (velocidade>0)
		velocidade--;
	}
	
	void mostraVelocidade()
	{
	System.out.println(velocidade);
	}
  }