import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetBasic {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(-10);
        System.out.println(set);
        System.out.println("size: "+set.size());

        set.add(100);
        set.add(7);

        System.out.println("size: "+set.size());

        System.out.println(set);
    }
}
