package exe06;

public class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void calcularImpostoRenda() {
        System.out.println("Cálculo genérico de imposto de renda.");
    }
}
