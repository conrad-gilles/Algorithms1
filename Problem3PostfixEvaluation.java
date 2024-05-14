package HW2;

import java.util.Stack;

public class Problem3PostfixEvaluation {

    public static void main(String[] args) {
        String str = "231*+9-";
        int res = checkPost(str);
        System.out.println("Result-> " + res);
}
    public static int checkPost(String str) {
        Stack<Integer> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else if (operator(c)) {
                int a = stack.pop();
                int b = stack.pop();
                int res = doOperation(c, b, a);
                stack.push(res);
            }
        }

    return stack.pop();
}
public static boolean operator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
}

    public static int doOperation(char value, int a, int b) {
    switch (value) {
            case '+':
            return a + b;
            case '-':
            return a - b;
            case '*':
            return a * b;
            case '/':
            if (b == 0)
            return a / b;
            default:
            throw new IllegalArgumentException("something whent wrong");
        }
    }
}
