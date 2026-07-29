import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapBasic {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("Vishnu",98);
        map.put("Sahil",70);
        map.put("Aditya",90);
        map.put("Bhardwaj",100);
        System.out.println(map);  // sorted lexicographically
        for(String s : map.keySet()){
            System.out.println(s+" "+map.get(s));
        }
    }
}
