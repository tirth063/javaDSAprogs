package DSAs.Q;

import java.util.Stack;

public class trys{

    public static void main(String[] args) {
        String s= "hello";
        int[] f =new int[128];
        for (int i = 0; i < s.length(); i++) {
            f[s.charAt(i)]++;
        }
        for (int i = 0; i < f.length; i++) {
            if(f[i] > 0){
                System.out.println((char) i + " " + f[i]);
            }
        }
        s="{([])}";
        Stack<Character> stack =new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case '{':
                case '(':
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case '}':
                    if (stack.isEmpty() || stack.peek() != '{') {
                        System.out.println("not balanced");
                        return;
                    }
                default:
                    throw new IllegalStateException("Unexpected value: " + s.charAt(i));
            }
        }
        System.out.println("Balanced");
    }

}
class MyQueue {
    Stack<Integer> stack = new Stack<>();
    private int[] array;
    private int top;
    private int maxSize;
    public MyQueue() {
        maxSize = 100;
        array = new int[maxSize];
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return;
        }
        array[++top] = x;
    }

    public int pop() {
        if (empty()) {
            System.out.println("Stack underflow");
            return '\0';
        }
        while(!empty()){
            stack.push(array[top--]);
        }
        int temp = stack.peek();
        while(!stack.isEmpty()){
            array[++top] = stack.pop();
        }
        return temp;
    }

    public int peek() {
        if (empty()) {
            System.out.println("Stack underflow");
            return '\0';
        }
        return array[top];
    }

    public boolean empty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (!isBOP(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return stack.pop();
    }
    private static boolean isBOP(String str) {
       return str.equals("*") || str.equals("+") || str.equals("-") || str.equals("/");
    }
}