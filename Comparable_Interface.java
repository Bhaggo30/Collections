import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{

    int id;
    String name;

    Student(int id,String name){
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return this.id-s.id;
    }
}
public class Comparable_Interface {
    public static void main(String[] args) {
        Student s1 = new Student(101,"tom");
        Student s2 = new Student(102,"jerry");
        Student s3 = new Student(103 ,"jack");
        Student s4 = new Student(101,"smith");

        Set<Student> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

         Iterator itr= set.iterator();
         while (itr.hasNext()){
             System.out.println(itr.next());
         }
    }
}
