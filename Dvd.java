package exe09;

public class Dvd extends Produto {
    private String SN;

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    @Override
    public double getValorLiquido() {
        return getValor() * 0.9; // Aplica 10% de desconto
    }
}
