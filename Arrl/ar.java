package Arrl;

import java.util.ArrayList;

public class ar {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(60);
        System.out.println(list);
        list.add(3,40);
        list.remove(3);
        System.out.println(list);
        for(int e : list){
            System.out.println(e);
        }
        int even=0,odd=0;
        for (int e : list){
            if (e % 2 == 0) {
                even++;
            }else {
                odd++;
            }
        }
        System.out.println(even +" "+odd);
        System.out.println(list.contains(5));

    }
}
