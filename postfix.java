import java.util.*;

public class postfix {
    public static void main(String[] args) {

        String exp = "23+5*";

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }
            else {

                int b = stack.pop();
                int a = stack.pop();

                if (ch == '+')
                    stack.push(a + b);

                else if (ch == '-')
                    stack.push(a - b);

                else if (ch == '*')
                    stack.push(a * b);

                else if (ch == '/')
                    stack.push(a / b);
            }
        }

        System.out.println("Result = " + stack.pop());
    }
}
