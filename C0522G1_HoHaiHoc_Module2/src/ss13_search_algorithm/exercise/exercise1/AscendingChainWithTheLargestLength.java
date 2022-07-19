package ss13_search_algorithm.exercise.exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class AscendingChainWithTheLargestLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String string = scanner.nextLine();

        ArrayList<Character> max = new ArrayList<>();

        ArrayList<Character> list ;

        for (int i = 0; i < string.length(); i ++){
            list = new ArrayList<>();

            list.add(string.charAt(i));

            for (int j = i + 1; j < string.length(); j++ ){
                if(string.charAt(j) > list.get(list.size() -1)){
                    list.add(string.charAt(j));
                }
            }
            if (list.size() < max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character character: max) {
            System.out.print(character);
        }
        System.out.println();
    }
}
