package Empresa.Dados;
public class Funcionario {

    public int idade;
    String nome;
    String materia;
    double salario;

    public Funcionario(int idadeInit){
        idade = idadeInit;
        System.out.println("idade = " + idade);
    }

    public Funcionario(int idade, String nome, String materia, double salario) {
        this.idade = idade;
        this.nome = nome;
        this.materia = materia;
        this.salario = salario;

        System.out.println("idade = " + salario);
        System.out.println("nome = " + nome);
        System.out.println("matéria = " + materia);
        System.out.println("salario = " + salario);
    }
}