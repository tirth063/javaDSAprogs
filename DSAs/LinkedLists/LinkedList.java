package DSAs.LinkedLists;

import java.util.Stack;

public class LinkedList {
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

    public void deleteNode(Node nodeToDelete) {
        if (nodeToDelete == null || nodeToDelete.next == null)
            return;

        Node nextNode = nodeToDelete.next;
        nodeToDelete.data = nextNode.data;
        nodeToDelete.next = nextNode.next;
        nextNode.next = null;
    }

    public Node removeElements(int val) {
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

}