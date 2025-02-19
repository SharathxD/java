import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        //addFirst()
        ll.addFirst(20);
        ll.add(30);
        ll.addFirst(10);
        System.out.println(ll);
        //addLast()
        ll.addLast(100);
        ll.addLast(200);
        System.out.println("LL :" +ll);
        LinkedList<Integer> lll=new LinkedList<>();
        //addAll()
        lll.addAll(ll);
        System.out.println("LLL : "+lll);
        //getFirst() & getLast() for getting elements
        System.out.println("First ele in LL "+ll.getFirst());
        System.out.println("Last ele in LLL "+lll.getLast());
        System.out.println("Class of this DataType is : "+ll.getClass());
        //removing elements using removeFirst() & removeLast();
        ll.removeFirst();
        ll.removeLast();
        // other removes also there 
        //removes the first occurrence
        lll.removeFirstOccurrence(10);
        //removes last occurrence
        lll.removeLastOccurrence(20);


    }
}
