package ss8_clean_code_and_refactoring.practice.practice1;

public class Calculator {
    public static int calculate(int firstOperant, int secondOpetant, char operator) {
        switch (operator) {
            case '+':
                return firstOperant + secondOpetant;
            case '-':
                return firstOperant - secondOpetant;
            case '*':
                return firstOperant * secondOpetant;
            case '/':
                if (secondOpetant != 0)
                    return firstOperant / secondOpetant;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
