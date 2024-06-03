package DSAs.Arraysprogs;

public class Binarysearchformatrix {
    public static void main(String[] args) {
        int[][] a  = {
                {1,2,3,4},{5,6,7,8,
        },{9,10,11,12},{13,14,15,16}
        };
        int row = a.length,col=a[0].length;
        int fr = 0 ,lr =  col-1;
        int ri = -1,val=15;
        while (fr<=lr){
            int mid = (fr + lr) /2;
            if(a[mid][0] <= val && val <= a[mid][col-1]){
                ri = mid;
                break;
            } else if (val > a[mid][col-1]) {
                fr = mid+1;
            }else {
                lr = mid-1;
            }
        }
        if (ri == -1){
            System.out.println("not present");
            return;
        }

        int l = 0,r=col-1;
        while (l<=r){
            int mid = (l + r ) /2;
            if(a[ri][mid] == val){
                System.out.println("present ");
                return;
            } else if (val > a[ri][mid]) {
                    l = mid+1;
            }else {
                r = mid -1;
            }
        }
        System.out.println("not present");

    }
}

