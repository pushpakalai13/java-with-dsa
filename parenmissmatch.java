import java.util.*;

public class parenmissmatch{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    System.out.println(false);
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
