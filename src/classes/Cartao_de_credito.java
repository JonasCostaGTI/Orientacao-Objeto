package classes;

public class Cartao_de_credito {
	private long numero_cartao;
	private String data_validade_cartao;
	private Cliente cliente;

	public Cartao_de_credito(long numero_cartao, String data_validade_cartao) {
		this.numero_cartao = numero_cartao;
		this.data_validade_cartao = data_validade_cartao;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public long getNumero_cartao() {
		return numero_cartao;
	}
	public void setNumero_cartao(long numero_cartao) {
		this.numero_cartao = numero_cartao;
	}
	public String getData_validade_cartao() {
		return data_validade_cartao;
	}
	public void setData_validade_cartao(String data_validade_cartao) {
		this.data_validade_cartao = data_validade_cartao;
	}

	@Override
	public String toString() {
		return "Cartao_de_credito [numero_cartao=" + numero_cartao
				+ ", data_validade_cartao=" + data_validade_cartao + "]";
	}

}
