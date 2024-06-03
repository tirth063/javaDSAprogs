package DSAs.Stacksprogs;

import java.util.Stack;

/*public void main() {
    String infix = pti.prefixToInfix("*+AB-CD");
    System.out.println("Infix expression: " + infix);
    String postfix = poti.posfixToInfix("ab+c-");
    System.out.println("Infix expression: " + postfix);
    System.out.println("postfix expression: "+ ptp.prefixToposfix("*+AB-CD"));
    System.out.println("pretfix expression: "+ ptp.posfixToprefix("ab+c-"));

}*/

//Prefix to Infix Conversion
class pti{
    public  static String prefixToInfix(String prefix){
        Stack<String> s = new Stack<>();
        for (int i = prefix.length()-1; i >=0 ; i--) {
            char c = prefix.charAt(i);
            if (isOperator(c)) {
                String operand1 = s.pop();
                String operand2 = s.pop();

                String infix = "(" + operand1 + c + operand2 + ")";

                s.push(infix);

            }else {
                s.push(String.valueOf(c));
            }
        }

        return s.pop();
    }

    public static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }
}
//Postfix to Infix Conversion
class poti{
    public  static String posfixToInfix(String posfix){
        Stack<String> s = new Stack<>();
        for (int i = 0; i<posfix.length() ; i++) {
            char c = posfix.charAt(i);
            if (isOperator(c)) {
                String operand1 = s.pop();
                String operand2 = s.pop();

                String infix = "(" + operand2 + c + operand1 + ")";

                s.push(infix);
            }else {
                s.push(String.valueOf(c));
            }
        }

        return s.pop();
    }

    public static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }
}
//Prefix to Postfix Conversion
//Postfix to Prefix Conversion
class ptp{
    public  static String prefixToposfix(String prefix){
        Stack<String> s = new Stack<>();
        for (int i = prefix.length()-1; i >=0 ; i--) {
            char c = prefix.charAt(i);
            if (isOperator(c)) {
                String operand1 = s.pop();
                String operand2 = s.pop();

                String postfix = "(" + operand1 + operand2 + c + ")";

                s.push(postfix);

            }else {
                s.push(String.valueOf(c));
            }
        }

        return s.pop();
    }
    public  static String posfixToprefix(String posfix){
        Stack<String> s = new Stack<>();
        for (int i = 0; i<posfix.length() ; i++) {
            char c = posfix.charAt(i);
            if (isOperator(c)) {
                String operand1 = s.pop();
                String operand2 = s.pop();

                String infix = "("+c + operand2 +operand1+")";

                s.push(infix);

            }else {
                s.push(String.valueOf(c));
            }
        }

        return s.pop();
    }
    public static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }
}
