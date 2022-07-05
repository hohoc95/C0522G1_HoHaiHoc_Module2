package ss3_ArraysAndMethodsInJava.exercise;

import java.util.Scanner;

public class CharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập chuỗi
        System.out.print("Nhập vào 1 chuỗi");
        String inputString = scanner.nextLine();

        System.out.print("Nhập vào 1 ký tự:");
        char inputChar = scanner.nextLine().charAt(0);

        int count =0;
        for(int i = 0; i < inputString.length(); i++){
            if( inputChar == inputString.charAt(i)){
                count++;
            }
        }
        System.out.print("Số lần xuất hiện của ký tự vừa nhập là: " + count);


    }
}
