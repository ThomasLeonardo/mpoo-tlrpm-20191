

public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;
	public Pessoa(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + "\nCPF: " + cpf + "\nEndereco: " + endereco.toString();
	}
}
