package DSAs.treedsaq.Binary_Search_Tree;

import Assignment2.Range_of_primeNumber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class trymycodes {
    static Node root;
    public void insert(int val){
      root =  insert( root , val );
    }
    private Node insert(Node root , int val){
        if (root == null){
            root = new Node(val);
            return root;
        }
        if (root.val > val){
            root.left = insert(root.left , val);
        }else{
            root.right = insert(root.right , val);
        }
        return root;
    }


    public  void delete(int val){
        root = delete(root , val);
    }
    private int findmin(Node root){
        int min = root.val;
        Node cur = root;
        while (cur != null){
            cur = cur.left;
            min = cur.val;
        }
        return min;
    }
    private Node delete(Node root, int val){
        if (root == null){
            return null;
        }

        if (val > root.val){
            root.right = delete(root.right , val);
        }else if(val < root.val) {
            root.left = delete(root.left , val);
        }else{
            if (root.left == null && root.right == null){
                return null;
            }else if(root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.val = findmin(root.right);
            root.right = delete(root.right, root.val);
        }
        return root;
    }
    public static void main(String[] args) {

    }

    public static HashMap<Integer, Integer> countFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return map;
    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length]; int index = 0;
        HashMap<Integer , Integer> hash = countFrequency(arr1);
        HashSet<Integer> set = new HashSet<>();

        for (int a : arr2){
            int key = hash.get(a);
            for (int i = 0; i < key; i++) {
                arr[index++] = a;
            }
            set.add( hash.remove(a) );
        }

        for (int a : arr1){
            if (!set.contains(a)) {
                arr[index++] = a;
            }
        }
        return arr;
    }
}
