/**
 * 
 */
package classes;

/**
 * @author jonascosta
 */
public class Agencia {
	private int numero_agencia;
	private Cliente cliente;
	
	public Agencia(int numero){
		this.numero_agencia = numero;
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
		return "Agencia [numero_agencia=" + numero_agencia + ", cliente="
				+ cliente + "]";
	}
	
	
	
}
