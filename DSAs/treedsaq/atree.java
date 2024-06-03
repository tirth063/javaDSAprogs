//package DSAs.treedsaq;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class atree {
//    static int count = 0;
//
//    public static void main(String[] args) {
//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.root = new Node1(10);
//        binaryTree.root.left = new Node1(20);
//        binaryTree.root.right = new Node1(30);
//        binaryTree.root.left.left = new Node1(40);
//        binaryTree.root.left.right = new Node1(50);
//        binaryTree.root.right.left = new Node1(60);
//        binaryTree.root.right.right = new Node1(70);
//
//        binaryTree.levelOrder(binaryTree.root);
//        System.out.println();
//
//        binaryTree.printPreOrder(binaryTree.root);
//        System.out.println();
//
//        binaryTree.printInOrder(binaryTree.root);
//        System.out.println();
//
//        binaryTree.printPostOrder(binaryTree.root);
//        System.out.println();
//
//        System.out.println(binaryTree.countNodes(binaryTree.root));
//
//        findNthNode(binaryTree.root, 3);
//        System.out.println();
//
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
//
//        Node1 node = binaryTree.createTreeFromArray(arr);
//        System.out.println(node.data);
//
//        binaryTree.levelOrder(node);
//        System.out.println();
//
//        binaryTree.printPreOrder(node);
//        System.out.println();
//
//        binaryTree.printInOrder(node);
//        System.out.println();
//
//        binaryTree.printPostOrder(node);
//
//    }
//
//    public static void findNthNode(Node1 root, int n) {
//        if (root == null) {
//            return;
//        }
//        findNthNode(root.left, n);
//        count++;
//        if (count == n) {
//            System.out.print(root.data);
//            return;
//        }
//        findNthNode(root.right, n);
//    }
//}
//
//class BinaryTree {
//    Node1 root;
//
//    public Node1 createTreeFromArray(int[] arr) {
//        if (arr == null || arr.length == 0) {
//            return null;
//        }
//        Node1 root = new Node1(arr[0]);
//        Queue<Node1> q = new LinkedList<>();
//        q.add(root);
//        int i = 1;
//        while (i < arr.length) {
//            Node1 curr = q.remove();
//            if (i < arr.length) {
//                curr.left = new Node1(arr[i++]);
//                q.add(curr.left);
//            }
//            if (i < arr.length) {
//                curr.right = new Node1(arr[i++]);
//                q.add(curr.right);
//            }
//        }
//        return root;
//    }
//
//    public void levelOrder(Node1 root) {
//        if (root == null) {
//            return;
//        }
//        Queue<Node1> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            Node1 n = queue.poll();
//            if (n == null) {
//                return;
//            }
//            System.out.print(n.data + " ");
//            if (n.left != null) {
//                queue.add(n.left);
//            }
//            if (n.right != null) {
//                queue.add(n.right);
//            }
//        }
//    }
//
//    public void printPreOrder(Node1 root) {
//        if (root == null) {
//            return;
//        }
//        System.out.print(root.data + " ");
//        printPreOrder(root.left);
//        printPreOrder(root.right);
//    }
//
//    public void printInOrder(Node1 root) {
//        if (root == null) {
//            return;
//        }
//        printInOrder(root.left);
//        System.out.print(root.data + " ");
//        printInOrder(root.right);
//    }
//
//    public void printPostOrder(Node1 root) {
//        if (root == null) {
//            return;
//        }
//        printPostOrder(root.left);
//        printPostOrder(root.right);
//        System.out.print(root.data + " ");
//    }
//
//    public int countNodes(Node1 root) {
//        if (root == null) {
//            return 0;
//        }
//        int leftCount = countNodes(root.left);
//        int rightCount = countNodes(root.right);
//
//        return leftCount + rightCount + 1;
//    }
//
//}
//
//class Node {
//    int data;
//    Node1 left, right;
//
//    Node(int data) {
//        this.data = data;
//        left = right = null;
//    }
//}