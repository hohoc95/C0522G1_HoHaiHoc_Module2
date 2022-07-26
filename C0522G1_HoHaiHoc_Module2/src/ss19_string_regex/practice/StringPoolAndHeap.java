package ss19_string_regex.practice;

public class StringPoolAndHeap {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "a";
        s2 += "bc";

        boolean b = s1.equals(s2);
        System.out.println(b);

        boolean b1 = s1 == s2;
        System.out.println(b1);

    }
}