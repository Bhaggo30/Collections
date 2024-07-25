import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface_LinkedHashSet {
     // duplication is not allowed in set interface
    public static void main(String[] args) {
        Set<Integer> hashset  = new LinkedHashSet<>();
        hashset.add(10);
        hashset.add(10);
        hashset.add(30);
        hashset.add(22);
        hashset.add(20);
        hashset.add(10);

          Iterator itr = hashset.iterator();
          while (itr.hasNext()){
              System.out.println(itr.next());
          }
        System.out.println(hashset.isEmpty());
        System.out.println(hashset.remove(22));
        System.out.println(hashset.toString());
        System.out.println(hashset.size());
    }
}
