public class Circulo {
    private String cor;
    private float raio;

    public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getRaio() {
		return raio;
	}
	public void setRaio(float raio) {
		this.raio = raio;
	}

    public static void main(String[] args) {
		Circulo circulo1 = new Circulo();
		circulo1.setCor("vermelha");
		circulo1.setRaio(2);
	}
}
