public class Funcionario {
    double salario;
    private String nome;

    public Funcionario(String nome, double salario){
        this.salario = salario;
        this.nome = nome;
    }

    public String obterInfo() {
        return "Nome: " + nome + ", Salario: " + salario;
    }

    public void aumentarSalario (double aumento) {
        salario += aumento;
    }
    public void alterarQualquerSalario(Funcionario func, double salarioNovo){
        func.salario = salarioNovo;
    }
}