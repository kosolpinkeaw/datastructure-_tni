import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int [] nums = new int[5];
		
		for (int i=0; i<nums.length; i++) {
			System.out.print("Enter number index " + i + ": ");
				nums[i] = scan.nextInt();
		}
		
		numberarraycontroller numbers = new numberarraycontroller();
		numbers.setNums(nums);
		numbers.display("\nprint all elements");
	}

}
