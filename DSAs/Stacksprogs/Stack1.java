package DSAs.Stacksprogs;

import java.util.Stack;

public class Stack1 {
    private static int push(int[] stack , int top , int val){
        if(top == stack.length -1){
            System.out.println("Stack over flow!");
            return top;
        }
        stack[++top] = val;
        return top;
    }

    private static int pop(int[] stack , int top){
        if(top == -1){
            System.out.println("Stack under flow!");
            return top;
        }
        System.out.println(stack[top] + "is popped");
        return --top;
    }

    private static void printStack(int[] stack , int top){
        for (int i = top; i >= 0 ; i--) {
            System.out.print(stack[i] + " ");
        }
    }

    private static void peek(int[] stack , int top){
        System.out.print(stack[top] + " ");
    }

    private static boolean isEmpty ( int top){
        return top == -1;
    }

    private static int size( int top){
        return top+1;
    }

    public static void main(String[] args) {
        int[] stack = new int[5];
        int top = -1;

        top = push(stack , top , 10);
        top = push(stack , top , 20);
        top = push(stack , top , 30);
        top = push(stack , top , 40);
        top = push(stack , top , 10);

        System.out.println(" befour pop");
        printStack(stack,top);
        System.out.println();
        top = pop(stack ,top);
        System.out.println();
        System.out.println("after pop");
        printStack(stack ,top);
        System.out.print("\nTop element in stack is :");
        peek(stack,top);
        System.out.println();
        System.out.println("Size is :" + size(top));
        System.out.println("isEmpty? " + isEmpty(top));
        System.out.println();

    }
}

class reUseableStack {
    private char[] array;
    private int top;
    private int maxSize;

    public reUseableStack(int size) {
        maxSize = size;
        array = new char[maxSize];
        top = -1;
    }

    public void push(char c) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return;
        }
        array[++top] = c;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return '\0';
        }
        return array[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}


class Stackprog{
    private static int push(char[] stack , int top , char val){
        if(top == stack.length -1){
            System.out.println("Stack over flow!");
            return top;
        }
        stack[++top] = val;
        return top;
    }

    private static int pop(char[] stack , int top){
        System.out.print(stack[top]);
        return --top;
    }

    private static void reverseByWords(String str) {
        int top = -1;
        char[] stack = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                while (!isEmpty(top)) {
                    top = pop(stack, top);
                }
                System.out.print(" "); // print space between words
            } else {
                top = push(stack, top, str.charAt(i));
            }
        }

        // Print the remaining characters in the stack
        while (!isEmpty(top)) {
            top = pop(stack, top);
        }


    }

    //Check if string is palindrome or not using stack
    private static boolean isPalin(String str){
       Stack<Character> stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder s =new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            s.append(stack.pop());
        }
        return s.toString().equals(str);
    }

    //Delete from stack
    private static String delWord(String str, char word) {
            Stack<Character> stack = new Stack<>();
            // Push characters other than the target character into the stack
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != word) {
                    stack.push(str.charAt(i));
                }
            }
            // Pop characters from the stack to form the new string without the target character
            StringBuilder result = new StringBuilder();
            while (!stack.isEmpty()) {
                result.insert(0, stack.pop());
            }
            return result.toString();
        }


    private static boolean isEmpty ( int top){
        return top == -1;
    }

public static void main(String[] args) {
    String str = "example string";
    char word = 'a';
    String result = delWord(str, word);
    System.out.println("String after deleting '" + word + "': " + result);
}
}