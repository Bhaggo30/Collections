import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorClass {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("-----------");

        ListIterator<Integer> it = al.listIterator(al.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
