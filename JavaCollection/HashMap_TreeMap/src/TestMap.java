import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashmap = new HashMap<>();
        hashmap.put("An",25);
        hashmap.put("Huy",32);
        hashmap.put("Hoang",31);
        hashmap.put("Mai",24);
        hashmap.put("Hoa",26);
        System.out.println("Display entries in HashMap");
        System.out.println(hashmap );
        Map<String,Integer> treeMap = new TreeMap<>(hashmap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John", 30);
        customers.put("Mike", 28);
        customers.put("Bill", 32);
        customers.put("Maria", 27);

        Set<String> keys = customers.keySet();
        for (String key: keys){
            System.out.println("Key: " + key + ": " + customers.get(key));
        }
    }
}
