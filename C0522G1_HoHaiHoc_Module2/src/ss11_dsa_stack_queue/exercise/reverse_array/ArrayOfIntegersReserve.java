package ss11_dsa_stack_queue.exercise.reverse_array;

import java.util.Scanner;
import java.util.Stack;

public class ArrayOfIntegersReserve {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
//            System.out.print("array[" + i + "]"+ " = " );
            System.out.printf("array[%d] = ", i);
            stack.push(scanner.nextInt());
        }

        System.out.println("Trước khi đảo ngược: array = " + stack);

        Stack<Integer> arrayReverse = new Stack<>();

        while(!stack.isEmpty()) {
            arrayReverse.push(stack.pop());
        }

        for (int item : arrayReverse) {
            stack.push(item);
        }

        System.out.println("Sau khi đảo ngược: array = " + stack);
    }
}