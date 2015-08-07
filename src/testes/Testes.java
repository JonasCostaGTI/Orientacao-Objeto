/**
 * 
 */
package testes;

import classes.Cartao_de_credito;
import classes.Cliente;
import classes.Conta;

/**
 * @author jonascosta
 */
public class Testes {

	public static void main(String[] args) {

		// K19
		Cartao_de_credito cartao_1 = new Cartao_de_credito();
		Cliente cliente_1 = new Cliente();

		cartao_1.setNumero_cartao(11111);
		cartao_1.setData_validade_cartao("01/01/20015");
		cartao_1.setCliente(cliente_1);
		cartao_1.getCliente().setNome("Jonas");
		cartao_1.getCliente().setCodigo_cliente(1234);
		cartao_1.getCliente().setCpf(33333333);

		// cartao 2 do cliente cl1

		Cartao_de_credito cartao_2 = new Cartao_de_credito();
		cartao_2.setCliente(cliente_1);
		cartao_2.setNumero_cartao(222222);
		cartao_2.setData_validade_cartao("01/01/2020");
		cartao_2.getCliente().setNome(cartao_1.getCliente().getNome());
		
		// conta do cliente 
		
		Conta c_corrente = new Conta();
		c_corrente.setCliente(cliente_1);
		c_corrente.getCliente().setNome(cliente_1.getNome());;
		

		System.out.println("Cartao 1 do cliente "+ cartao_1.getCliente().getNome());
		System.out.println("Cartao 2 do cliente "+ cartao_2.getCliente().getNome());
		System.out.println("Codigo do cliente: "+ cartao_1.getCliente().getCodigo_cliente());
		System.out.println("CPF do cliente " + cartao_1.getCliente().getCpf());
		System.out.println("numero do cartao 1: " + cartao_1.getNumero_cartao());
		System.out.println("numero do cartao 2: " + cartao_2.getNumero_cartao());
		System.out.println("conta corrente " + c_corrente.getCliente().getNome());

		System.out.println("  -------------  ");


	}

}
