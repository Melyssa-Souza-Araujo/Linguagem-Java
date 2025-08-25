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

    public static void main(String[] args) {
        Animal02 gato = new Animal02();
        System.out.println("Gato -> " + gato.getNumero());

        Animal02 cachorro = new Animal02();
        System.out.println("Cachorro -> " + cachorro.getNumero());

        Animal02 peixe = new Animal02();
        System.out.println("Peixe -> " + peixe.getNumero());
    }
}
