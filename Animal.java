package exe04;

public abstract class Animal {
	private String nome;
	private String raca;
	private String cor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public static void main(String args[]) {
		Canino brownie = new Canino();
		brownie.setNome("brownie");
		System.out.println("Canino: " + brownie.getNome());
		Felino pandora = new Felino();
		pandora.setNome("pandora");
		System.out.println("Felino: " + pandora.getNome());
	}

}
