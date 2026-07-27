
public class Node {

    Node previous;
    Object data;
    Node next;

    public Node(Object data) {
        this.previous = null;
        this.data = data;
        this.next = null;
    }

    public String getAddress() {
        return "" + Integer.toHexString(System.identityHashCode(this));
    }

    public static String getAddress(Node node) {
        return (node == null) ? "null" : node.getAddress();
    }

}




public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public String traversal() {

        Node current = head;
        String result = "[";
        boolean first = true;

        while (current != null) {

            result += (!first ? ", " : "") + current.data;

            first = false;
            current = current.next;
        }

        result += "]";

        return result;
    }

    public String backwardTraversal() {

        Node current = tail;
        String result = "[";
        boolean first = true;

        while (current != null) {

            result += (!first ? ", " : "") + current.data;

            first = false;
            current = current.previous;
        }

        result += "]";

        return result;
    }

    public void insert(Object value) {

        Node newNode = new Node(value);

        if (head == null) {

            head = newNode;
            tail = newNode;

        } else {

            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;

        }

    }

    public void insert(int position, Object value) {

        Node newNode = new Node(value);

        if (head == null) {

            head = newNode;
            tail = newNode;

        } else if (position == 0) {

            newNode.next = head;
            head.previous = newNode;
            head = newNode;

        } else {

            Node current = head;
            int index = 0;

            while (current.next != null && index < position - 1) {

                current = current.next;
                index++;

            }

            if (current == tail) {

                current.next = newNode;
                newNode.previous = current;
                tail = newNode;

            } else {

                newNode.next = current.next;
                newNode.previous = current;
                current.next.previous = newNode;
                current.next = newNode;

            }

        }

    }

    public void remove() {

        if (head == null)
            return;

        if (head == tail) {

            head = null;
            tail = null;

        } else {

            tail = tail.previous;
            tail.next = null;

        }

    }

    public void remove(int position) {

        if (head == null)
            return;

        if (position == 0) {

            if (head == tail) {

                head = null;
                tail = null;

            } else {

                head = head.next;
                head.previous = null;

            }

            return;

        }

        Node current = head;
        int index = 0;

        while (current != null && index < position) {

            current = current.next;
            index++;

        }

        if (current == null)
            return;

        if (current == tail) {

            tail = tail.previous;
            tail.next = null;

        } else {

            current.previous.next = current.next;
            current.next.previous = current.previous;

        }

    }

}




public class TodoList {

    public static void main(String[] args) {

        DoublyLinkedList todoList = new DoublyLinkedList();


        todoList.insert("Finish Homework");
        todoList.insert("Laundry");
        todoList.insert("Group Meeting");

        System.out.println("Initial : " + todoList.traversal());


        todoList.insert(0, "Submit Report");
        System.out.println("After insert Submit Report : "
                + todoList.traversal());

        todoList.insert(2, "Buy Food");
        System.out.println("After insert Buy Food : "
                + todoList.traversal());

        todoList.insert("Go to Gym");
        System.out.println("After insert Go to Gym : "
                + todoList.traversal());


        todoList.remove();


        todoList.remove(3);


        todoList.remove(0);

        System.out.println("After remove : "
                + todoList.traversal());


        System.out.println("Backward : "
                + todoList.backwardTraversal());

    }

}


import java.util.LinkedList;

public class BrowserHistory {

    public static void main(String[] args) {

        LinkedList<String> history = new LinkedList<>();


        history.add("google.com");
        history.add("youtube.com");
        history.add("github.com");
        System.out.println(history);


        history.removeLast();
        System.out.println(history);


        history.add("shopee.com");
        history.add("wikipedia.org");
        history.add("claude.ai");
        System.out.println(history);

        history.remove("youtube.com");
        System.out.println(history);

        System.out.println("Current page = " + history.getLast());

        System.out.println("Visited youtube.com = "
                + history.contains("youtube.com"));

        System.out.println("Go back to previous page = "
                + history.get(history.size() - 2));

        System.out.println("Go back to previous page again = "
                + history.get(history.size() - 3));

        history.clear();
        System.out.println(history);

    }

}