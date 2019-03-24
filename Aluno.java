

public class Aluno extends Pessoa {
	private int anoEntrada;
	private int periodoEntrada;
	public Aluno(String nome, String cpf, int anoEntrada, int periodoEntrada, Endereco endereco) {
		super(nome, cpf, endereco);
		this.anoEntrada = anoEntrada;
		this.periodoEntrada = periodoEntrada;
	}
	@Override
	public String toString() {
		return super.toString() + "\nAno de Entrada: " + anoEntrada + "\nPeriodo de Entrada: " + periodoEntrada;
	}
}
