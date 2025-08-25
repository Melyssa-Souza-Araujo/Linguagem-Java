package exe09;

public abstract class Produto {
    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Tornar o método abstrato obriga as subclasses a sobrescrevê-lo
    public abstract double getValorLiquido();
}
