import pasta.TestMetodos;

public class Main {
    public static void main(String[] args) {
        TestMetodos info = new TestMetodos(19, "Lucas");

        // Chamada correta: através do objeto 'info'
        System.out.println(info.ObterInfo());
    }
}