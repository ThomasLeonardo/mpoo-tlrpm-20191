
public class Application {
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		HelloWorld helloWorld2 = new HelloWorld();
		helloWorld.setNome("Ricardo");
		helloWorld2.setNome("Josefa");
		helloWorld.imprimir();
		helloWorld2.imprimir();
		HelloWorld helloWorld3 = new HelloWorld();
		helloWorld3.imprimir();

	}
}
