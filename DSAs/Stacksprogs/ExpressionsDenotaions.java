package DSAs.Stacksprogs;
import java.util.Stack;
public class ExpressionsDenotaions {
    public static void main(String[] args) {

    }

}

class InfixToPrefix {
    static int precedence(char c) {
        return switch (c) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    static String infixToPrefix(String infix) {
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String reversedInfix = new StringBuilder(infix).reverse().toString();

        for (int i = 0; i < reversedInfix.length(); i++) {
            char c = reversedInfix.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                prefix.append(c);
            } else if (c == ')') {
                stack.push(c);
            } else if (c == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix.append(stack.pop());
                }
                stack.pop(); // Discard the '('
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    prefix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }

        return prefix.reverse().toString();
    }

    public static void main(String[] args) {
        String infix = "(a+b)*c-d/e"; // Example infix expression
        String prefix = infixToPrefix(infix);
        System.out.println("Prefix expression: " + prefix);
    }
}

class PrefixToInfix {
    // Function to check if a character is an operator
    static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }

    // Function to convert prefix expression to infix expression
    static String prefixToInfix(String prefix) {
        Stack<String> stack = new Stack<>();

        // Traverse the prefix expression from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);

            // If the character is an operator, pop two operands from stack
            if (isOperator(c)) {
                String operand1 = stack.pop();
                String operand2 = stack.pop();

                // Construct the infix expression and push it back to stack
                String infix = "(" + operand1 + c + operand2 + ")";
                stack.push(infix);
            } else {
                // If the character is an operand, push it to stack
                stack.push(Character.toString(c));
            }
        }
        // The stack will contain the final infix expression
        return stack.pop();
    }

    public static void main(String[] args) {
        String prefix = "*+AB-CD"; // Example prefix expression
        String infix = prefixToInfix(prefix);
        System.out.println("Infix expression: " + infix);

    }
}


class InfixToPostfix {
    static int precedence(char c) {
        return switch (c) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Discard the '('
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        String infix = "(a+b)*c-d/e"; // Example infix expression
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix expression: " + postfix);
    }
}

class PostfixToInfix {
    // Function to check if a character is an operand
    static boolean isOperand(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    // Function to convert postfix expression to infix expression
    static String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();

        // Traverse the postfix expression from left to right
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            // If the character is an operand, push it onto the stack
            if (isOperand(c)) {
                stack.push(Character.toString(c));
            } else {
                // If the character is an operator, pop two operands from stack
                String operand2 = stack.pop();
                String operand1 = stack.pop();

                // Construct the infix expression and push it back to stack
                String infix = "(" + operand1 + c + operand2 + ")";
                stack.push(infix);
            }
        }
        // The stack will contain the final infix expression
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "ab+c-"; // Example postfix expression
        String infix = postfixToInfix(postfix);
        System.out.println("Infix expression: " + infix);
    }
}


class PostfixToPrefix {
    // Function to check if a character is an operand
    static boolean isOperand(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    // Function to convert postfix expression to prefix expression
    static String postfixToPrefix(String postfix) {
        Stack<String> stack = new Stack<>();

        // Traverse the postfix expression from left to right
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            // If the character is an operand, push it onto the stack
            if (isOperand(c)) {
                stack.push(Character.toString(c));
            } else {
                // If the character is an operator, pop two operands from stack
                String operand2 = stack.pop();
                String operand1 = stack.pop();

                // Construct the prefix expression and push it back to stack
                String prefix = c + operand1 + operand2;
                stack.push(prefix);
            }
        }
        // The stack will contain the final prefix expression
        return stack.pop();
    }



    public static void main(String[] args) {
        String postfix = "ab+c-"; // Example postfix expression
        String prefix = postfixToPrefix(postfix);
        System.out.println("Prefix expression: " + prefix);
    }
}

class PrefixToPostfix {
    // Function to check if a character is an operand
    static boolean isOperand(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    // Function to convert prefix expression to postfix expression
    static String prefixToPostfix(String prefix) {
        Stack<String> stack = new Stack<>();

        // Traverse the prefix expression from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);

            // If the character is an operand, push it onto the stack
            if (isOperand(c)) {
                stack.push(Character.toString(c));
            } else {
                // If the character is an operator, pop two operands from stack
                String operand1 = stack.pop();
                String operand2 = stack.pop();

                // Construct the postfix expression and push it back to stack
                String postfix = operand1 + operand2 + c;
                stack.push(postfix);
            }
        }
        // The stack will contain the final postfix expression
        return stack.pop();
    }

    public static void main(String[] args) {
        String prefix = "*+AB-CD"; // Example prefix expression
        String postfix = prefixToPostfix(prefix);
        System.out.println("Postfix expression: " + postfix);
    }
}


