package pasta;

public class TestMetodos {
    private int idade;
    private String nome;

    public TestMetodos(int idadeInit, String nomeInit){
        idade = idadeInit;
        nome = nomeInit;
    }
    public String ObterInfo() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
