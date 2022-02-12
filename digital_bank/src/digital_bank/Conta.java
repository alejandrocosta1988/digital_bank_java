package digital_bank;

/** 
 * Implementa uma conta no banco. A classe conta é abstrata porque não é de interesse que ela seja instanciada. Apenas as classes filhas ContaCorrente e ContaPoupanca deverão ser instanciadas.
 * Os atributos agencia, numeroDaConta e saldo possuem visibilidade protected. Dessa forma eles podem ser acessados a partir das classes filhas.
 * @author Alejandro Costa
 * @version 0.1 2022-02-22
 */
public abstract class Conta {
	
	private static final  int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	/** Armazena o número da agência da Conta Corrente.*/
	protected int agencia;
	/** Armazena o número da Conta Corrente.*/
	protected int numeroDaConta;
	/** Armazena o saldo da Conta Corrente.*/
	protected double saldo;
	
	
	public Conta()
	{

		this.agencia = AGENCIA_PADRAO;
		this.numeroDaConta = SEQUENCIAL++;
		
	}
	
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
	
	public void sacar(double valor) { }
	public void depositar(double valor) { }
	public void transferir(double valor, Conta contaDeDestino) { }
	
}
