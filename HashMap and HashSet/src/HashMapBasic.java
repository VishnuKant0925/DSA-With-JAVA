import java.util.HashMap;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Vishnu",98);
        map.put("Sahil",70);
        map.put("Aditya",90);
        map.put("Bhardwaj",100);

        System.out.println(map); // printing of map

        System.out.println(map.containsKey("Sahil"));  // searching using key

        System.out.println(map.containsValue(100)); // searching using value

        map.put("Vishnu" ,100);
        System.out.println(map+" "+map.size());
        map.put("Raghav", 89);
        System.out.println(map+" "+map.size());

        map.remove("Raghav");
        System.out.println(map+" "+map.size());

    }
}
