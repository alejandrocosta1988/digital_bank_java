package digital_bank;

public class Main {

	public static void main(String[] args) {
	
		Conta cc = new ContaCorrente();
	    Conta poupanca = new ContaPoupanca();
	    Conta ccComDeposito = new ContaCorrente(3500);
        
	    cc.imprimirExtrato();
	    poupanca.imprimirExtrato();
	    
	    System.out.println();
	    ccComDeposito.imprimirExtrato();
	    
	    System.out.println("Teste de transferência...");
	    ccComDeposito.transferir(1200, poupanca);
	    poupanca.imprimirExtrato();
	    ccComDeposito.imprimirExtrato();
	    
	}

}
