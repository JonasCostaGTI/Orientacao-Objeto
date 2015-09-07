/**
 * 
 */
package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

import classes_abstratas.Funcionario;

/**
 * @author jonascosta
 */
public class Controle_ponto {

	public void controle_entrada(Funcionario funcionario) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("Entrada: " + funcionario.getNome());
		System.out.println("Data : " + sdf.format(agora));
	}

	public void controle_saida(Funcionario funcionario) {
		SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("Saida: " + funcionario.getNome());
		System.out.println("Data: " + stf.format(agora));

	}

}
