import java.util.Queue;
import java.util.ArrayDeque;

public class QueueFirstFive {

	public static Queue<Integer> n_queue = new ArrayDeque<Integer>();

	public static void main(String[] args) {

		// เก็บหมายเลข 101 - 110
		for (int i = 101; i <= 110; i++) {
			n_queue.offer(i);
		}

		// แสดง Queue ก่อนทำงาน
		System.out.println("Queue => " + n_queue);

		// แสดง 5 คิวแรก
		for (int i = 0; i < 5; i++) {
			int value = n_queue.poll();
			System.out.println(value);
			n_queue.offer(value);
		}

		// แสดง Queue หลังทำงาน
		System.out.println("Queue => " + n_queue);
	}
}