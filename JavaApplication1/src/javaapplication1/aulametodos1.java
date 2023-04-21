package javaapplication1;

public class aulametodos1 {

    public static void main (String args[])
    {
        String frase1="Sou muito";
        String frase2="feliz porque sei";
        String frase3="que Deus me ama!";
        limpaTela();
        tela(frase1);
        tela(" ");
        tela(frase2);
        tela(" ");
        tela(frase3);
    }
    
    public static void tela(String S)
    {
        System.out.println(S);
    }
    
    public static void limpaTela()
    {
        for(int i=1;i<=25;i++)
            System.out.println();
    }   
}
