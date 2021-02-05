import java.util.Scanner;
import java.util.Stack;

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
        Stack<String> pila = new Stack<String>(); 
        
        System.out.println("Ingrese el codigo del libro: ");
        String codigo = scannerObj.nextLine();
        
        imprimirPila(pila);
        pila.push("2");
        pila.push("4");
        imprimirPila(pila);
        pila.pop();
        imprimirPila(pila); 
		
	}
	
	public static void imprimirPila(Stack<String> pila) {
        if (pila.empty()) {
            System.out.print("la pila esta vacia\n\n");
        } else {
            System.out.print("la pila contiene: ");
            for (String numero : pila) {
                System.out.printf("%s ", numero);
            }
            System.out.print("(superior) \n\n");
        }
    }

}
