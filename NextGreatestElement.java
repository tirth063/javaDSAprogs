import java.util.Arrays;
import java.util.Stack;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] a =  {6,8,3,4,2,5};
        Stack<Integer> s = new Stack<>();


        for (int i = a.length - 1; i >= 0 ; i--) {
            int number = a[i];
            while (!s.isEmpty() && s.peek() >= a[i]){
                s.pop();
            }
            if (s.isEmpty()){
                a[i] = -1;
            } else {
                a[i] = s.peek();
            }
            s.push(number);
        }
        System.out.println(Arrays.toString(a));
    }

}
