package ss11_dsa_stack_queue.exercise.brackets;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public class Bracket {
        public static boolean checkBracket(String string) {
            Stack<Character> characterStack = new Stack<>();

            for (int i = 0; i < string.length(); i++) {
                char item = string.charAt(i);

                if (item == '(') {
                    characterStack.push(item);
                }
                else
                if (item == ')') {
                    if (characterStack.isEmpty()) {
                        return false;
                    }

                    characterStack.pop();
                }
            }

            return characterStack.isEmpty();
        }


    }
}
