package digital_bank;

import java.util.List;
import java.util.ArrayList;

/** 
 * Implementa o Banco Digital.
 * @author Alejandro Costa
 * @version 0.1 2022-02-23
 * */
public class Banco {
	
	/** Armazena o nome do banco.*/
	private String nome;
	
	/** Armazena as contas criadas no banco.*/
	List<Conta> contas = new ArrayList<>();
	
	public Banco(String nome)
	{
		this.nome = nome;
	}
	
	/** 
	 * Retorna o nome do banco.
	 * @return Uma String contendo o nome do banco.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	public String getNome()
	{
		return this.nome;
	}
	
	/** 
	 * Altera o nome do banco.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	public void setNome(String nome)
	{
		this.nome = nome; 
	}
	
	/** 
	 * Insere uma nova conta na lista de contas criadas no banco.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	public void inserirContaNoBanco(Conta novaConta)
	{
		this.contas.add(novaConta); 
	}
	
	/** 
	 * Exibe a lista de contas criadas no banco.
	 * @author Alejandro Costa
	 * @since 0.1
	 */
	public void exibirListaDeContas()
	{
		System.out.println(contas.toString()); 
	}

}
