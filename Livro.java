package exe09;

public class Livro extends Produto {
    private String ISBN;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public double getValorLiquido() {
        return getValor() * 0.75; // Aplica 25% de desconto
    }
}
