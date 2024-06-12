package DSAs.treedsaq;


public class Node<T extends Comparable<T>> {
    int  data;
    Node<T> left, right;

    Node(int val) {
        this.data = val;
    }
}
