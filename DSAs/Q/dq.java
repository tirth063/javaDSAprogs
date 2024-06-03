package DSAs.Q;

public class dq {
    static int[] q = new int[5];
    static int f =-1,r=-1;

    private static void insertRare(int val){
        if(f==-1 && r==q.length-1){
            System.out.println( "queue is full");
            return;
        }
          r++;
        q[r]=val;
    }
    private static void insertFrount(int val){
        if(f==-1 && r==q.length-1){
            System.out.println( "queue is full");
            return;
        } else if (f>-1) {
            q[f]=val;
            f--;
        }else if(f==-1 && r<q.length-1){
            for (int i = r; i > f; i--) {
                q[i+1] = q[i];
            }
            r++;
            q[0]=val;
        }  
    }
    private static void deleteRare(){
        if(f==r){
            System.out.println( "queue is Empty");
            return;
        }
        System.out.println(q[r]+"Eel is poped");
        r--;
        if (f==r){
            f=-1;
            r=-1;
        }
    }
    private static int deletefrount(){
        if(f==r){
            System.out.println( "queue is empty");
            return 0;
        }
        f++;
        int temp = q[f];
        if (f==r){
            f=r=-1;
        }

        return temp;
    }
    private static void printq(){
        for (int i = f+1; i <= r; i++) {
            System.out.println(q[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Test inserting elements at the rear
        insertRare(10);
        insertRare(20);
        insertRare(30);
        insertRare(40);
        insertRare(50);
        int k=3;
        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i]=deletefrount();
        }
        printq();
        System.out.println();
        for (int i = 0; i < k; i++) {
            insertFrount(a[i]);
        }
        printq();
    }
}
