import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
       // works on first constructor principle
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);

        System.out.println("element of the linkedlist in the indexd of 2 is "+list.get(2));
        System.out.println("size of the linked list is "+list.size());
        System.out.println(list.contains(20));
        System.out.println(list.reversed());
        // some deque methods
        System.out.println("give the element of the first index position is "+list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(20));
        list.remove(2);
        System.out.println("all the elements present in list is "+list);
        System.out.println(list.set(3,50));
        System.out.println(list);
        // works on second constructor principle
        LinkedList list1 = new LinkedList();
        list1.add(90);
        list1.add(80);
        System.out.println(list1);
        System.out.println(list1.addAll(list));
        System.out.println("---------------");
        // works on third constructor
        LinkedList list2 = new LinkedList(list1);
        System.out.println(list2);

    }
}
