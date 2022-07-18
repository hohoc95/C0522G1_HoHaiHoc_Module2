package ss12_java_collection_framework.practice.practice1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("A", 20);
        hashMap.put("B", 21);
        hashMap.put("C", 22);
        hashMap.put("D", 23);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");


        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        treeMap.put("A", 20);
        treeMap.put("B", 21);
        treeMap.put("C", 22);
        treeMap.put("D", 23);

        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap + "\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("A", 20);
        linkedHashMap.put("B", 21);
        linkedHashMap.put("C", 22);
        linkedHashMap.put("D", 23);

        System.out.println("Display entries in ascending order of key");
        System.out.println(linkedHashMap + "\n");
    }

}
