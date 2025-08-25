package exe05;

public class Assalariado extends Empregado {
    private double salario;

    public Assalariado(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    @Override
    public double calcularVencimento() {
        return salario;
    }
}
