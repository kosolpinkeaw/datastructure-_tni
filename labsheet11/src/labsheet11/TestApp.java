package labsheet11;

public class TestApp {

	public static void main(String[] args) {
		
		int[] nums =  {11, 9, 23, 87, 38, 22, 92, 10};
		Sorting sort1 = new Sorting(nums);
		sort1.bubbleSort();
		sort1.printSortedData();
		
		int[] num2 = {25, 11, 45, 6, 87, 20, 78, 64};
		Sorting sort2 = new Sorting(num2);
		System.out.println();
		sort2.selectionSort();
		sort2.printSortedData();
		
		int[] num3 =  {68, 10, 87, 75, 14, 36, 98, 76};
		Sorting sort3 = new Sorting(num3);
		System.out.println();
		sort3.insertionSort();
		sort3.printSortedData();
		
		int[] num4 =  {87, 11, 26, 35, 49, 85, 21, 46} ;
		Sorting sort4 = new Sorting(num4);
		System.out.println();
		sort4.quickSort();
		sort4.printSortedData();
	}
	
}
