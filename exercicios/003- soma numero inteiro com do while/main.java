public class main {
	public static void main(String[] args) {
		//soma dos numeros com do while
		int numero = 1;
		int soma = 0;

		do {
			numero++;
			soma+=numero;
		} while (numero <= 10);

		System.out.println(soma);
	}
}