package javaapplication1;

public class estudos{
  public static void main(String args[]){
    aluno aluno = new aluno();
    aluno.nome = "Mario";
    aluno.idade = 22;
    aluno.matricula = "333399999";
     
    System.out.println("Nome: " + aluno.nome + "\n" +
    "Idade: " + aluno.idade + "\n" +
    "Matrícula: " + aluno.matricula);
  }
 }