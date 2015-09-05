/**
 * 
 */
package classes;

import classes_abstratas.Servico;

/**
 * @author jonascosta
 */
public class Emprestimo extends Servico {
	private double valor_emprestimo;
	private double valor_taxa_juros;

	@Override
	public double calcula_taxa() {
		return this.valor_emprestimo * 0.1;

	}

	public Emprestimo(Cliente cliente) {
		super();
		setCliente(cliente);
	}

	public double getValor_emprestimo() {
		return valor_emprestimo;
	}

	public void setValor_emprestimo(double valor_emprestimo) {
		this.valor_emprestimo = valor_emprestimo;
	}

	public double getValor_taxa_juros() {
		return valor_taxa_juros;
	}

	public void setValor_taxa_juros(double valor_taxa_juros) {
		this.valor_taxa_juros = valor_taxa_juros;
	}

}
