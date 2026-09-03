package Empresa.Dados;

public class Funcionario {
    int idade;
    String nome;

    private Funcionario(int idadeInit, String nomeInit){
        idade = idadeInit;
        nome = nomeInit;
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
    }
    protected Funcionario(){
        Funcionario func = new Funcionario(19, "Kaíque");
    }
}
