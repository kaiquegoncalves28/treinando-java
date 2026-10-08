public class Funcionario {
    double salario;

    public Funcionario(double salario){
        this.salario = salario;
    }

    public String setSalario(){
        return "Salario: " + salario;
    }

    public void aumentar(double aumento){
        salario += aumento;
    }
}