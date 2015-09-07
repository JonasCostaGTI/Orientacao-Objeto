package classes_abstratas;

import classes.Cliente;

public abstract class Servico {
	private Cliente cliente;
	private Funcionario funcionario;
	private String data_contratacao;

	public double calcula_taxa() {
		return 10;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getData_contratacao() {
		return data_contratacao;
	}

	public void setData_contratacao(String data_contratacao) {
		this.data_contratacao = data_contratacao;
	}

}
