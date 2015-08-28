/**
 * 
 */
package classes;

import classes_abstratas.Conta;

/**
 * @author jonascosta
 */
public class Conta_poupanca extends Conta {
	private static int contador;

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Conta_poupanca.contador = contador;
	}

	public Conta_poupanca(Agencia agencia, Cliente cliente) {
		super(agencia, cliente);
		Conta_poupanca.contador++;

	}

}
