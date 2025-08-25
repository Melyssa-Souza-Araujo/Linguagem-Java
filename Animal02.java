package exe07;

public class Animal02 {
    private String cor;
    private float altura;
    private float tamanho;
    private float peso;
    int numero = 0;

    public Animal02() {
        this.setNumero(this.numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = ++numero;
    }
}
