package exercises.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
//        printValues(generateHashMap());
//        containsValue(generateHashMap(), "asd");
//        containsValue(generateHashMap(), "world!");
        getValueByKey(generateHashMap(), 1);
        getValueByKey(generateHashMap(), 3);
    }

    private static String getValueByKey(HashMap<Integer, String> map, int key) {
        String rs = map.getOrDefault(key, "no value for key = " + key);
        System.out.println(rs);
        return rs;
    }

    private static HashMap<Integer, String> generateHashMap() {
        HashMap<Integer, String> map = new HashMap<>();
        map.putIfAbsent(1, "hello");
        map.putIfAbsent(2, "world!");

        return map;
    }

    private static void containsValue(HashMap<Integer, String> map, String target) {
        System.out.println("is the value '" + target + "' in the map: " + map.containsValue(target));
    }

    private static void printValues(HashMap<Integer, String> map) {
        System.out.println(map.values());
        map.values().forEach(System.out::println);
    }
}
