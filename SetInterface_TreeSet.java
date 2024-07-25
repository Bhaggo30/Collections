import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface_TreeSet {
    // treeset iterate the object in natural sorting order
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(23);
        treeSet.add(67);
        treeSet.add(1);
        treeSet.add(22);

         Iterator itr =treeSet.iterator();
         while (itr.hasNext()){
             System.out.println(itr.next());
         }
        System.out.println(treeSet.remove(67));
        System.out.println(treeSet);
        System.out.println(treeSet.equals(56));
        System.out.println(treeSet.isEmpty());

    }
}
