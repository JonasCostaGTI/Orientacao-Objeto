/**
 * 
 */
package testes;

import classes.Agencia;
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

	
		Cliente cliente1 = new Cliente();
		cliente1.setNome("jonas");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Pedro");
		
		
		
		
		Cartao_de_credito cartao_de_credito = new Cartao_de_credito(123, "01/01/2015");
		cartao_de_credito.setCliente(cliente1);
	
		Agencia agencia_centro = new Agencia(1234);
		Conta_corrente conta1 = new Conta_corrente(agencia_centro, cliente1);
		Conta_corrente conta2 = new Conta_corrente(agencia_centro, cliente2);
		
		conta1.setSaldo(3000);
		conta2.setSaldo(1200);
		
		System.out.println("SALDO DA CONTA 1 ANTES DA TRANSFERENCIA");
		conta1.consulta_saldo();
		System.out.println("");
		
		System.out.println("SALDO DA CONTA 2 ANTES DA TRANSFERENCIA");
		conta2.consulta_saldo();
		
		conta1.transfere(conta2, 200);
		
		
		
		
		
		
		System.out.println("CLIENTE 1");
		cliente1.consulta_dados_cliente();
		conta1.consulta_saldo();
		
		
		System.out.println("");
		System.out.println("CLIENTE 2");
		cliente2.consulta_dados_cliente();
		conta2.consulta_saldo();
		
		
	
		
		


	}

}
