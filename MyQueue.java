import java.util.Queue;
import java.util.LinkedList;


public class MyQueue {
  
    public static void main(String[] args) {
      // *****************************************************
     //Queue = FIFO data structure. First-In First-Out (ex. A line of people)
    //         A colection designed for holding elements prior to processing
    //         Linear data structure

    //         add     = enqueue, offer()
    //         remive  = dequeue, poll()
    
    // *****************************************************

    Queue<String> queue = new LinkedList<String>();

    queue.offer("Marlon");
    queue.offer("Chard");
    queue.offer("Steve");
    queue.offer("Harold");

    System.out.println(queue.poll());
   // System.out.println(queue.contains("Chard"));
    System.out.println(queue.size());
    //System.out.println(queue.peek());
    System.out.println(queue);

    // Where are queues useful?

    // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
    // 2. Printer Queue (Print jobs should be completed in order)
    // 3. Used in LinkedList, PriorityQueues, Breadth-first search
   
    }
  
}
