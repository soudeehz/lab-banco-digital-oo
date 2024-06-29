
public class Main {

	public static void main(String[] args) {
		Cliente Denzel = new Cliente();
		Denzel.setNome("Denzel");
		
		Conta cc = new ContaCorrente(Denzel);
		Conta poupanca = new ContaPoupanca(Denzel);

		cc.depositar(250);
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
