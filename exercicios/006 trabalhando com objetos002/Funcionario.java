public class Funcionario {
	String nome;
	String cargo;
	int idade;
	public static void main(String[] args){

		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "Kaíque";
		funcionario1.cargo = "Desenvolvedor junior";
		funcionario1.idade = 19;

		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome = "Marcelo Oliveira";
		funcionario2.cargo = "Gestor de vendas";
		funcionario2.idade = 35;

		Funcionario funcionario3 = new Funcionario();
		funcionario3.nome = "Mauro";
		funcionario3.cargo = "Ajudante geral";
		funcionario3.idade = 28;
		

		System.out.println("FUNCIONARIOS DA EMPRESA");

		System.out.println("nome: " + funcionario1.nome);
		System.out.println("cargo: " + funcionario1.cargo);
		System.out.println("idade: " + funcionario1.idade);

		System.out.println("---------------------------");

		System.out.println("nome: " + funcionario2.nome);
		System.out.println("cargo: " + funcionario2.cargo);
		System.out.println("idade: " + funcionario2.idade);

		System.out.println("---------------------------");

		System.out.println("nome: " + funcionario3.nome);
		System.out.println("cargo: " + funcionario3.cargo);
		System.out.println("idade: " + funcionario3.idade);


	}
}