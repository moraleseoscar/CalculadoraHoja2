import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Oscar Estrada 20565
 */

class leerDocumentoTest {

	/**
	 * Prueba JUnit para comprobar si el documento se lee correctamente.
	 *
	*/
	@Test
	void test() {
		CalculadoraController test = new CalculadoraController();
		String postfix = test.leerDocumento();
		assertEquals("1 2 + 4 * 3 +", postfix);
	}

}
