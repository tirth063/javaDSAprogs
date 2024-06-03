package DSAs.LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

class Node {
    public static void main(String[] args) {
        singlyLinkedList  ll = new singlyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.printLL();


    }
}

public class singlyLinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head, tail;

    public void add(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }

    public void remove(int data) {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }

        if (head.data == data) {
            if (head == tail) { // Only one node in the list
                head = tail = null;
            } else {
                head = head.next;
            }
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Element not found in the list");
            return;
        }

        if (current.next == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = current.next.next;
        }
    }

    public void reverse(){
        Node c = head , p = null , n = null;

        while ( c != null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        head = p;
        printLL();
    }

    public void printLL() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean find(int data) {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return false;
        }
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                System.out.println("Element is present in the list.");
                return true;
            }
            current = current.next;
        }
        System.out.println("Element is not present in the list.");
        return false;
    }

    public boolean update(int olddata, int newdata) {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return false;
        }
        Node current = head;
        while (current != null) {
            if (current.data == olddata) {
                current.data = newdata;
                System.out.println("Element is Updated in the list.");
                return true;
            }
            current = current.next;
        }
        System.out.println("Element is not present in the list.");
        return false;
    }

    public int getSize() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void reverseLL() {
        Stack<Object> stack = new Stack<>();
        Node current = head;
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
    }

    public Object getnthElement(int positionNumber) {
        Node current = head;
        int i = 1;
        while (current != null && i <= positionNumber) {
            if (i == positionNumber) {
                return current.data;
            }
            current = current.next;
            i++;
        }
        return null;
    }

    //for ADvanced
    public Node getnthElementFromEnd(int positionNumber) {
        if (positionNumber <= 0 || head == null) {
            return null;
        }

        Node slowPtr = head;
        Node fastPtr = head;

        for (int i = 0; i < positionNumber; i++) {
            if (fastPtr == null) {
                return null; // Out of bounds
            }
            fastPtr = fastPtr.next;
        }

        while (fastPtr != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }

        // At this point, slowPtr is at the nth element from the end
        return slowPtr;
    }

    public int getNthFromEnd(int n) {
        int size = getSize() - n;
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (count == size) {
                System.out.println(temp.data);
                return temp.data;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public void deleteNode(Node nodeToDelete) {
        if (nodeToDelete == null || nodeToDelete.next == null)
            return;

        Node nextNode = nodeToDelete.next;
        nodeToDelete.data = nextNode.data;
        nodeToDelete.next = nextNode.next;
        nextNode.next = null;
    }

    public int findMiddle(Node head) {
        Node f = head, s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }
        return s.data;
    }

    public boolean hasLoop() {
        Node f = head, s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                System.out.println("Loop detected");
                return true;
            }
        }
        System.out.println("Loop is not detected");
        return false;
    }

    public int lengthOfLoop() {
        Node f = head, s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                Node t = s.next;
                int l = 1;
                while (t != s) {
                    l++;
                    t = t.next;
                }
                return l;
            }
        }
        System.out.println("Loop is not detected");
        return 0;
    }


    public boolean removeLoop() {
        if (head == null)
            return false;

        Node f = head, s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                s = head;
                while (s != f) {
                    s = s.next;
                    f = f.next;
                }
                while (f.next != s) {
                    f = f.next;
                }
                f.next = null;
                return true;
            }
        }
        return false;
    }

    public Node deleteLast(Node head, int x) {
        Node current = head;
        Node lastSeen = null; // To keep track of the last node with data 'x'

        // Traverse the list to find the last occurrence of 'x'
        while (current != null) {
            if (current.data == x) {
                lastSeen = current;
            }
            current = current.next;
        }

        if (lastSeen != null || lastSeen.next != null ){
            deleteNode(lastSeen);
        }else {
            Node temp = head;
            while (temp.next != lastSeen){
                temp  = temp.next;
            }
            if (temp.next == tail) {
                temp.next = null;
                tail = temp;
            } else {
                temp.next = temp.next.next;
            }

        }

        return head;
    }

    public Node removeElements( int val) {
        Node prv = null ,c = head;
        while(c.next != null){
            if(c == head && c.data == val){
                head = head.next;
                c = head;
            }
            else if(c.data == val){
                prv.next = c.next;
                c.next = prv;
            }else{
                prv = c;
                c = c.next;
            }
        }
        return head;
    }

    public Node mergeTwoLists(Node list1, Node list2) {
                if (list1 ==null)
                    return list2;
                if (list2 == null)
                    return list1;
             if (list1.data < list2.data){
                 list1.next = mergeTwoLists(list1.next,list2);
                 return list1;
             }else {
                 list2.next = mergeTwoLists(list1,list2.next);
                 return list2;
             }

    }

    public Node removeElements(Node head, int val) {
        if(head==null) return null;
        head.next= removeElements(head.next,val);
        return head.data==val?head.next:head;
    }

    public void swap(){
        Node firstElement = head;
        Node secondElement = head.next;
        Node lastElement = head , prvLast = lastElement;

        while (lastElement.next != null){
            prvLast = lastElement;
            lastElement = lastElement.next;
        }

        head = lastElement;
        firstElement.next = lastElement;
        lastElement.next = secondElement;
        prvLast.next = firstElement;

    }

    public  LinkedList sum2LL(Node h1, Node h2) {
        Node c = h1, t = h2;
        LinkedList ll = new LinkedList();
        int carry = 0;

        while (c != null || t != null) {
            int sum = carry;
            if (c != null) {
                sum += c.data;
                c = c.next;
            }
            if (t != null) {
                sum += t.data;
                t = t.next;
            }
            carry = sum / 10;
            ll.add(sum % 10);
        }

        if (carry > 0) {
            ll.add(carry);
        }

        return ll;
    }

    void rearrangeList() {
        if (head == null || head.next == null) return;

        // Split the list into two parts: odd and even
        Node oddHead = head;
        Node evenHead = head.next;

        Node odd = oddHead;
        Node even = evenHead;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        // Merge the two parts
        odd.next = evenHead;

        // Print the rearranged list
        printLL(oddHead);
    }

    void printLL(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    void repleceCount(Node head) {
        Node current = head;
        int count0 = 0 , count1 = 0 , count2 = 0;
        while (current != null) {
            if (current.data == 0) {
                count0++;
            } else if (current.data == 1) {
                count1++;
            } else {
                count2++;
            }
            current = current.next;
        }

        current = head;
        while (current != null) {
            if (count0 > 0) {
                current.data = 0;
                count0--;
            } else if (count1 > 0) {
                current.data = 1;
                count1--;
            } else {
                current.data = 2;
                count2--;
            }
            current = current.next;
        }
        printLL(head);
    }

    Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        Node temp = head.next;
        temp.next = head;
        head.next = null;
        return newHead;
    }



    public Node addTwoNumbers(Node h1, Node h2) {
        if(h1 == null && h2 == null)
            return h1;

        Node c = h1, t = h2;
        Node ll = new Node(-1);
        Node tail = ll;
        int carry = 0;

        while (c != null || t != null) {
            int sum = carry;
            if (c != null) {
                sum += c.data;
                c = c.next;
            }
            if (t != null) {
                sum += t.data;
                t = t.next;
            }
            carry = sum / 10;
            tail.next = new Node(sum % 10);
            tail = tail.next;
        }

        if (carry > 0) {
            tail.next = new Node(carry);
        }

        return ll.next;

    }
    
}

class MyQueue
{
    QueueNode front, rear;

    //Function to push an element into the queue.
    void push(int a)
    {
        QueueNode nn = new QueueNode(a);
        if (front == null){
            front = nn;
            rear = nn;
        }else {
            rear.next = nn;
            rear = nn;
        }
    }

    //Function to pop front element from the queue.
    int pop()
    {
        if (front == null)
            return -1;
        if (front == rear){
            int temp = front.data;
            front = rear =null;
            return temp;
        }else {

            front =front.next;
            return front.data;
        }
    }
}
class QueueNode
{
    int data;
    QueueNode next;
    QueueNode(int a)
    {
        data = a;
        next = null;
    }
}