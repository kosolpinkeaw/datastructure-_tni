
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numberarraycontroller nums = new numberarraycontroller();
		nums.display("Display an initiel array:");
		
		int[] new_nums = new int[nums.getNums().length-1];
		
		int index_delete = 2;
		
		for (int i=0; i<index_delete; i++) {
			 new_nums[i] = nums.getNums()[i];
		}
		
		for (int i=index_delete+1; i<nums.getNums().length; i++) {
			new_nums[i-1] = nums.getNums()[i];
		}

		
		nums.setNums(new_nums);
		nums.display("After delete data index 2:");
	}

}
