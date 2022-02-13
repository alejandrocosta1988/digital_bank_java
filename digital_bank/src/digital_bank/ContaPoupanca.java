package digital_bank;

/** 
 * Implementa uma conta do tipo poupança.
 * @author Alejandro Costa
 * @version 0.1 2022-02-23
 * */
public class ContaPoupanca extends Conta {

	ContaPoupanca(Cliente cliente, Banco banco)
	{
		super(cliente, banco);
	}
	
	ContaPoupanca(Cliente cliente, double valorDeDepositoInicial, Banco banco)
	{
		super(cliente, valorDeDepositoInicial, banco);
	}
	
	/** 
	 * Imprime o extrato da conta poupança.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	@Override
	public void imprimirExtrato()
	{
		System.out.println("*** Extrato Conta Poupança ***");
		super.imprimirInformacoesEmComum();
	}
	
}
