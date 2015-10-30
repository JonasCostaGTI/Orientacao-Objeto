/**
 * 
 */
package collections;

import java.util.ArrayList;

import classes.Agencia;

/**
 * @author jonascosta
 */
public class Lista {

	public static void main(String[] args) {

		ArrayList arrayLista = new ArrayList();

		for (int i = 0; i < 10; i++) {
			Agencia agencia = new Agencia(i);
			agencia.setContador(i * 3);
			arrayLista.add(agencia);

		}

		System.out.println(arrayLista.size());
		
		
		System.out.println(arrayLista.get(2));
		
		
	}

}
