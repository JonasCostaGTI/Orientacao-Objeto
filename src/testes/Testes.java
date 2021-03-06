/**
 * 
 */
package testes;

import classes.Agencia;
import classes.Cartao_de_credito;
import classes.Cliente;
import classes.Conta_corrente;
import classes.Controle_ponto;
import classes.Emprestimo;
import classes.Gerente;
import classes_abstratas.Funcionario;

/**
 * @author jonascosta
 */
public class Testes {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		cliente1.setNome("jonas");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Pedro");
		System.out.println("Numero de Clientes criadas: " + Cliente.getContador());

		Cartao_de_credito cartao_de_credito = new Cartao_de_credito(123, "01/01/2015");
		cartao_de_credito.setCliente(cliente1);
		System.out.println("Numero de Cartao de Creditos criadas: " + Cartao_de_credito.getContador());

		Agencia agencia_centro = new Agencia(1234);
		Agencia agencia_parque = new Agencia(8789);
		Agencia agencia_GM = new Agencia(877);
		System.out.println("Numero de Agencias criadas: " + Agencia.getContador());

		Conta_corrente conta1 = new Conta_corrente(agencia_centro, cliente1);
		Conta_corrente conta2 = new Conta_corrente(agencia_centro, cliente2);
		System.out.println("Numero de Conta Corrente criadas: " + Conta_corrente.getContador());

		conta1.setSaldo(3000);
		conta2.setSaldo(1200);

		System.out.println("");
		System.out.println("SALDO DA CONTA 1 ANTES DA TRANSFERENCIA");
		conta1.consulta_saldo();
		System.out.println("");

		System.out.println("SALDO DA CONTA 2 ANTES DA TRANSFERENCIA");
		conta2.consulta_saldo();

		System.out.println("transferencia... ");
		conta1.transfere(conta2, 200);

		System.out.println("");
		System.out.println("CLIENTE 1");
		cliente1.consulta_dados_cliente();
		conta1.consulta_saldo();

		System.out.println("");
		System.out.println("CLIENTE 2");
		cliente2.consulta_dados_cliente();
		conta2.consulta_saldo();

		// maneira correta de acessar atributo static de uma classe
		Funcionario.setVale_refeicao(14);

		// errado
		// Funcionario f = new Funcionario();
		// f.setVale_refeicao(10);

		System.out.println("");
		System.out.println("EMPRESTIMOS");

		Emprestimo emprestimo = new Emprestimo(cliente1);
		emprestimo.setValor_emprestimo(2000);

		System.out.println("Valor de emprestimo de " + emprestimo.getCliente().getNome() + " é de: "
				+ emprestimo.getValor_emprestimo());

		Gerente gerente = new Gerente();
		gerente.setNome("Jonas Costa");

		Controle_ponto controle_ponto = new Controle_ponto();
		controle_ponto.controle_entrada(gerente);

	}

}
