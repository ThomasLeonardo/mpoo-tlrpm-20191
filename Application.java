

import java.util.Date;

public class Application {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua qualquer", 12345, "", "Recife");
		Aluno aluno = new Aluno("Jose", "12345678", 2019, 1, endereco);
		Professor professor = new Professor("Ricardo", "12345679", new Date(),  new Endereco("Rua qualquer", 12346, "", "Recife"));
		System.out.println(aluno.toString());
		System.out.println();
		System.out.println(professor.toString());
	}

}
