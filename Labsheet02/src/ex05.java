
public class ex05 {

	public static void main(String[] args) {
		numberarraycontroller nums = new numberarraycontroller();
		nums.display("Display an initiel array:");
		
		int[] new_nums = new int[nums.getNums().length-1];
		
		for(int i=0; i<new_nums.length; i++) {
			new_nums[i] = nums.getNums()[i];
		}
		
		nums.setNums(new_nums);
		nums.display("After delete the last element:");

	}

}

