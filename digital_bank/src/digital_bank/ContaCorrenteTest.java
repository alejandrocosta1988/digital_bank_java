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
		Conta contaDois = new ContaCorrente(clienteDois, 3345.76, umBanco);
        System.out.println("OK");

	}

}
