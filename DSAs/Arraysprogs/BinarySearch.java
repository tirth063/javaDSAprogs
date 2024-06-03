package DSAs.Arraysprogs;

//only work in sorted data

public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int n = nums.length; //size of the array.
        int low = 0, high = n - 1;

        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    private static int recursiveBinarySearch(int[] nums, int target, int low, int high) {
        if (low > high) {
            return -1; // Element not found
        }

        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            return mid; // Element found at mid
        } else if (nums[mid] < target) {
            return recursiveBinarySearch(nums, target, mid + 1, high);
        } else {
            return recursiveBinarySearch(nums, target, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int n = a.length; //size of the array.
        int low = 0, high = n - 1;
        int ind = binarySearch(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);

        ind = recursiveBinarySearch(a,target,low,high);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);

    }
}
