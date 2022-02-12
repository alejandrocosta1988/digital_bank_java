package digital_bank;

/** 
 * Implementa uma conta do tipo poupança.
 * @author Alejandro Costa
 * @version 0.1 2022-02-22
 * */
public class ContaPoupanca extends Conta {

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
