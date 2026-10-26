import java.util.Stack;
import java.util.Scanner;

public class Parentheses {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String brackets = input.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean balanced = true;

        for (char c : brackets.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }

                char open = stack.pop();

                if (c == ')' && open != '(' ||
                        c == ']' && open != '[' ||
                        c == '}' && open != '{') {

                    balanced = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            balanced = false;
        }

        System.out.println(balanced);
    }
}
