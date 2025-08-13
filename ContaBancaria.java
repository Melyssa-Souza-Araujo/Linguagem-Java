public class ContaBancaria {
    private String numero;
	private String agencia;
	private String banco;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}

    public void fazerPix() {}
	public void depositar() {}
	public void sacar() {}
	
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		conta1.setNumero("123456-1");
		conta1.setAgencia("123");
		conta1.setBanco("Itaú");
	}
}
