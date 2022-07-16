package ss11_dsa_stack_queue.exercise.brackets;

import java.util.Scanner;

import static ss11_dsa_stack_queue.exercise.brackets.Brackets.Bracket.checkBracket;

public class BracketsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiểm tra: ");
        String string = scanner.nextLine();
        System.out.println(checkBracket(string));
    }
}
