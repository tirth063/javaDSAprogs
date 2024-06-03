package DSAs.Q;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Testings {
    public static void main(String[] args) {
        MyQueu m = new MyQueu();
        m.insert(10);m.insert(20);m.insert(30);
        System.out.println("Deleted: " + m.deleteHeavy()); // Should print 5
        System.out.println("Deleted: " + m.deleteHeavy()); // Should print 3
        System.out.println("Deleted: " + m.deleteHeavy()); // Should print -1 (queue is empty)
    }
}

class MyQueu {
    private Stack<Integer> s;
    private Stack<Integer> t;

    MyQueu() {
        s = new Stack<>();
        t = new Stack<>();
    }

    public void insertHeavy(int x){
        if (s.isEmpty()){
            s.push(x);
        }else {
            transferElement();
            s.push(x);
           s=t;
           t = new Stack<>();
        }
    }

    public void insert(int x){
        s.push(x);
    }

    public int delete(){
        return s.pop();
    }

    public int deleteHeavy(){
        if (s.isEmpty()) return -1;
        if (s.size() == 1) return s.pop();
        transferElement();
        int temp = t.pop();
        s=t;
        t = new Stack<>();
        return temp;
    }

    private void transferElement(){
        while (!s.isEmpty()){
            t.push(s.pop());
        }
    }
}

/*
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList.java<>();

        for (int i = 0; i < tickets.length; i++) {
            q.add(i);
        }

        int seconds  = 0;
        while (!q.isEmpty()){
            seconds++;
            int person = q.poll();
            if (tickets[person] >  0){
                tickets[person]--;
            }
            if(person == k && tickets[person] == 0) break;
            if(person != k && tickets[person] == 0) continue;
            q.add(person);
        }
        return seconds;
    }
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList.java<>();
        for (int i = 0; i < students.length; i++) {
            q.add(students[i]);
        }
        int countfornoteaten=0;
        int top = 0;
        while (!q.isEmpty()){
            int stud = q.poll();
            if (stud == sandwiches[top]){
                top++;
            }else {
                q.add(stud);countfornoteaten++;
                if (countfornoteaten == q.size()){
                    return q.size();
                }
            }
        }
        return 0;
    }
}*/
