package DSAs.Q;

public class Qprogs {
}
class SimpleQueue {
    static int[] q = new int[5];
    static int f = -1;
    static int r = -1;
    static boolean isFull() {
        if (f == 0 && r == q.length - 1) {
            return true;
        }
        return false;

    }

    static boolean isEmpty() {
        return f == -1;
    }

    static void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        r++;
        q[r] = val;
    }

    static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        f++;
    }
}

class DqQueue{
    static int[] q = new int[5];
    static int f=-1,r=-1;

    static void addLast(int val){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        q[++r] = val;
    }
    static void addFirst(int val){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        } else if (f>-1) {
            q[f--] = val;
        }else {
            for (int i = r ; i > f;i--) {
                q[i+1] = q[i];
            }
            ++r;
            q[0] = val;
        }
    }

    static void pollFirst(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        f++;
        System.out.println(q[f] + "Is Deleted");

    }

    static void pollLast(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(q[r] + "Is Deleted");
        r--;
    }

    private static boolean isFull() {
        return f==-1 && r == q.length-1;
    }

    private static boolean isEmpty(){
        return f==r;
    }

    private static void printq(){

            for (int i = f+1; i <= r; i++) {
                System.out.println(q[i] + " ");
            }
    }

    private static void getSize(){
        System.out.println(r-f);
    }

    public static void main(String[] args) {
        addFirst(10);
        addFirst(20);
        addFirst(30);
        addLast(40);
        addLast(50);
        addLast(60);
        getSize();
        printq();
        System.out.println();
        pollFirst();
        pollLast();
        getSize();
        printq();
    }
}

class CircularQueue{
    static int[] q = new int[5];
    static int f=-1,r=-1;

    private static boolean isFull(){
        return ((f==0 && r==q.length-1) || (f==r+1));
    }

    private static boolean isEmpty(){
        return f==-1;
    }


    public static void enQueue(int val){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }else {
            if (f==-1) f=0;
            r=(r+1)%q.length;
            q[r]=val;
        }
    }

    public static void deQueue(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }else {
            if (f==r){
                f=r=-1;
            }else{
                System.out.println(q[f] + "Is Deleted");
                f=(f+1)%q.length;
            }
        }
    }

    public static void printq(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = f; i != r; i=(i+1)%q.length) {
            System.out.println(q[i] + " ");
        }
        System.out.println(q[r]);
    }

    public static int getSize(){
        if (isEmpty()) {
            return 0;
        } else if (r >= f) {
            return r - f + 1;
        } else {
            return q.length - f + r + 1;
        }
    }
    public static void main(String[] args) {
        enQueue(10);
        enQueue(20);
        enQueue(30);
        enQueue(40);
        enQueue(50);
        enQueue(60);
        printq();
        System.out.println();
        deQueue();
        deQueue();
        printq();
    }
}