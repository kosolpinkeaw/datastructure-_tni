
#include <stdio.h>

public class Node {
    public Object data;
    public Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    public String getAddress() {
        return Integer.toHexString(System.identityHashCode(this));
    }

    public static String getAddress(Node node) {
        if (node == null)
            return "null";
        return Integer.toHexString(System.identityHashCode(node));
    }
}
public class TestLinkedNode {

    public static void main(String[] args) {

        Node n1 = new Node("Alice");
        Node n2 = new Node(25);
        Node n3 = new Node(true);
        Node n4 = new Node(17.5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node temp = n1;

        while (temp != null) {
            System.out.println("Data : " + temp.data);
            System.out.println("Address : " + temp.getAddress());
            System.out.println("Next : " + Node.getAddress(temp.next));
            System.out.println();
            temp = temp.next;
        }
    }
}
public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    // ข้อ 1
    public String traversal() {
        String result = "[";
        Node current = head;

        while (current != null) {
            result += current.data;
            if (current.next != null)
                result += ", ";
            current = current.next;
        }

        result += "]";
        return result;
    }

    // ข้อ 2-3
    public void insert(int position, Object value) {

        Node newNode = new Node(value);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // ข้อ 4
    public void insert(Object value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // ข้อ 5-6
    public void remove(int position) {

        if (head == null)
            return;

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;

        for (int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // ข้อ 7
    public void removeLastElement() {

        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    // ข้อ 8
    public int length() {

        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    // ข้อ 9
    public Object get(int position) {

        Node current = head;

        for (int i = 0; i < position && current != null; i++) {
            current = current.next;
        }

        if (current == null)
            return null;

        return current.data;
    }

    // ข้อ 10
    public void set(int position, Object value) {

        Node current = head;

        for (int i = 0; i < position && current != null; i++) {
            current = current.next;
        }

        if (current != null)
            current.data = value;
    }

    // ข้อ 11
    public void clear() {
        head = null;
    }
}
public class NumberLinkedList {

    public static void main(String[] args) {

        LinkedList numbers = new LinkedList();

        // ข้อ 2
        numbers.insert(0, 37);
        numbers.insert(0, 7);
        numbers.insert(0, 4);
        numbers.insert(0, 16);
        System.out.println(numbers.traversal());

        // ข้อ 3
        numbers.insert(2, 20);
        System.out.println(numbers.traversal());

        // ข้อ 4
        numbers.insert(25);
        System.out.println(numbers.traversal());

        // ข้อ 5
        numbers.remove(0);
        System.out.println(numbers.traversal());

        // ข้อ 6
        numbers.remove(2);
        System.out.println(numbers.traversal());

        // ข้อ 7
        numbers.removeLastElement();
        System.out.println(numbers.traversal());

        // ข้อ 8
        System.out.println("Length = " + numbers.length());

        // ข้อ 9
        System.out.println("Position 1 = " + numbers.get(1));

        // ข้อ 10
        numbers.set(1, 100);
        System.out.println(numbers.traversal());

        // ข้อ 11
        numbers.clear();
        System.out.println(numbers.traversal());
    }
}
public class TrainLinkedList {

    public static void main(String[] args) {

        LinkedList greenline = new LinkedList();

        greenline.insert("Mo-chit");
        greenline.insert("Ari");
        greenline.insert("Sanam-Pao");
        System.out.println(greenline.traversal());

        greenline.insert(2, "Rachakru");
        System.out.println(greenline.traversal());

        System.out.println(greenline.length());

        System.out.println(greenline.get(0));

        greenline.set(0, "Mo-chit (Central Ladprao)");
        System.out.println(greenline.traversal());

        greenline.remove(2);
        System.out.println(greenline.traversal());

        greenline.removeLastElement();
        System.out.println(greenline.traversal());

        greenline.clear();
        System.out.println(greenline.length());
        System.out.println(greenline.traversal());
    }
}
