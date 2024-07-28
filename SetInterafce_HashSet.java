import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterafce_HashSet {
    // sorting in without any sequence and set doesnt allow duplicate
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("mno");
        set.add("ccc");
        set.add("ccc");
        Iterator itr =set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
