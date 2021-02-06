import java.util.Scanner;

/**
 * @author Oscar Estrada 20565
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerObj = new Scanner(System.in);
        CalculadoraController c = new CalculadoraController();

        
        String postfix = c.leerDocumento();
        System.out.println("Resultado: " + c.resolver(postfix));
        
	}

}
