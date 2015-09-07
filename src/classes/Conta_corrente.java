/**
 * 
 */
package classes;

import classes_abstratas.Conta;

/**
 * @author jonascosta
 */
public class Conta_corrente extends Conta {
	private static int contador;

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Conta_corrente.contador = contador;
	}

	public Conta_corrente(Agencia agencia, Cliente cliente) {
		super(agencia, cliente);
		Conta_corrente.contador++;

	}

	@Override
	public void extrato_conta() {
		System.out.println("saldo: " + getSaldo());
		System.out.println("limite: " + getSaldo());

	}
}
