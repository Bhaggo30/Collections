import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

abstract class Employeee implements Comparable<Employeee> {
    int id;

    Employeee(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employeee{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employeee o) {
        return this.id - o.id;
    }
}

class SortEmployee extends Employeee {

    SortEmployee(int id) {
        super(id);
    }
}

public class ComparableWithTreeMap {
    public static void main(String[] args) {
        Map<SortEmployee, String> map = new TreeMap<>();
        map.put(new SortEmployee(200), "jack");
        map.put(new SortEmployee(300), "john");
        map.put(new SortEmployee(101), "smith");
        map.put(new SortEmployee(101), "alex");

        Set<SortEmployee> keyset = map.keySet();
        for (SortEmployee emp : keyset) {
            System.out.println(emp + " name: " + map.get(emp));
        }
    }
}
