package Empresa.Dados;
public class Funcionario {
    String nome;
    double salario;
    public Funcionario(String nomeInit, double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
        System.out.println("nome: "+nome);
        System.out.println("salario: "+salario);
    }
}