import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Employee{
    int id;
    String name;

    public Employee(int id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class EmployeeById implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.id ,o2.id);
        // return o1.id - o2.id;
    }
}
public class Comparator_Interface {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101);
        Employee emp2 = new Employee(102);
        Employee emp3 = new Employee(101);

        Set<Employee> set = new TreeSet<>(new EmployeeById());
        set.add(emp1);
        set.add(emp2);
        set.add(emp3);
        Iterator itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
