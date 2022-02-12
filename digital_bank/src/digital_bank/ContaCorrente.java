package digital_bank;

/** 
 * Implementa uma conta do tipo corrente.
 * @author Alejandro Costa
 * @version 0.1 2022-02-22
 * */
public class ContaCorrente extends Conta {
	
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
