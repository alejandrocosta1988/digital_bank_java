package digital_bank;

/** Define testes unitários para classe ContaCorrente
 * 
 */
public class ContaCorrenteTest {

	public static void main(String[] args) {
		
		Banco umBanco = new Banco("Banco Teste");
		Cliente clienteUm = new Cliente();
        clienteUm.setNome("Alejandro Costa");
        
        Cliente clienteDois = new Cliente();
        clienteDois.setNome("Jana R Santana");
        
		System.out.println("Testando o construtor SEM valor de depósito...");
		Conta contaUm = new ContaCorrente(clienteUm, umBanco);
        System.out.println("OK");
        
        System.out.println("Testando o construtor COM valor de depósito...");
		Conta contaDois = new ContaCorrente(clienteDois, 1500, umBanco);
        System.out.println("OK");

        System.out.println("Testando métodos get...");
		System.out.println("Agência: " + contaDois.getAgencia());
		System.out.println("Conta: " + contaDois.getNumeroDaConta());
		System.out.println("Saldo: " + contaDois.getSaldo());
        System.out.println("OK");
        
        System.out.println("Testando método sacar()...");
		contaDois.sacar(400);
		System.out.println("Resultado deve ser 1100. \nResultado: " + contaDois.getSaldo());
        System.out.println("OK");
        
        System.out.println("Testando método depositar()...");
		contaUm.depositar(2300);
		System.out.println("Resultado deve ser 2300. \nResultado: " + contaUm.getSaldo());
        System.out.println("OK");
        
        System.out.println("Testando método transferir()...");
		contaUm.transferir(500, contaDois);
		System.out.println("Saldo na conta de origem deve ser 1800. \nResultado: " + contaUm.getSaldo());
		System.out.println("Saldo na conta de destino deve ser 1600. \nResultado: " + contaDois.getSaldo());
        System.out.println("OK");
        
        System.out.println("Testando método imprimirExtrato()...");
		contaUm.imprimirExtrato();
		System.out.println("OK");
		
		System.out.println("Testando método toString()...");
		System.out.println(contaDois.toString());
		System.out.println("OK");
        
	}

}
