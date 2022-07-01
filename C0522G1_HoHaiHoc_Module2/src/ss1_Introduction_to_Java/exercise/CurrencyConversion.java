package ss1_Introduction_to_Java.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        double dollar;

        System.out.print("Nhập vào USD: ");
        dollar = scanner.nextDouble();

        System.out.print("VND: " + dollar * rate + " đồng");
    }
}
