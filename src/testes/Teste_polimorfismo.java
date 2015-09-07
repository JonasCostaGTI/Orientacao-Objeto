/**
 * 
 */
package testes;

import classes.Controle_ponto;
import classes.Gerente;
import classes.Secretaria;
import classes.Telefonista;

/**
 * @author jonascosta
 */
public class Teste_polimorfismo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gerente g = new Gerente();
		Telefonista t = new Telefonista();
		Secretaria s = new Secretaria();

		g.setNome("Jonas ");
		t.setNome("Pedro");
		s.setNome("Maria");

		Controle_ponto cp = new Controle_ponto();
		cp.controle_entrada(g);
		cp.controle_entrada(t);
		cp.controle_entrada(s);

	}

}
