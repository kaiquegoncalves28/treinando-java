public class main {
    public static void main(String[] args) {
        /* programa java que verifica códigos validos de uma carteirinha de hospital */
        
        int numeroCarteirinha = 22;

            while (numeroCarteirinha <= 60)
             switch (numeroCarteirinha) {
            case 11:
            case 22:
            case 33:
            case 44:
            case 55:
                System.out.println("Carteirinha aceita pelo Hospital, o número da Carteirinha é = " + numeroCarteirinha);
                break;
            default:
                System.out.println("Carteirinha não aceita pelo Hospital, número da Carteirinha é = " + numeroCarteirinha);
                break;
                numeroCarteirinha++;
        }
    }
}