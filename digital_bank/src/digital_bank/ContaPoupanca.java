package digital_bank;

/** 
 * Implementa uma conta do tipo poupança.
 * @author Alejandro Costa
 * @version 0.1 2022-02-22
 * */
public class ContaPoupanca {

	/** Armazena o número da agência da Conta Poupança.*/
	private int agencia;
	/** Armazena o número da Conta Poupança.*/
	private int numeroDaConta;
	/** Armazena o saldo da Conta Poupança.*/
	private double saldo;
	
	/** 
	 * Retorna o número da agência da conta poupança.
	 * @return Um int contendo o número da agência da conta poupança.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	public int getAgencia()
	{
		return this.agencia;
	}
	
	/** 
	 * Retorna o número da conta poupança.
	 * @return Um int contendo o número da conta poupança.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	public int getNumeroDaConta()
	{
		return this.numeroDaConta;
	}
	
	/** 
	 * Retorna o saldo disponível na conta poupança.
	 * @return Um double contendo o saldo disponível em conta poupança.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	public double getSaldo()
	{
		return this.saldo;
	}
	
	public void sacar() { }
	public void depositar() { }
	public void transferir() { }
}
