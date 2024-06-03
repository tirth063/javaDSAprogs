package DSAs.treedsaq;

import java.util.LinkedList;
import java.util.Queue;
class BinaryTree {
    public static int countNodes(Node1 root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount + rightCount + 1;
    }

    public static int height(Node1 root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int countLeafNodes(Node1 root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftCount = countLeafNodes(root.left);
        int rightCount = countLeafNodes(root.right);
        return leftCount + rightCount;
    }

    static int count = 0;

    public static void findNthNode(Node1 root, int n) {
        if (root == null) {
            return;
        }
        findNthNode(root.left, n);
        count++;
        if (count == n) {
            System.out.println(root.data + " ");
            return;
        }
        findNthNode(root.right, n);
    }

    public static boolean isPresent(Node1 root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        return isPresent(root.left, data) || isPresent(root.right, data);
    }

    public static boolean isBalanced(Node1 root) {
        if (root == null) {
            return true;
        }
        if (isBalanced(root.left) == false) {
            return false;
        }
        if (isBalanced(root.right) == false) {
            return false;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (Math.abs(leftHeight - rightHeight) <= 1) {
            return true;
        }
        return false;
    }

    //    Find the Maximum Depth /  Height of given Binary Tree
    public static int maxDepth(Node1 root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }


    // Create binary tree from an array - level order fashion
    public static Node1 createTreeFromArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node1 root = new Node1(arr[0]);
        Queue<Node1> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            Node1 curr = queue.remove();
            if (i < arr.length && arr[i] != -1) {
                curr.left = new Node1(arr[i]);
                queue.add(curr.left);
            }
            i++;
            if (i < arr.length && arr[i] != -1) {
                curr.right = new Node1(arr[i]);
                queue.add(curr.right);
            }
            i++;
        }
        return root;
    }

    public static Node1 sortedArrayToBST(int[] nums) {
        int mid = (1 + nums.length) / 2;
        int left  = 0;
        int right = mid+1;

        Node1 root = new Node1(nums[mid]);
        Queue<Node1> queue = new LinkedList<>();
        queue.add(root);
        int i = 0;
        while (!queue.isEmpty() && i < mid) {
            Node1 curr = queue.remove();
            if (i < mid && left < mid ) {

                curr.left = new Node1(nums[left]);
                queue.add(curr.left);
            }
            left++;
            i++;
            if (i < mid && right < nums.length ) {
                curr.right = new Node1(nums[right]);
                queue.add(curr.right);
            }
            right++;
            i++;
        }
        return root;
    }

    static void levelOrder(Node1 root) {
        if (root == null) {
            return;
        }
        System.out.print( root.data + " ");
        levelOrder(root.left);
        levelOrder(root.right);
    }
    public static void main(String[] args) {
        Tree tree = new Tree();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Node1 root = sortedArrayToBST(arr);

        levelOrder(root);
    }
}

public class Tree {
    Node1 root;

    public void insert(int data){
        root = insert(root,data);
    }

    public Node1 insert(Node1 root, int data){
        if(root == null){
            root = new Node1(data);
            return root;
        }
        if(data < root.data){
            root.left = insert(root.left,data);
        }else if(data > root.data){
            root.right = insert(root.right,data);
        }
        return root;
    }

    //level order BFS traversal
    public void levelOrder(){
        if(root == null){
            return;
        }
        Queue<Node1> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node1 temp = queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }

    //pre, in, post order traversal
    public void printPreOrder(Node1 root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public void printInOrder(Node1 root){
        if(root == null){
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data+" ");
        printInOrder(root.right);
    }

    public void printPostOrder(Node1 root){
        if(root == null){
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data+" ");
    }


}

class Node1 {
    int data;
    Node1 left;
    Node1 right;
    Node1(int data){
        this.data = data;
        left = null;
        right = null;
    }
}