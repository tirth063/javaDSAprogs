package DSAs.Q;

import java.util.*;

public class ReplaceWithNextGreatest {

    public static int[] replaceWithNextGreatest(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from stack smaller than or equal to current element
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            // If stack is empty, there's no greater element
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Push current element onto stack
            stack.push(nums[i]);
        }

        // Replace elements with the next greatest
        for (int i = 0; i < n; i++) {
            int nextGreatest = result[i];
            if (nextGreatest == -1) {
                // If no next greatest found, replace with -1
                result[i] = -1;
            } else {
                // Replace with next greatest
                while (i < n && result[i] != -1) {
                    result[i] = nextGreatest;
                    i++;
                }
                i--; // Move back one step because the loop will increment i
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 5, 6, 1};
        int[] expectedOutput = replaceWithNextGreatest(arr);

        System.out.println("Expected Output:");
        for (int num : expectedOutput) {
            System.out.print(num + " ");
        }
    }
}
