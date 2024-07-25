import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeInterfaceMethods {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();
        deque.add("english");
        deque.add("hindi");
        deque.add("marathi");
        deque.add("gujrati");
        deque.add("kanada");

         Iterator itr = deque.iterator();
         while (itr.hasNext()){
             System.out.println(itr.next());
         }

        System.out.println(deque.reversed());
         deque.addFirst("american");
         deque.addLast("british");
         deque.addLast("bangloli");
        System.out.println("element can be added first "+deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.reversed());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());


        System.out.println(deque);
    }
}
