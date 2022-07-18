package ss11_dsa_stack_queue.exercise.count_word;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String string = scanner.nextLine();

        String[] array = string.toLowerCase().split(" ");

        for (String key : array) {
            if (!treeMap.containsKey(key)) {
                treeMap.put(key, 1);
            } else {
                int count = treeMap.get(key);
                treeMap.put(key, count + 1);
            }
        }

        System.out.println(treeMap);

        Set<String> stringSet = treeMap.keySet();
        System.out.print("\nSố lần xuất hiện của mỗi từ trong chuỗi là: ");
        for (String key : stringSet) {
            System.out.print(key + ": " + treeMap.get(key));
        }
    }
}