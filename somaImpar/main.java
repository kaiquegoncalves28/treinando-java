public class main {
    public static void main(String[] args) {
        /* programa java que conta o numero de pares */
        int soma = 0;
        
        for (int numero = 1; numero<=10; numero++) {
            if (numero % 2 != 0) {
                soma+=numero;
            }
            
            System.out.println(soma);
        }

    }
}