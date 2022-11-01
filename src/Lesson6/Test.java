package Lesson6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<String, String> translotions = new HashMap<>();

        translotions.put("кошка", "cat");
        translotions.put("собака", "dog");
        translotions.put("слон", "elephant");

        for (Map.Entry entry : translotions.entrySet()) {
            System.out.println(entry.getKey() + " : " +entry.getValue());
        }

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linckedHasMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(25, "Gleb");
        map.put(7, "Tim");
        map.put(99, " Serge");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
