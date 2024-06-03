package DSAs.Arraysprogs;

public class Q4s {
    public static void main(String[] args) {
        int arr[] = { 15, 18, 2, 3, 6, 12 };
        int n = arr.length,mi=0,val=18;
        if(arr[0]>arr[n-1]){
            for (int i = 0; i<n-1;i++){
                if (arr[i]>arr[i+1]){
                    mi=i+1;
                }
            }
            int left = mi,right=n-1;
            while (left<=right){
                int mid = (left+right)/2;
                if(arr[mid]==val){
                    System.out.println("present"+arr[mid]);
                    return;
                } else if (arr[mid]<val) {
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
            left= 0;right = mi-1;
            while (left<=right){
                int mid = (left+right)/2;
                if(arr[mid]==val){
                    System.out.println("present"+arr[mid]);
                    return;
                } else if (arr[mid]<val) {
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
            System.out.println("not present");
        }

    }
}
