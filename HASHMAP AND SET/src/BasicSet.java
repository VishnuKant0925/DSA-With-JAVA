import java.util.HashSet;

public class BasicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //insert :-- TC=O(1)
        set.add(10);
        set.add(20);
        set.add(-10);

        System.out.println("size: "+set.size());

        set.add(100);
        set.add(7);

        System.out.println("size: "+set.size());

        System.out.println(set);
        // searching :-- return true or false (TC = O(1) )
        System.out.println( set.contains(100));
        System.out.println( set.contains(200));

        set.remove(-10);
        System.out.println("size: "+set.size());

        System.out.println(set);
    }
}
