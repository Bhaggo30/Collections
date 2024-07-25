import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Interface {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(78);
        al.add(56);
        al.add(34);
        al.add(31);

         Iterator itr=al.iterator();
         while (itr.hasNext()){
             System.out.println(itr.next());
         }
    }
}
