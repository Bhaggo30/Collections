import java.util.HashMap;
import java.util.Map;

public class MapCollectionMethods {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"java");
        map.put(102,"sql");
        map.put(103,"javascript");

        System.out.println(map);
        System.out.println(map.get(10));
        System.out.println(map.containsKey(101));
        System.out.println(map.containsValue("java"));
        System.out.println(map.size());
        System.out.println(map);
        map.remove(103);
        System.out.println(map);
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());
    }
}
