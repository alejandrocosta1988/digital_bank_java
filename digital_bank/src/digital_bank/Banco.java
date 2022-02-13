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

}
