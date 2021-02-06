import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * @author Oscar Estrada 20565
 */

class StackTest {

	/**
	 * Prueba JUnit para comprobar si las funciones del stack funcionan correctamente.
	 *
	*/
	@Test
	void test() {
		Stack test = new CalculadoraController();
		test.push("1");
		test.push("2");
		test.push("+");
		test.pop();
		test.push("4");
		test.push("8");
		test.pop();
		test.push("/");
		//assertEquals(4, test.size());
		assertEquals("/", test.peek());
	}

}
