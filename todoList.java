
public class todoList {

	public static void main(String[] args) {
		DoublyLinkedList todoList = new DoublyLinkedList();
		
		todoList.insert("Finish Homework");
		todoList.insert("Laundry");
		todoList.insert("Group Meeting");
		System.out.println(todoList.backwardTraversal());

		
		todoList.insert(0,"Submit Report");
		System.out.println(todoList.backwardTraversal());
		
		todoList.insert(2,"Buy Food");
		System.out.println(todoList.backwardTraversal());
		
		todoList.insert("Go to Gym");
		System.out.println(todoList.backwardTraversal());


	}

}
