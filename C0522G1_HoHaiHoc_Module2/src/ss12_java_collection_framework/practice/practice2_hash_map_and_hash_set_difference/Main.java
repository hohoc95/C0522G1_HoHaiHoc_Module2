package ss12_java_collection_framework.practice.practice2_hash_map_and_hash_set_difference;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Acbd", 20, "HN");
        Student student2 = new Student("Cdef", 21, "QN");
        Student student3 = new Student("Efgh", 22, "TPHCM");

        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
    }
}
