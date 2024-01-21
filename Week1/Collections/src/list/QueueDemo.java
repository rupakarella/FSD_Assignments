package list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	    public static void main(String[] args) {
	        // Creating a Queue using LinkedList
	        Queue<String> queue = new LinkedList<>();

	        // Enqueue (add) elements to the Queue
	        queue.add("First");
	        queue.add("Third");
	        queue.add("Second");

	        System.out.println(queue);
	        

	        // Check if the Queue is empty
	        boolean isEmpty = queue.isEmpty();
	        System.out.println("Is the Queue empty? " + isEmpty);
	    }
}
