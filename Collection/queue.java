import java.util.LinkedList;
import java.util.Queue;

public class queue {
  public static void main(String[] args) {

    Queue<String> queue = new LinkedList<String>();
      queue.offer("Steve");
      queue.offer("Brian");
      queue.offer("Ramesh");

      System.out.println(queue.peek());

      queue.poll();
      queue.poll();
      queue.poll();
     // queue.element();    throws an exception if no elements are left in the queue
     // queue.poll();       does not throw any exception if the queue is completely dequeued
      System.out.print(queue);
    

  }
}
