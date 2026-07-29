import java.util.HashSet;

public class AddSameInSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(50);
        set.add(50);
        set.add(50);
        set.add(50);
        set.add(50);
        set.add(50);
        for(int ele : set){
            System.out.print(ele+" ");
        }

        set.clear();

        System.out.println(set);
    }
}
