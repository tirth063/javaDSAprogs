package DSAs.Stacksprogs;

import java.util.Stack;

public class StackWithMin {
    private Stack<Integer> stack = new Stack<>();
    private int min = Integer.MAX_VALUE;

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            min = val;
        } else {
            if (val < min) {
                stack.push(2 * val - min); // Push altered value to stack
                min = val; // Update the new minimum
            } else {
                stack.push(val);
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        if (top < min) {
            min = 2 * min - top; // Restore previous minimum
        }
    }

    public int top() {
        int top = stack.peek();
        if (top < min) {
            return min;
        } else {
            return top;
        }
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        StackWithMin minStack = new StackWithMin();
        minStack.push(5);
        minStack.push(2);
        minStack.push(10);
        System.out.println("Minimum: " + minStack.getMin()); // Should print 2
        minStack.pop();
        System.out.println("Top: " + minStack.top()); // Should print 5
        System.out.println("Minimum: " + minStack.getMin()); // Should print 5
    }
}