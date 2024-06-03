package DSAs.Q;// Circular DSAs.Q.Queue implementation in Java

class CQueue {
    int SIZE = 5; // Size of Circular DSAs.Q.Queue
    int front, rear;
    int[] items = new int[SIZE];

    CQueue() {
        front = -1;
        rear = -1;
    }

    // Check if the queue is full
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    // Check if the queue is empty
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Adding an element
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("DSAs.Q.Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % SIZE;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    // Removing an element
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("DSAs.Q.Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* DSAs.Q has only one element, so we reset the queue after deleting it. */
            else {
                front = (front + 1) % SIZE;
            }
            return (element);
        }
    }

    int getSize() {
        if (isEmpty()) {
            return 0;
        } else if (rear >= front) {
            return rear - front + 1;
        } else {
            return SIZE - front + rear + 1;
        }
    }

    void display() {
        /* Function to display status of Circular DSAs.Q.Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty DSAs.Q.Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % SIZE)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            System.out.println("Rear -> " + rear);
        }
    }



    public static void main(String[] args) {

        CQueue q = new CQueue();

        // Fails because front = -1
        q.deQueue();

        //make DSAs.Q [1|2|3|4|5]
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // Fails to enqueue because front == 0 && rear == SIZE - 1
        q.enQueue(6);

        System.out.println("DSAs.Q.Queue SIZE is " + q.getSize());

        q.display();

        int elem = q.deQueue();

        if (elem != -1) {
            System.out.println("Deleted Element is " + elem);
        }
        q.display();

        q.enQueue(7);

        q.display();

        // Fails to enqueue because front == rear + 1
        q.enQueue(8);
    }


}

/*public class dcq {
    static int[] q = new int[5];
    static int f =-1,r=-1,size=0;
     static boolean isFull() {
        if (f == 0 && r == q.length - 1) {
            return true;
        }
        if (f == r + 1) {
            return true;
        }
        return false;
    }

    // Check if the queue is empty
    boolean isEmpty() {
        return f == -1;
    }
    private static void enqueue(int val){
        if (isFull()){
            System.out.println("DSAs.Q.Queue is full");
            return;
        }
        if (f==-1) f=0;
        r = (r + 1) % q.length;
        q[r] = val;
        size++;
    }
    private static void printqueue(){
        if (f <= r) {
            for (int i = f; i <= r; i++) {
                System.out.print(q[i] + " ");
            }
        } else {
            for (int i = f; i < q.length; i++) {
                System.out.print(q[i] + " ");
            }
            for (int i = 0; i <= r; i++) {
                System.out.print(q[i] + " ");
            }
        }
        System.out.println();

    }

    private static void dequeue(){
        if (f==-1){
            System.out.println("DSAs.Q.Queue is empty");
            return;
        }
        int removedElement = q[f];
        if (f == r) {
            f = r = -1;
        } else {
            f = (f + 1) % q.length;
        }
        size--;
        System.out.println("Removed element: " + removedElement);
    }

    public static void main(String[] args) {
    // Test enqueue on full queue
    enqueue(1);
    enqueue(2);
    enqueue(3);
    enqueue(4);
    enqueue(5);
    enqueue(6); // This should trigger "queue is full"
        System.out.println("1");
    // Test dequeue on empty queue
    dequeue(); // 1
    dequeue(); // 2
    dequeue(); // 3
    dequeue(); // 4
    dequeue(); // 5
    dequeue(); // This should now trigger "DSAs.Q.Queue is empty"
        System.out.println("2");
    // Test wrap-around functionality
    enqueue(7);
    enqueue(8);
    enqueue(9);
    dequeue(); // 7
    dequeue(); // 8
    enqueue(10);
    enqueue(11);
    printqueue(); // Should print 9, 10, 11
        System.out.println("3");
    // Continuous enqueue and dequeue
    dequeue(); // 9
    dequeue(); // 10
    enqueue(12);
    enqueue(13);
        System.out.println("4");
    enqueue(14);
    printqueue(); // Should print 11, 12, 13, 14
}
}*/
