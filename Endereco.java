

public class Endereco {
	private String rua;
	private int numero;
	private String complemento;
	private String cidade;
	public Endereco(String rua, int numero, String complemento, String cidade) {
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		
	}
	@Override
	public String toString() {
		return "Rua: " + rua + "\n\tNumero: " + numero + "\n\tComplemento: " + complemento + "\n\tCidade: " + cidade;
	}
}
