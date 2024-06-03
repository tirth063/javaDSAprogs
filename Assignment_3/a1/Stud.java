package Assignment_3.a1;

import java.util.Scanner;

public class Stud {

    static int studentCount = 0;
    int roll=0;
    String name;
    int[] marks = new int[5];
    String[] subjects = new String[5];
    int total = 0;


    public Stud() {
        studentCount++;
    }

    public static void TotalStudents(){
        System.out.println("Total students:"+studentCount);
        System.out.println();
    }

    public  void input() {
        Scanner sc = new Scanner(System.in);
        this.roll = studentCount;
        System.out.println("Enter name:");
        this.name = sc.nextLine();
        System.out.println("Enter marks:");
        for (int i = 0; i < marks.length; i++) {
           this.marks[i] = sc.nextInt();
           this.total += marks[i];
        }
        System.out.println("Enter subjects:");
        for (int i = 0; i < subjects.length; i++) {
           this.subjects[i] = sc.next();
        }

    }

    public void Show() {
        System.out.println("Roll number:"+roll);
        System.out.println("Name:"+name);
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(" "+subjects[i]+" "+marks[i]);
        }
        System.out.println("Total marks:"+total);
        System.out.println();
    }

    public static void TotalMarks(int[] marks) {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        System.out.println("Total marks:"+total);
        System.out.println();
    }

    public void getHighest(){
        int highest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if(marks[i]>highest){
                highest = marks[i];
            }
        }
        System.out.println("Highest marks:"+highest);
        System.out.println();
    }

    public void getLowest(){
        int lowest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if(marks[i]<lowest){
                lowest = marks[i];
            }
        }
        System.out.println("Lowest marks:"+lowest);
        System.out.println();
    }

    public static void getAverage(int[] marks){
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        System.out.println("Average marks:"+total/marks.length);
        System.out.println();
    }

    public void getPassCount(){
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]>=40){
                count++;
            }
        }
        System.out.println("Pass count:"+count);
        System.out.println();
    }

    public static void getallDeails(){
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]>=40){
                count++;
            }
        }
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        System.out.println("Total marks:"+total);
        System.out.println("Average marks:"+total/marks.length);
        System.out.println("Pass count:"+count);
        System.out.println();
    }
    
    

    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.input();
        TotalStudents();
        s1.Show();
        TotalMarks(new int[]{40, 50, 60, 70, 80});
        s1.getHighest();
        s1.getLowest();
        getAverage(new int[]{40, 50, 60, 70, 80});
        s1.getPassCount();
        getallDeails();
    }
}
