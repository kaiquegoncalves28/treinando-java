public class main {
    public static void main(String[] args) {
        /* programa java que soma os numeros impares e pares de 1 a 10 */
        int somaImpar = 0;
        int somaPar = 0;
        int numero = 1;

        while (numero <= 10) {

            if (numero % 2 != 0) {

                somaImpar+=numero;

            } else { 

                somaPar+=numero;

            }
            numero++;
        }
        System.out.println("A soma dos numeros pares de 1 a 10 é " + somaImpar);
        System.out.println("A soma dos numeros pares de 1 a 10 é " + somaPar);

    }
}
