import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Interface {

    public static void main(String[] args) {

        Queue <String>queue= new PriorityQueue<String>();
        queue.add("Tom");
        queue.add("jerry");
        queue.add("jack");
        queue.add("smith");
        queue.add("john");

        System.out.println("printing the elements in the array"+queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.offer("jack"));
        System.out.println(queue.isEmpty());
        System.out.println(queue);

    }
}
