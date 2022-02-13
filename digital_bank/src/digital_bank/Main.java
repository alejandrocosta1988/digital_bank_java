package digital_bank;

public class Main {

	public static void main(String[] args) {
		
		Banco ifbank = new Banco("International Fake Bank - IFBank");
		
		Cliente umCliente = new Cliente();
		umCliente.setNome("Alejandro Costa");
	
		Conta cc = new ContaCorrente(umCliente, ifbank);
	    Conta poupanca = new ContaPoupanca(umCliente, ifbank);
	    Conta ccComDeposito = new ContaCorrente(umCliente, 3500, ifbank);
        
	    cc.imprimirExtrato();
	    poupanca.imprimirExtrato();
	    
	    System.out.println();
	    ccComDeposito.imprimirExtrato();
	    
	    System.out.println("Teste de transferência...");
	    ccComDeposito.transferir(1200, poupanca);
	    poupanca.imprimirExtrato();
	    ccComDeposito.imprimirExtrato();
	    
	    System.out.println("Teste de exibição da lista de contas criadas no banco...");
	    ifbank.exibirListaDeContas();
	    
	}

}
