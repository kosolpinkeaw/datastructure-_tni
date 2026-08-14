class Node {
	public int data;
	public Node next;
	
	public Node(int value) {
		this.data = value;
		this.next = null;
	}
}

public class SinglyLinkedList {
	private Node head;
	private Node tail;
	
	public SinglyLinkedList() {
		head = null;
		tail = null;
	}
	
	public String displayList() {
		boolean first = true;
		String display = "[";
		for (Node current = head; current != null; current = current.next) {
			display += (!first ? ", " : "") + current.data;
			first = false;
		}
		display += "]";
		return display;
	}
	
	public void clear() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public Object get(int position) {
		if (position < 0) {
			return "No data";
		}
		
		Node current = head;
		int index = 0;
		
		while (current != null) {
			if (index == position) {
				return current.data;
			}
			
			current = current.next;
			index++;
		}
		
		return "No data";
	}
	
	public void set(int position, int value) {
		if (position < 0) {
			System.out.println("Updated data fail!");
			return;
		}
		
		Node current = head;
		int index = 0;
		
		while (current != null) {
			if (index == position) {
				current.data = value;
				System.out.println("Updated data success!!");
				return;
			}
			
			current = current.next;
			index++;
		}
		
		System.out.println("Updated data fail!");
	}
	
	public boolean contains(int value) {
		Node current = head;
		
		while (current != null) {
			if (current.data == value) {
				return true;
			}
			current = current.next;
		}
		
		return false;
	}
	
	public void addAll(SinglyLinkedList otherlist) {
		if (otherlist == null || otherlist.isEmpty()) {
			return;
		}
		
		Node current = otherlist.head;
		
		while (current != null) {
			append(current.data);
			current = current.next;
		}
	}
}

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