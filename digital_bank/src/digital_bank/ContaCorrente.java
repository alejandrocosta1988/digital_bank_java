package digital_bank;

/** 
 * Implementa uma conta do tipo corrente.
 * @author Alejandro Costa
 * @version 0.1 2022-02-22
 * */
public class ContaCorrente extends Conta {

	// Precisamos de um atributo static para ir incrementando o número da conta.
	private static int SEQUENCIAL = 1;
	
	public ContaCorrente()
	{
		// Mesma agência para todas as contas.
		super.agencia = Conta.AGENCIA_PADRAO;
		
		// Sempre que uma nova conta for criada, o seu número será o número da conta criada anteriormente acrescido de 1. SEQUENCIAL, por sua vez, deverá ser incrementado de 1.
		super.numeroDaConta = SEQUENCIAL++;
	}
	
}
