package digital_bank;

/** 
 * Implementa uma conta no banco.
 * @author Alejandro Costa
 * @version 0.1 2022-02-22
 * */
public class Conta {

	/** Armazena o número da agência da Conta Corrente.*/
	private int agencia;
	/** Armazena o número da Conta Corrente.*/
	private int numeroDaConta;
	/** Armazena o saldo da Conta Corrente.*/
	private double saldo;
	
	/** 
	 * Retorna o número da agência.
	 * @return Um int contendo o número da agência da conta.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	public int getAgencia()
	{
		return this.agencia;
	}
	
	/** 
	 * Retorna o número da conta.
	 * @return Um int contendo o número da conta.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	public int getNumeroDaConta()
	{
		return this.numeroDaConta;
	}
	
	/** 
	 * Retorna o saldo disponível na conta.
	 * @return Um double contendo o saldo disponível em conta.
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
