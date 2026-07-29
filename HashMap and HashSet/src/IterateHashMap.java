import java.util.HashMap;

public class IterateHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Vishnu",98);
        map.put("Ram",70);
        map.put("Aditya",90);
        map.put("Bhardwaj",100);

        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key+" "+val);
        }

        // entrySet()---> return set of object containing both key and value
        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
