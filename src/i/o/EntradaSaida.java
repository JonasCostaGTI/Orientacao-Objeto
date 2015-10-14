/**
 * 
 */
package i.o;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author jonascosta
 */
public class EntradaSaida {

	public static void main(String[] args) throws IOException {

		InputStream entrada = System.in;

		int i;

		do {
			i = entrada.read();
			System.out.println("valor de i " + i);
		} while (i != -1);

	}

}
