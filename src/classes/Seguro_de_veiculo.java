/**
 * 
 */
package classes;

import classes_abstratas.Servico;

/**
 * @author jonascosta
 */
public class Seguro_de_veiculo extends Servico {

	private Carro carro;
	private double valor_seguro;
	private double franquia;

	@Override
	public double calcula_taxa() {
		return 0.05;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public double getValor_seguro() {
		return valor_seguro;
	}

	public void setValor_seguro(double valor_seguro) {
		this.valor_seguro = valor_seguro;
	}

	public double getFranquia() {
		return franquia;
	}

	public void setFranquia(double franquia) {
		this.franquia = franquia;
	}

}
