/**
 * 
 */
package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jonascosta
 */
public class Controle_ponto {

	public void controle_entrada(Gerente gerente) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("Entrada: " + gerente.getNome());
		System.out.println("Data : " + sdf.format(agora));
	}

}
