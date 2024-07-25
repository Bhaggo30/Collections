import java.util.ArrayList;
import java.util.Collections;

public class CollectionClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(89);
        arrayList.add(20);
        arrayList.add(66);
        arrayList.add(43);
        System.out.println(arrayList);
        System.out.println("-----------");

        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("------------");
        Collections.reverse(arrayList);
        System.out.println(arrayList);

    }
}
