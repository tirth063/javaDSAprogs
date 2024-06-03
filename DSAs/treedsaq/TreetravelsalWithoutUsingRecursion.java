package DSAs.treedsaq;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreetravelsalWithoutUsingRecursion {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    TreetravelsalWithoutUsingRecursion() {
        root = null;
    }

    void levelOrder() {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node n = q.poll();
            System.out.print(n.data + " ");
            if (n.left != null)
                q.add(n.left);
            if (n.right != null)
                q.add(n.right);
        }
    }

    void preOrder(){
        if (root == null)
            return;

        Stack<Node> s = new Stack<>();
        s.add(root);

        while (!s.isEmpty()){
            Node n = s.pop();
            System.out.print(n.data + " ");
            if (n.right != null)
                s.add(n.right);
            if (n.left != null)
                s.add(n.left);

        }
    }

    private void postOrder() {
        if (root == null)
            return;

        Stack<Node> s = new Stack<>();
        Stack<Node> t = new Stack<>();
        s.add(root);

        while (!s.isEmpty()){
             t.add( s.pop());

            if (t.peek().left != null)
                s.add(t.peek().left);
            if (t.peek().right != null)
                s.add(t.peek().right);


        }
        while (!t.isEmpty()){
            System.out.print(" " + t.pop().data);
        }
    }

    public static void main(String[] args) {
        TreetravelsalWithoutUsingRecursion tree = new TreetravelsalWithoutUsingRecursion();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(70);
        tree.root.left.left.left = new Node(80);
        tree.root.right.right.right = new Node(90);
        tree.root.left.right.left = new Node(100);
        tree.root.left.right.right = new Node(110);
        tree.root.right.left.left = new Node(120);
        tree.root.right.left.right = new Node(130);
        tree.root.right.right.left = new Node(140);
        tree.root.right.right.right = new Node(150);



        System.out.println("Level order traversal of binary tree is:");
        tree.levelOrder();

        System.out.println("\n pre order traversal of binary tree is: ");
        tree.preOrder();

        System.out.println("\n post order traversal of binary tree is:");
        tree.postOrder();

        System.out.println("\n in order traversal of binary tree is:");
        tree.inOrder();
    }
    /*
    *                                       10
    *
    *
    *                   20                                      30
    *
    *
    *         40                  50                  60                  70
    *
    *
    *   80          90      100         110     120         130     140         150
    *
    *
    *
    * */
    private void inOrder() {
        if (root == null)
            return;

        Stack<Node> s = new Stack<>();
        Node c = root;
        while (c != null || s.size() > 0){
            while (c != null) {
                s.push(c);
                c = c.left;

            }
            c = s.pop();
            System.out.print(c.data + " ");
            c = c.right;
        }
    }


}
