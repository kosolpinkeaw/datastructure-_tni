import java.util.ArrayList;

public class ex07 {

	public static void main(String[] args) {
		ArrayList<Integer>nums = new ArrayList<Integer>();
		
		System.out.print("\nLength = " +nums.size());
		
		nums.add(11);
		nums.add(12);
		nums.add(13);
		nums.add(14);
		nums.add(15);
		
		System.out.print("\nLength = " +nums.size());
		System.out.print("\nAll elements = " +nums);
		
		int index_update = 2;
		int element_update = 20;
		
		nums.set(index_update, element_update);
		System.out.print("\nAll elements = " +nums);
		
		int index_delete = 2;
		
		nums.remove(2);
		System.out.print("\nAll elements = " +nums);
		
		int element_delete = 15;
		
		nums.remove(Integer.valueOf(20));
		System.out.print("\nAll elements = " +nums);
		
		nums.clear();
		System.out.print("\nAll elements = " +nums);

	}

}
