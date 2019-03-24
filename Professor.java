

import java.util.Date;

public class Professor extends Pessoa {
	private Date admissao;
	public Professor(String nome, String cpf, Date admissao, Endereco endereco) {
		super(nome, cpf, endereco);
		this.admissao = admissao;
	}
	@Override
	public String toString() {
		return super.toString() + "\nData de Admissao: " + this.admissao.toString();
	}
}
