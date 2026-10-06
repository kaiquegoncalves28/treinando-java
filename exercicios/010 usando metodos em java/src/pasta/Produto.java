package pasta;
public class Produto {
    private String nome;
    private int quantidadeEmEstoque;
    private double preco;

    public Produto(String nome, int quantidadeEmEstoque, double preco) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.preco = preco;
    }

    public String obterInfo() {
        return "Nome: " + nome + ", Estoque: " + quantidadeEmEstoque + ", Preço: " + preco;
    }
}