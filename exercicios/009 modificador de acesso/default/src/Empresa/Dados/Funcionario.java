package Empresa.Dados;

public class Funcionario {
    int idade;
    String nome;
    Funcionario (int idadeInit, String nomeInit) {
        nome = nomeInit;
        idade = idadeInit;
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
    }
    Funcionario (){
        Funcionario funcionario = new Funcionario(19, "kaique");
    }
}
