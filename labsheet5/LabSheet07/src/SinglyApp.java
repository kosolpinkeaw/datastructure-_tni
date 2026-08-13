
import java.util.Scanner;

public class SinglyApp {

	public static SinglyLinkedList list1 = new SinglyLinkedList();
	public static SinglyLinkedList list2 = new SinglyLinkedList();
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Test method 'append()'\n----------------------");
		testAppend();
		
		System.out.println("\nTest method 'get()'\n-------------------");
		testGet();            
		
		System.out.println("\nTest method 'set()'\n-------------------");
		testSet();            
		
		System.out.println("\nTest method 'contains()'\n-----------------------");
		testContains();       
		
		System.out.println("\nTest method 'addAll()'\n---------------------");
		testAddAll();         

	}

	public static void testAppend() {
		list1.clear();
		
		list1.append(101);
		list1.append(102);
		list1.append(103);
		list1.append(104);
		list1.append(105);
		
		System.out.println("Current List = " + list1.displayList());
	}

	public static void testGet() {
		System.out.println("Get element index 2 = " + list1.get(2));
		System.out.println("Get element index 7 = " + list1.get(7));
	}

	public static void testSet() {
		System.out.println("Current List = " + list1.displayList());
		
		list1.set(2, 111);
		System.out.println("Current List = " + list1.displayList());
		
		list1.set(7, 222);
		System.out.println("Current List = " + list1.displayList());
	}

	public static void testContains() {
		if (list1.contains(104)) {
			System.out.println("104 found!!");
		} else {
			System.out.println("104 not found...");
		}
		
		if (list1.contains(222)) {
			System.out.println("222 found!!");
		} else {
			System.out.println("222 not found...");
		}
	}

	public static void testAddAll() {
		list2.clear();
		
		list2.append(201);
		list2.append(202);
		
		System.out.println("Elements in list1 = " + list1.displayList());
		System.out.println("Elements in list2 = " + list2.displayList());
		
		list1.addAll(list2);
		
		System.out.println("Merge result = " + list1.displayList());
		
		list2.append(203);
		list2.append(204);
		list2.append(205);
		
		System.out.println("\nElements in list1 = " + list1.displayList());
		System.out.println("Elements in list2 = " + list2.displayList());
		
		list1.addAll(list2);
		
		System.out.println("Merge result = " + list1.displayList());
	}

}