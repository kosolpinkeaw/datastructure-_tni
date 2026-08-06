package labsheet5;

public class Stacltest {

	public static void main(String[] args) {
		StackArrayBased stack = new StackArrayBased();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
