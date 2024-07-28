import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class KeySetMethod {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(101,"apple");
        map.put(102,"banana");
        map.put(103,"orange");
        map.put(101,"mango");
        map.put(102,"grapes");
         Set <Integer> keyset= map.keySet();
        for (int key :keyset){
            System.out.println("key of the fruit is "+key + " and the value is "+map.get(key));
        }
    }
}
