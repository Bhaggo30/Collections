import java.util.Vector;

public class VectorMethods {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(10);
        v.add("java");
        v.add(4.5);
        v.add('A');
        v.add(20);
        v.add("java");

        for (int i =0; i<v.size();i++){
            System.out.println(v.get(i));
        }
        System.out.println("the size of the vector is "+v.size());
        System.out.println("the string representation of the vector is "+v.toString());
        System.out.println("the hashcode value of the vector is "+v.hashCode());
        v.remove("java");
        System.out.println("now the value is "+v.toString());
        System.out.println(v.contains(20));
        System.out.println(v.set(4,90));
        System.out.println(v.toString());
        System.out.println(v.reversed());
        System.out.println(v.subList(0,4));


    }
}
