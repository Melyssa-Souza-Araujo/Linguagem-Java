package exe03;

public class Segurança extends Funcionario{
	private String posto;

	public String getPosto() {
		return posto;
	}

	public void setPosto(String posto) {
		this.posto = posto;
	}
	
	public Segurança() {}
	public Segurança(String nome, String cargo, int idade, String cidade) {
		super(nome, cargo, idade, cidade);
	}
}
