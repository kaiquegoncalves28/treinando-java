import pasta.*;

public class Main {
    public static void main (String[] args){
        Produto prod = new Produto("Açúcar", 15, 12.50);
        System.out.println(prod.obterInfo());
    }
}