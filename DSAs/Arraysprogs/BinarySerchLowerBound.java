package DSAs.Arraysprogs;

public class BinarySerchLowerBound {
        public static int lowerBound(int []arr, int n, int x) {
            int low = 0, high = n - 1;
            int ans = n;

            while (low <= high) {
                int mid = (low + high) / 2;
                // maybe an answer
                if (arr[mid] >= x) {
                    ans = mid;
                    //look for smaller index on the left
                    high = mid - 1;
                } else {
                    low = mid + 1; // look on the right
                }
            }
            return ans;
        }

    public static int upperBound(int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] > x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

        public static void main(String[] args) {
            int[] arr = {3, 5,8,8,8,8,8,8,8,8,15, 19};
            int n = arr.length, x = 8;
            int ind = lowerBound(arr, n, x);
            System.out.println("The lower bound is the index: " + ind);
            ind = upperBound(arr, x, n);
            System.out.println("The upper bound is the index: " + (ind-1));
        }


}
