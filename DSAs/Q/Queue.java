package DSAs.Q;

import java.util.Arrays;

public class Queue {
    private static int[] q = new int[5];
    private static int f = 0, r = -1;

    private static void enqueue(int val) {
        if (r==q.length) {
            System.out.println("DSAs.Q.Queue is Full");
            return;
        }
        r = (r + 1) % q.length;
        q[r] = val;
    }

    private static void dequeue() {
        if (f == r + 1 || (f == 0 && r == -1)) {
            System.out.println("DSAs.Q.Queue is empty");
            return;
        }
        System.out.println(q[f] + " is deleted");
        f = (f + 1) % q.length;
        if (f == (r + 1) % q.length) {
            f = 0;
            r = -1; // Reset queue if completely empty
        }
    }

    private static void printQueue() {
        int i = f;
        if (r != -1) {
            while (true) {
                System.out.print(q[i] + " ");
                if (i == r) break;
                i = (i + 1) % q.length;
            }
        }
    }

    private static int size() {
        if (r == -1) {
            System.out.println("DSAs.Q.Queue is Empty enter element ");
            return 0;
        }
        return (r - f + q.length) % q.length + 1;
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        enqueue(60);
        printQueue();
        dequeue();
        enqueue(60);
        printQueue();
        System.out.println();
    }
}

class ArrayDeque {
    private final int[] arr;
    private int front;
    private int rear;
    private int size;
    private final int capacity;

    public ArrayDeque(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = 0;
        size = 0;
    }

    // Check if the deque is full
    public boolean isFull() {
        return (size == capacity);
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return (size == 0);
    }

    // Add element at the front
    public void insertFront(int key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front = front - 1;
        }
        arr[front] = key;
        size++;
    }

    // Add element at the rear
    public void insertRear(int key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear = rear + 1;
        }
        arr[rear] = key;
        size++;
    }

    // Delete element from front
    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front = front + 1;
        }
        size--;
    }

    // Delete element from rear
    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear = rear - 1;
        }
        size--;
    }

    // Get the front element
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return arr[front];
    }

    // Get the rear element
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return arr[rear];
    }

    public int getSize(){
        return size;
    }
    public void printq(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        ArrayDeque deque = new ArrayDeque(5);
        deque.insertRear(10);deque.insertRear(20);deque.insertRear(30);

    }
}
