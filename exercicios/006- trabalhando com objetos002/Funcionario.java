public class Funcionario {

	String nome;
	String cargo;
	int idade;

	public static void main(String[] args){

		Funcionario funcionario = new Funcionario();

		funcionario.nome = "Kaíque";
		funcionario.cargo = "Desenvolvedor";
		funcionario.idade = 19;


		System.out.println("nome: " + funcionario.nome);

		System.out.println("cargo: " + funcionario.cargo);

		System.out.println("idade: " + funcionario.idade);


	}

}