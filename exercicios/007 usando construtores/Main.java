public class Main {
	float saldo;
	String nome;
	String cargo;
	Main(float	saldoInit, String nomeInit, String cargoInit) {
		saldo = saldoInit;
		nome = nomeInit;
		cargo = cargoInit;
	}
	//construtor vazio para usar na pessoa 3
	Main() {
	}
	
	public static void main(String[] args) {

		Main pessoa = new Main(3000,"kaique","dev");

		Main pessoa2 = new Main(2008,"lila","dev junior");

		System.out.println(pessoa.nome);
		System.out.println(pessoa.cargo);
		System.out.println(pessoa.saldo);

		System.out.println("--------------------");

		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.cargo);
		System.out.println(pessoa2.saldo);

		System.out.println("--------------------");

		Main pessoa3 = new Main();
		pessoa3.saldo = 3899;
		pessoa3.nome = "Amanda";
		pessoa3.cargo = "vendedora";

		System.out.println(pessoa3.nome);
		System.out.println(pessoa3.cargo);
		System.out.println(pessoa3.saldo);


	}  
}