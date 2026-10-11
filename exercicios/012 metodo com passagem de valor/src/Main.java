public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Kaíque",7000.0);
        System.out.println(funcionario.obterInfo());

        funcionario.alterarQualquerSalario(funcionario, 9000);
        System.out.println(funcionario.obterInfo());
    }
}