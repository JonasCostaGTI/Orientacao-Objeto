/**
 * 
 */
package testes;

import classes.Agencia;
import classes.Carro;
import classes.Cartao_de_credito;
import classes.Cliente;
import classes.Conta;
import classes.Corsa;
import classes.Roda;



/**
 * @author jonascosta
 */
public class Testes {
	
	public static void main(String[] args) {
		
//		Roda roda_1 = new Roda();
//		Roda roda_2 = new Roda();
//		Roda roda_3 = new Roda();
//		Roda roda_4 = new Roda();
//		
//		
//		Corsa corsa = new Corsa(roda_1, roda_2, roda_3, roda_4);
//		
//		corsa.setRoda_1(roda_1);
//		corsa.getRoda_1().setAro(21);
//		corsa.getRoda_1().setCor("verde");
//		
//		
//		System.out.println(corsa.getRoda_1().getCor());
//		
		
	
		
		
		
		// K19
		Cartao_de_credito ca1 = new Cartao_de_credito();
		Cliente cl1 = new Cliente();
		
		
		ca1.setNumero_cartao(11111);
		ca1.setData_validade_cartao("01/01/20015");
		ca1.setCliente(cl1);
		
		cl1.setNome("jonas");
		cl1.setCodigo_cliente(1234);
		cl1.setCpf(33333333);
		
		System.out.println("Cartao do cliente "+ca1.getCliente().getNome());
		System.out.println("Codigo do cliente: "+ca1.getCliente().getCodigo_cliente());
		System.out.println("CPF do cliente "+ca1.getCliente().getCpf());
		///////
		
		
		System.out.println("  -------------  ");
		Conta conta_1 = new Conta();
		Agencia agencia_1 = new Agencia();
		
		agencia_1.setNumero_agencia(123456);
		agencia_1.setCliente(cl1);
		conta_1.setAgencia(agencia_1);
		conta_1.setNumero_conta(654321);
		conta_1.setSaldo(200);
		
		System.out.println("numero da agencia: "+conta_1.getAgencia().getNumero_agencia());
		System.out.println("agencia do cliente "+agencia_1.getCliente().getNome());
		System.out.println("numero da conta: "+conta_1.getNumero_conta());
		System.out.println("numero da saldo: "+conta_1.getSaldo());
		
		
		//K19
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
