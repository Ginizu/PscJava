
package javaapplication1;

public class LimpaTela {
    public static void main(String[] args) {
        String frase1="Primo doces e lanches";
        String frase2="Largados e pelados";
        String frase3="Quilos mortais";
        limpaTela();
        tela(frase1);//INVOCA METODO
        tela(" ");
        tela(frase2);//INVOCA METODO
        tela(" ");
        tela(frase3);//INVOCA METODO
    }
    public static void tela(String S) {
        System.out.println(S);
    }
    public static void limpaTela() {
        for(int i=1;i<=25;i++)
            System.out.println();    
    }
}
