package digital_bank;

/** 
 * Implementa uma conta do tipo corrente.
 * @author Alejandro Costa
 * @version 0.1 2022-02-23
 * */
public class ContaCorrente extends Conta {
	
	ContaCorrente(Cliente cliente, Banco banco)
	{
		super(cliente, banco);
	}
	
	ContaCorrente(Cliente cliente, double valorDeDepositoInicial, Banco banco)
	{
		super(cliente, valorDeDepositoInicial, banco);
	}
	
	/** 
	 * Imprime o extrato da conta corrente.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	@Override
	public void imprimirExtrato()
	{
		System.out.println("*** Extrato Conta Corrente ***");
		super.imprimirInformacoesEmComum();
	}
}
