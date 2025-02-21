import java.util.*;
class hashset{
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        // add element
        hs.add(10);
        hs.add(20);
        System.out.println(hs);
        // size of the set
        System.out.println(hs.size());
        // isEmpty()
        System.out.println(hs.isEmpty());
        //clear() to clear the set
        hs.clear();
        System.out.println(hs);
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        // contains returns true or false
        System.out.println(hs.contains(120));
    }
}