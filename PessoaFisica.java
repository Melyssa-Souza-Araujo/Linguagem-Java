package exe06;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public void calcularImpostoRenda() {
        System.out.println("Calculando imposto de renda para Pessoa Física: " + nome);
        // lógica específica para PF
    }
}
