import java.util.ArrayList;

public class OnlyStoreHomogenousObject {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("tom");
        al.add(20);
        al.add('a');
        al.add(8.9);
        al.add(10);
        al.add(20);

        for (Object obj :al){
            if (obj instanceof Integer){
                System.out.println(obj);
            }
        }
    }
}
