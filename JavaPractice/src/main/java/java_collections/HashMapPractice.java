package java_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        for(Map.Entry<Integer, String> entry: entrySet){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }
}
