import java.util.ArrayList;
import java.util.List;

public class List2StackAdapter<E> implements Stack<E>{

	private List<E> list = new ArrayList<E>();
	
	@Override
	public void push(E element) {
		list.add(element);
	}

	@Override
	public E pop() {
		if (isEmpty()) return null;
		return list.remove(size()-1);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return (list.size() == 0);
	}
}
