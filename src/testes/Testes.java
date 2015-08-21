/**
 * 
 */
package testes;

import classes.Carro;
import classes.Cartao_de_credito;
import classes.Cliente;
import classes.Conta_corrente;

import classes.Funcionario;
import classes.Roda;
import classes_abstratas.Conta;

/**
 * @author jonascosta
 */
public class Testes {

	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		Cliente b = new Cliente();
//		Conta_corrente conta_corrente = new Conta_corrente();
//		
//		conta_corrente.setCliente(cliente);
//		conta_corrente.getCliente().setNome("Jonas");
//		conta_corrente.getCliente().setCpf("222-444-333-59");
//		conta_corrente.setSaldo(100);
//		System.out.println(conta_corrente.getCliente().getNome());
//		
//		conta_corrente.setCliente(b);
//		conta_corrente.getCliente().setNome("pedro");
//		
//		System.out.println(conta_corrente.getCliente().getNome());
		
	
		Carro carro = new Carro();
		Funcionario funcionario = new Funcionario();
		Cliente cliente = new Cliente();
		cliente.setNome("jonas");
		
		
		funcionario.setNome("jonas");
		funcionario.setSalario(2300);
		funcionario.setRegistro(3747);
		
		funcionario.setCarro(carro);
		funcionario.getCarro().setAno(2009);
		funcionario.getCarro().setMarca("chevrolet");
		
		Cartao_de_credito cartao_de_credito = new Cartao_de_credito(123, "01/01/2015");
		cartao_de_credito.setCliente(cliente);
	
		
		
		funcionario.consulta_dados();
		System.out.println("");
		cliente.consulta_dados_cliente();
		
		
	
		
		


	}

}
