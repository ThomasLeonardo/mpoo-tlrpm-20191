import java.time.LocalTime;

public class HelloWorld {
	private String nome;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void imprimir() {
		LocalTime localTime = java.time.LocalTime.now();
		System.out.println(localTime.withNano(0) + " - Olá " + this.getNome() + ". Você acabou de fazer seu primeiro Hello World em Java. Parabéns.");
	}
}
