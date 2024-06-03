package DSAs.Stacksprogs;

import java.util.Stack;


public class stackQustions {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public stackQustions() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        int poppedValue = stack.pop();
        if (poppedValue == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) return -1;
        return minStack.peek();
    }

    public static void main(String[] args) {
            stackQustions s =new stackQustions();
            s.push(10);
            s.push(8);
        System.out.println(s.getMin());
            s.push(7);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
    }
}

class sq{
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String s = "abbaca";
        String sa = new String();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty() || st.peek() != s.charAt(i)){
                st.push(s.charAt(i));
            } else if (st.peek() == s.charAt(i)) {
               sa += st.pop();
            }
        }
        System.out.println(st);
    }

}

class BalancedExpressionChecker {
    public static void main(String[] args) {
        String s = "{[([{<>}])]}";
        System.out.println(isBalanced(s) ? "Expression is balanced" : "Expression is not balanced");
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                case '<':
                    stack.push(ch);
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '>':
                    if (stack.isEmpty() || stack.pop() != '<') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}


class twoStack{
    static int[] stack = new int[5];
    static int top = -1;
    static int top2 = stack.length;
    public static void push1(int val){
        if (top2 - top > 1)
            stack[++top] = val;
    }
    public static void push2(int val){
        if (top2 - top > 1)
            stack[--top2] = val;
    }
    public static int pop1(){
        if (top > -1)
           return stack[top--];
        else
            return -1;
    }
    public static int pop2(){
        if (top2 < stack.length)
            return stack[top2++];
        else
            return -1;
    }

    public static void main(String[] args) {

        for (int i = 10; i <= 60; i+=20) {
            push1(i);
            push2(i+10);
        }
        int x=0;
        while (x != -1){
            x = pop1();
            System.out.println(x);
        }
        x=0;
        while (x != -1){
            x = pop2();
            System.out.println(x);
        }

    }
}


class Solution {
    public void finalPrices(int[] prices) {

        Stack<Integer> stack = new Stack<>();

        for (int i=prices.length-1; i>=0; i--) {
            while (!stack.isEmpty() && stack.peek() > prices[i]) {

                stack.pop();
            }
            int price = prices[i];

            if (!stack.isEmpty()) {

                prices[i] = prices[i] - stack.peek();
            }

            stack.push(price);
        }

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.finalPrices(new int[] {8,4,6,2,3});
    }


}

