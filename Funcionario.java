package exe04;

public class Funcionario {
	private String nome;
	private String cargo;
	private int idade;
	private String cidade;
	
	public Funcionario() {
		System.out.println("Construtor padrão");
	}
	
	public Funcionario(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
		System.out.println("Construtor quase completo");
	}
	
	public Funcionario(String nome, String cargo, int idadde, String cidade) {
		this.setNome(nome);
		this.setCargo(cargo);
		this.setIdade(idadde);
		this.setCidade(cidade);
		System.out.println("Construtor completo");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public static void main(String args[]) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Ana");
		funcionario1.setIdade(26);
		funcionario1.setCidade("Santos");
		funcionario1.setCargo("caixa");
		System.out.println("Funcionário 1: " + funcionario1.getNome());
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("João");
		funcionario2.setIdade(30);
		funcionario2.setCidade("São Vicente");
		funcionario2.setCargo("segurança");
		System.out.println("Funcionário 2: " + funcionario2.getNome());
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome("Alex");
		funcionario3.setIdade(45);
		funcionario3.setCidade("Santos");
		funcionario3.setCargo("gerente");
		System.out.println("Funcionário 3: " + funcionario3.getNome());

	}
	
}
