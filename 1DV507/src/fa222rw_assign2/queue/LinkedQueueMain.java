package fa222rw_assign2.queue;

import java.util.Iterator;

public class LinkedQueueMain {

	public static void main(String[] args) {
		LinkedQueue queue = new LinkedQueue();
		queue.enqueue(25);
		queue.enqueue("hshs");
		for (int i = 0; i < 20; i++) {
			queue.enqueue(i);
		}
		Iterator<Object> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---------------------");
		System.out.println(queue.dequeue());
		System.out.println(queue.first());
		System.out.println(queue.last());
		System.out.println(queue.toString());
		
		
	}

}
