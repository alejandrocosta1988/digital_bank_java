package digital_bank;

public class BancoTest {

	/** Testes unitários para a classe Banco 
	 * @author Alejandro Costa
	 * @since 0.1
	 * @version 0.1 2022-02-14
	 */
	public static void main(String[] args) {
		
        System.out.println("Testando o construtor...");
        Banco umBanco = new Banco("Banco Teste 1");
        System.out.println("OK");
        
        System.out.println("Testando o método getNome()...");
        System.out.println(umBanco.getNome());
        System.out.println("OK");
        
        System.out.println("Testando o método setNome()...");
        umBanco.setNome("Banco Teste 01");
        System.out.println(umBanco.getNome());
        System.out.println("OK");
        
        System.out.println("Testando o método inserirContaNoBanco()...");
        Cliente umCliente = new Cliente();
        umCliente.setNome("Alejandro Costa");
        Conta umaContaCorrente = new ContaCorrente(umCliente, umBanco);
        System.out.println("OK");
        
        System.out.println("Testando o método exibirListaDeContas()...");
        umBanco.exibirListaDeContas();

	}

}
