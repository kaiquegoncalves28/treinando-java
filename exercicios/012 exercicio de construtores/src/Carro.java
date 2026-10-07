public class Carro {
    String marcaDoCarro;
    String modeloDoCarro;
    int anoDoCarro;

    public Carro(){
        marcaDoCarro = "Desconhecido";
        modeloDoCarro = "Desconhecido";
        anoDoCarro = 0;
    }

    Carro(String marcaDoCarro, String modeloDoCarro, int anoDoCarro){
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
    }

    Carro(String marcaDoCarro, String modeloDoCarro){
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
    }

    public void mostrarDetalhes() {
        System.out.println("Marca: " + marcaDoCarro);
        System.out.println("Modelo: " + modeloDoCarro);
        System.out.println("Ano: " + anoDoCarro);
        System.out.println();
    }
}
