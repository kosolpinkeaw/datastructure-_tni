package labsheet06;

import java.util.LinkedList;
import java.util.Queue;
 
public class LabQueue01 {
 
    public static void main(String[] args) {
 
        Queue<Integer> bankQueue = new LinkedList<>();
 
 
        for (int i = 101; i <= 105; i++) {
            bankQueue.add(i);
            System.out.println("Enqueue: " + i);
        }
        
 
        System.out.println("Queue => " + bankQueue);
        System.out.println();
 
 
        while (!bankQueue.isEmpty()) {
  
            System.out.println("Calling number: " + bankQueue.peek());
            
            System.out.println("Providing service number: " + bankQueue.poll());
            
            System.out.println();
        }
 
        System.out.println("Queue => " + bankQueue);
    }
}
