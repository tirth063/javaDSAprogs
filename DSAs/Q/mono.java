package DSAs.Q;

import Assignment_3.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class mono {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 5, 6, 1};
        int i,j;
        for(i=0; i<arr.length; i++){
            boolean flage = true;
            for(j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    flage = false;
                    break;
                }
            }
            if(flage==false){
                for(int k=i; k<j; j++)
                    arr[i] = arr[j];
                i = j;
            }
            else{
                arr[i]=-1;
            }
        }
        System.out.println(Arrays.toString(arr));
//        Stack<Integer> st = new Stack<>();
//        for(int i= arr.length-1; i>=0; i--){
//            st.push(arr[i]);
//        }
//        for(int i= arr.length-1; i>=0; i--){
//            int temp = arr[i];
//            while(!st.isEmpty()&&arr[i]>=st.peek()){
//                st.pop();
//            }
//            if(st.isEmpty()){
//                arr[i]=-1;
//            }
//            else{
//                arr[i] = st.peek();
//            }
//            st.push(temp);
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
