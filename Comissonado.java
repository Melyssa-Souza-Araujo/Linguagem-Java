package exe05;

public class Comissonado extends Empregado {
	private double totalVenda;
	public double getTotalVenda() {
		return totalVenda;
	}
	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}
	public double getTaxaComissao() {
		return taxaComissao;
	}
	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}
	private double taxaComissao;
}
