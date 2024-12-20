import java.util.*;

public class MyPriorityQueue {
  public static void main(String args[]) 
  {
    // Priority Queue  = A FIFO data Structure that servers elements
    //                   with the highest priorities first
    //                   before elements with lower priority
    
    Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

    queue.offer(3.0);
    queue.offer(2.5);
    queue.offer(4.0);
    queue.offer(1.5);
    queue.offer(2.0);

    Double RemoteElement = queue.poll();
    System.out.println("Elemento removido: " + RemoteElement);
    
    while(!queue.isEmpty()) {
      System.out.println(queue.poll());
    }

    System.out.println("************************************");

    Queue<String> fila = new PriorityQueue<>();


    fila.offer("B");
    fila.offer("C");
    fila.offer("A");
    fila.offer("F");
    fila.offer("D");

    while(!fila.isEmpty()) {
      System.out.println(fila.poll());
    }
  }
}

