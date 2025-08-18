package exe03;

public class CaixaOperador extends Funcionario{
	private int numeroCaixa;

	public int getNumeroCaixa() {
		return numeroCaixa;
	}

	public void setNumeroCaixa(int numeroCaixa) {
		this.numeroCaixa = numeroCaixa;
	}
	
	public CaixaOperador() {}
	public CaixaOperador(String nome, String cargo, int idade, String cidade) {
		super(nome, cargo, idade, cidade);
	}
}
