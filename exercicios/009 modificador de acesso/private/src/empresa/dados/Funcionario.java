package empresa.dados;

public class Funcionario {

    int idade;
    private String nome;


    private Funcionario(int idadeInit, String nomeInit) {
        idade = idadeInit;
        nome = nomeInit;
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
    }

    public Funcionario() {
        Funcionario funcionario = new Funcionario(23, "Lucas");
    }
}