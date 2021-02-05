import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

/**
 * @author Oscar Estrada 20565
 *
 */
public class CalculadoraController<E> implements Stack, ICalculadora {
	private LinkedList<E> lista;
	private double operandoA;
	private double operandoB;
	
	public CalculadoraController() {
		lista = new LinkedList<E>();
	}

	@Override
	public void push(Object item) {
		// TODO Auto-generated method stub
		lista.addFirst((E) item);
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		String value = peek();
		lista.removeFirst();
		return value;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return (String) lista.getFirst();
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return lista.isEmpty();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return lista.size();
	}

	@Override
	public Double resolver(String input) {
		// TODO Auto-generated method stub
		Double resultado = 0.0;
		input = input.replaceAll(" ","");
		for(String ch: input.split("")) {
			System.out.println(ch);
			switch(ch){
			case "+":
				operandoA = Double.parseDouble(pop());
				operandoB = Double.parseDouble(pop());
				resultado = operandoA + operandoB;
				push(resultado.toString());
				break;
			case "-":
				operandoA = Double.parseDouble(pop());
				operandoB = Double.parseDouble(pop());
				resultado = operandoA - operandoB;
				push(resultado.toString());
				break;
			case "*":
				operandoA = Double.parseDouble(pop());
				operandoB = Double.parseDouble(pop());
				resultado = operandoA * operandoB;
				push(resultado.toString());
				break;
			case "/":
				operandoA = Double.parseDouble(pop());
				operandoB = Double.parseDouble(pop());
				resultado = operandoA / operandoB;
				push(resultado.toString());
				break;
			default:
				push(ch);
			}
			System.out.print(lista);
		}
		return resultado;
	}

	@Override
	public Double resolver(int n1, int n2, char operando) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String leerDocumento() {
		// TODO Auto-generated method stub
		String texto = new String();
		try {
			FileReader fr = new FileReader("./docs/datos.txt");
			BufferedReader entrada = new BufferedReader(fr); 
			String s;
			
			while((s = entrada.readLine()) != null) {
				texto = s;
			}
			
		}
		catch(java.io.FileNotFoundException fnfex) {
			System.out.println("Archivo no encontrado: " + fnfex);}
		catch(java.io.IOException ioex) {}
		return texto;
	}
	
	public String toString() {
		return lista.toString();
	}
	
}
