import java.util.*;

public class ArrayDeque {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(90);
        queue.add(89);
        queue.add(34);
        queue.add(12);
        queue.add(30);

         Iterator<Integer> itr =queue.iterator();
         while (itr.hasNext()){
             System.out.println(itr.next());
         }
         queue.element();
        System.out.println(queue.element());  // works same as peek method element() also gives the head element
        queue.poll();
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.remove(30);
        System.out.println(queue); // poll and remove methods works as same



    }
}
