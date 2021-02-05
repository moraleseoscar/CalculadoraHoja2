import java.util.LinkedList;

/**
 * @author Oscar Estrada 20565
 *
 */
public class CalculadoraController<E> implements Stack, ICalculadora {
	private LinkedList<E> lista;
	
	public CalculadoraController() {
		lista = new LinkedList<E>();
	}

	@Override
	public void push(Object item) {
		// TODO Auto-generated method stub
		lista.addFirst((E) item);
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		lista.removeFirst();
		return (E) lista.getFirst();
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return (E) lista.getFirst();
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
		return null;
	}

	@Override
	public Double resolver(int n1, int n2, char operando) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return lista.toString();
	}
	
}
