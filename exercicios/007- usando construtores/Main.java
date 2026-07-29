public class Main {
	float saldo;
	String nome;
	String cargo;
	Main(float	saldoInit, String nomeInit, String cargoInit) {
		saldo = saldoInit;
		nome = nomeInit;
		cargo = cargoInit;
	}
	
	/*Main(float	saldo, String nome, String cargo) {
		this.saldo = saldo;
		this.nome = nome;
		this.cargo = cargo; 
	}*/
	
	public static void main(String[] args) {

		Main pessoa2 = new Main(2008,"lila","dev junior");

		Main pessoa = new Main(3000,"kaique","dev");

		System.out.println(pessoa.nome);
		System.out.println(pessoa.cargo);
		System.out.println(pessoa.saldo);
		System.out.println("--------------------");
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.cargo);
		System.out.println(pessoa2.saldo);
	}
}