package exe06;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    @Override
    public void calcularImpostoRenda() {
        System.out.println("Calculando imposto de renda para Pessoa Jurídica: " + nome);
        // lógica específica para PJ
    }
}
