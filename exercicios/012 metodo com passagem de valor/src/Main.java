public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(6000);
        System.out.println(funcionario.setSalario());

        funcionario.aumentar(2000);
        System.out.println(funcionario.setSalario());
    }
}