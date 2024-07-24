import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(2.0);
        al.add("java");
        al.add("programming");
        al.add(null);
       // some method arraylist class
        System.out.println(al);
        System.out.println(al.get(1));
        System.out.println(al.size());
        System.out.println(al.contains("java"));
        System.out.println(al.isEmpty());
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        al.clear();
        System.out.println(al);
        System.out.println("============");

        // traverse the arraylist of elemnt using iterator
        al.add("java");
        al.add("sql");
        al.add("springboot");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            String ele = itr.next();
            System.out.println(ele);
        }
        int hashcode=al.hashCode();
        System.out.println("hashcode of an array "+hashcode);
        al.add(100);
        al.add(200);

        Object[] array=al.toArray();
        for (Object arr : array){
            System.out.println(arr);
        }
        
    }
}
