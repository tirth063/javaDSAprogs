package Array_assignment2;

public class Rotatedandshortedarray {
    public static void main(String[] args) {
        int[] a = {4,6,8,10,12,1,2,3};
        int key =3;
        int n =a.length;
        int left = 0;
        int right = n-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (a[mid]==key) {System.out.println("present");return;}

            if(a[left] <= a[mid]){
                if(a[left]<=key && key < a[mid]){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }else {
                if(key <= a[right] && a[mid] < key){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
        }
        System.out.println("not present");
    }
}
