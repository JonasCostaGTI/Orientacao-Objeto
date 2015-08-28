package classes;

import classes_abstratas.Pessoa;

public class Cliente extends Pessoa {
	private int codigo_cliente;
	private static int contador;

	public Cliente() {
		Cliente.contador++;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Cliente.contador = contador;
	}

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

	public void consulta_dados_cliente() {
		System.out.println("DADOS DO CLIENTE");
		System.out.println("Nome do cliente: " + super.getNome());
	}

}
