import java.util.Deque;
import java.util.ArrayDeque;

public class StackReverse {

	public static String reverseCharacter(String original) {
		Deque<Character> stack = new ArrayDeque<Character>();

		// เก็บตัวอักษรแต่ละตัวลงใน Stack
		for (int i = 0; i < original.length(); i++) {
			stack.push(original.charAt(i));
		}

		// ดึงตัวอักษรออกจาก Stack ซึ่งจะได้ลำดับย้อนกลับ
		String reverse = "";
		while (!stack.isEmpty()) {
			reverse += stack.pop();
		}

		return reverse;
	}

	public static void main(String[] args) {

		String original = "Hello World";

		System.out.println("Original => " + original);

		String result = reverseCharacter(original);

		System.out.println("Reverse => " + result);
	}
}