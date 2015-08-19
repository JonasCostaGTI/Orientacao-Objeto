/**
 * 
 */
package classes;

import interfaces.Promocao;

/**
 * @author jonascosta
 */
public class Gerente extends Funcionario implements Promocao{
	
	@Override
	public void aumento_salario(double valor) {
		setSalario(getSalario() + valor);
	}
	
}
