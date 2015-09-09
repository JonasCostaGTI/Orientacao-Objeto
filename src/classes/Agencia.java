/**
 * 
 */
package classes;

/**
 * Documentacao da classe agencia
 * 
 * @author jonascosta
 */
public class Agencia {
	private int numero_agencia;
	private Cliente cliente;
	private static int contador;

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Agencia.contador = contador;
	}

	public Agencia(int numero) {
		this.numero_agencia = numero;
		Agencia.contador++;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNumero_agencia() {
		return numero_agencia;
	}

	public void setNumero_agencia(int numero_agencia) {
		this.numero_agencia = numero_agencia;
	}

	@Override
	public String toString() {
		return "Agencia [numero_agencia=" + numero_agencia + ", cliente=" + cliente + "]";
	}

}
