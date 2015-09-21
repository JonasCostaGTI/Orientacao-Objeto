/**
 * 
 */
package classes;

import classes_abstratas.Funcionario;
import interfaces.Promocao;

/**
 * @author jonascosta
 */
public class Gerente extends Funcionario implements Promocao {

	private static int contador;

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Gerente.contador = contador;
	}

	public Gerente() {
		Gerente.contador++;
	}

	@Override
	public void aumento_salario(double valor) {
		if (valor <= 0) {
			IllegalArgumentException erro = new IllegalArgumentException();
			throw erro;
		}
		setSalario(getSalario() + valor);
	}

}
