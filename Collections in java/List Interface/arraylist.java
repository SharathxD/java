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
        // add at specific index
        al.add(0, null);
        System.out.println(al);
        //removing the elements it uses index value
        al.remove(1);
        System.out.println(al);
        //removing all from the list
        al.removeAll(al);
        System.out.println(al);
        //length
        System.out.println("Size : "+al.size());

        al.add(10);
        al.add(10);
        al.add(10);
        al.add(10);
        al.add(10);
        al.add(10);
        //accessing using for each loop
        for (Integer it : al) {
            System.out.println(it);
        }
        System.out.println(al.add(200));
}
}