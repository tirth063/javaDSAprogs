package DSAs.LinkedLists;

public class DoblyLL {
    class Node{
        int data;
        Node next;
        Node prv;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head=null , tail=null;
    int size=0;

    void add(int data){
        Node nn = new Node(data);
        if (head == null){
            head = nn;
            tail = nn;
        }else {
            nn.prv = tail;
            tail.next = nn;
            tail = nn;
        }
        size++;
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        if (head.data == data) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prv = null;
            }
            size--;
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data not found in the list");
            return;
        }

        if (current == tail) {
            tail = tail.prv;
            tail.next = null;
        } else {
            current.prv.next = current.next;
            current.next.prv = current.prv;
        }

        size--;
    }

    public void deleteNode(Node node) {
        if (node == null) {
            System.out.println("Node is null");
            return;
        }

        if (node == head) {
            head = head.next;
            if (head != null) {
                head.prv = null;
            } else {
                tail = null;
            }
        } else if (node == tail) {
            tail = tail.prv;
            tail.next = null;
        } else {
            node.prv.next = node.next;
            node.next.prv = node.prv;
        }
        size--;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node current = head;
        System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printRev() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node current = tail;
        System.out.print("Reverse Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prv;
        }
        System.out.println();
    }

    boolean findPairSum(int sum){
        Node left = head ,right = tail;
        while (left != null && right != null && left != right){
            int curSum = left.data + right.data;
            if (curSum == sum) return true;
            else if (curSum < sum) left = left.next;
            else  right = right.prv;
        }
        return false;
    }

    void reverse(){
        Node c = head;
        Node t = null;
        while (c != null){
            t = c.prv;
            c.prv = c.next;
            c.next = t;
            c = c.prv;
        }
        if (t != null) {
            head = t.prv;
        }

    }

    public void addInSortedDoublyLinkedList(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        if (data <= head.data) {
            newNode.next = head;
            head.prv = newNode;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        newNode.next = current.next;
        if (current.next != null) {
            current.next.prv = newNode;
        }
        current.next = newNode;
        newNode.prv = current;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    void remove_duplicates()
    {
        Node ptr1 = head, ptr2 = null;
        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
            while (ptr2.next != null) {
                if (ptr1.data == ptr2.next.data) {
                    ptr2.next = ptr2.next.next;
                    System.gc();
                }
                else {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }

    void removeDuplicates() {
        if (head == null)
            return;

        Node current = head;
        while (current != null) {
            Node runner = current.next;
            while (runner != null) {
                if (current.data == runner.data) {
                    Node nextNode = runner.next;
                    if (runner.prv != null)
                        runner.prv.next = nextNode;
                    if (nextNode != null)
                        nextNode.prv = runner.prv;
                }
                runner = runner.next;
            }
            current = current.next;
        }
    }



    public static void main(String[] args) {
        DoblyLL list = new DoblyLL();
        list.add(12);
        list.add(11);
        list.add(12);
        list.add(21);
        list.add(41);
        list.add(43);
        list.add(21);

        System.out.println("Original Doubly Linked List:");
        list.print();

        list.removeDuplicates();
        System.out.println("Doubly Linked List after removing duplicates:");
        list.print();

    }

}
