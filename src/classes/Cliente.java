package classes;

public class Cliente extends Pessoa{
	private int codigo_cliente;
	
	

	public int getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	@Override
	public String toString() {
		return "Cliente [codigo_cliente=" + codigo_cliente + "]";
	}

	

	
	
	
}
