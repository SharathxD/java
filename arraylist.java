import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        //add an element;
        al.add(10);
        System.out.println(al);
        al.add(20);
        al.add(69);
        System.out.println(al);
        // can add null to arraylist
        al.add(null);
        System.out.println(al);
    }
}
