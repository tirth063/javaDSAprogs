package DSAs;

import java.util.*;

public class LRU {
    Deque<Integer> deque;
    HashSet<Integer> set;
    int capacity;

    public LRU(int capacity) {
        deque = new LinkedList<>();
        set = new HashSet<>();
        this.capacity = capacity;
    }

    public void insert(int val) {
        if(!set.contains(val)) {
            if(deque.size() == capacity) {
                int last = deque.removeLast();
                set.remove(last);
            }
        } else {
            deque.remove(val);
        }
        deque.addFirst(val);
        set.add(val);
    }

    public void display()
    {
        Iterator<Integer> itr = deque.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public static void main(String[] args)
    {
        LRU cache = new LRU(3);
        cache.insert(1);
        cache.insert(2);
        cache.insert(3);
        cache.insert(1);
        cache.insert(4);
        cache.insert(5);
        cache.display();
    }

    public boolean exist(char[][] board, String word) {
        //for loop to add board to HashSet
        int row = board.length;
        int col = board[0].length;
        HashMap<Character , Integer> map = new HashMap<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                map.putIfAbsent(board[i][j], map.getOrDefault(board[i][j] , 0) + 1);
            }
        }
        //for loop to check if word is in HashSet
        for (char c : word.toCharArray()) {
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;

    }

}