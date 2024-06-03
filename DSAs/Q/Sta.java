package DSAs.Q;

import java.util.LinkedList;
import java.util.Queue;

public class Sta {
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> t = new LinkedList<>();

    void push (int val){
        q.add(val);
    }
    int pop(){
        int s = q.size();
        for (int i = 0; i < s-1; i++) {
            t.add(q.remove());
        }
        int temp = q.remove();
        q=t;
        t = new LinkedList<>();
        return temp;
    }

    public static void main(String[] args) {
        Sta s = new Sta();
        s.push(10); s.push(20); s.push(30); s.push(40); s.push(50); s.push(60);
        System.out.println(s.pop());System.out.println(s.pop());
    }
}
