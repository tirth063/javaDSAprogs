package DSAs.LinkedLists;

public class CSL {
    class Node {
        int data;
        Node ref;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void add(int data){
        Node nn = new Node(data);
        if (head == null){
            head = nn;
            head.ref = head;
        }else {
            Node c = head;
            while (c.ref != head ){
                c = c.ref;
            }
            c.ref = nn;
            nn.ref = head;

        }
    }

    public void remove(int data){
        if(head == null){
            System.out.println(" LL is Empty");
            return;
        }

        if (head.data == data && head.ref == head){
            head = null;
        } else if (head.data == data) {
            Node c = head;
            while (c.ref != head ){
                c = c.ref;
            }
            head = head.ref;
            c.ref = head;
        }else {
            Node c = head;
            while (c.ref != head && c.ref.data == data ){
                c = c.ref;
            }
            if (c.ref == head){
                System.out.println("No data exist");

            }else if(c.ref.ref == head){
                c.ref = head;
            }else {
                c.ref = c.ref.ref;
            }
        }
    }

    public void print(){

        if(head == null){
            System.out.println(" LL is Empty");
            return;
        }
        Node c =head;
        System.out.println(" LL is : \n");
        do {
            System.out.print(" " + c.data );
            c = c.ref;
        }while (c != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CSL ll = new CSL();
        ll.add(10);
        ll.print();
        ll.add(20);
        ll.print();
        ll.add(30);
        ll.print();
    }


}
