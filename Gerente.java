package exe03;

public class Gerente extends Funcionario {
	private String numeroFuncionario;

	public String getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(String numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}
	
	public Gerente() {}
	public Gerente(String nome, String cargo,int idade, String cidade) {
		super(nome, cargo, idade, cidade);
	}
}
