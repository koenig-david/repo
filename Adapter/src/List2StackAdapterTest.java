public class List2StackAdapterTest {

	public static void main(String[] args) {
		Stack<String> stack = new List2StackAdapter<String>();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");

		System.out.println(stack.pop());
	

		System.out.println(stack.pop());

		System.out.println(stack.pop());
	}
}
