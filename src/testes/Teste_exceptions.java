/**
 * 
 */
package testes;

import classes.Gerente;

/**
 * @author jonascosta
 */
public class Teste_exceptions {

	/**
	 * Adicionar um comentario para este metodo
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setNome("Jonas");

		try {
			g.aumento_salario(-100);
		} catch (Exception e) {
			System.out.println("Nao foi possivel efetuar o aumento de salario");

		}

	}

}
