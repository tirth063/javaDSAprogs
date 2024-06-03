package DSAs.LinkedLists;

public class CircleSinglyLinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head;

    public void add(int data) {
     Node nn = new Node(data);
        if (head == null) {
            head = nn;
            head.next = head;
        }else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = nn;
            nn.next = head;
        }
    }

    public void remove(int data) {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }

        if (head.data == data && head.next == head){
                head = null;
        } else if (head.data == data) {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            head=head.next;
            current.next=head;
        }else {
            Node current = head;
            while ( current.next.data != data && current.next != head) {
                current = current.next;
            }
            if(current.next == head){
                System.out.println(" Value not Present ");
            }
            else if(current.next.next==head){
                current.next=head;
            }else {
                current.next = current.next.next;
            }
        }
    }



    public void print(){
        System.out.println();
        Node current = head;
        if (head == null){
            System.out.println(" LL is empty");
            return;
        }
         do{
            System.out.print(current.data + " ");
            current = current.next;
        }while (current != head);

    }

    public static void main(String[] args) {
        CircleSinglyLinkedList ll = new CircleSinglyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.print();

        System.out.println();


        ll.print();
    }
}