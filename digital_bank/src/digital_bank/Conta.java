package digital_bank;

/** 
 * Implementa uma conta no banco. A classe conta é abstrata porque não é de interesse que ela seja instanciada. Apenas as classes filhas ContaCorrente e ContaPoupanca deverão ser instanciadas.
 * Os atributos agencia, numeroDaConta e saldo possuem visibilidade protected. Dessa forma eles podem ser acessados a partir das classes filhas.
 * @author Alejandro Costa
 * @version 0.1 2022-02-22
 */
public abstract class Conta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	/** Armazena o número da agência da Conta.*/
	protected int agencia;
	/** Armazena o número da Conta.*/
	protected int numeroDaConta;
	/** Armazena o saldo da Conta.*/
	protected double saldo;
	/** Armazena o cliente titular da Conta.*/
	private Cliente cliente;
	
	
	
	public Conta(Cliente cliente, Banco banco)
	{
		this.agencia = AGENCIA_PADRAO;
		this.numeroDaConta = SEQUENCIAL++;
		this.cliente = cliente;
		banco.inserirContaNoBanco(this);
	}
	
	public Conta(Cliente cliente, double valorDeDepositoInicial)
	{
		this.agencia = AGENCIA_PADRAO;
		this.numeroDaConta = SEQUENCIAL++;
		this.cliente = cliente;
		this.saldo = valorDeDepositoInicial;
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
	
	/** 
	 * Realiza um saque do saldo disponível na conta.
	 * @param valor Valor a ser sacado do saldo disponível em conta.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	public void sacar(double valor)
	{
		this.saldo -= valor;
	}
	
	/** 
	 * Realiza um depósito no saldo disponível na conta.
	 * @param valor Valor a ser depositado no saldo disponível em conta.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	public void depositar(double valor)
	{
		this.saldo += valor;
	}
	
	/** 
	 * Realiza uma transferência entre contas.
	 * @param valor Valor a ser sacado do saldo disponível na conta de origem da movimentação e depositado na conta de destino da movimentação.
	 * @param contaDeDestino Conta que irá receber o valor transferido como depósito em seu saldo disponível.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	public void transferir(double valor, Conta contaDeDestino)
	{
		this.sacar(valor);
		contaDeDestino.depositar(valor);
	}
	
	/** 
	 * Imprime o extrato da conta.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	public void imprimirExtrato()
	{
		System.out.println("*** Extrato Conta ***");
	}
	
	/** 
	 * Imprime informações em comum para conta corrente e conta poupança e que são necessárias no extrato da conta.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	protected void imprimirInformacoesEmComum()
	{
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numeroDaConta));
		System.out.println(String.format("Saldo disponível: %.2f", this.saldo));
	}
	
}
