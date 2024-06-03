package OOPS.Basic;


public class Basic {
    public static void main(String[] args) {

        Student[] s = new Student[6];

// Initialize each element of the array with a new Student object
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
        }

// Set student details for each student object in the array
        s[0].setStudDetails(1, "tirth", 60, 45, 94);
        s[1].setStudDetails(2, "raj", 50, 55, 44);
        s[2].setStudDetails(3, "dev", 80, 75, 64);
        s[3].setStudDetails(4, "mayank", 80, 85, 34);
        s[4].setStudDetails(5, "vansh", 70, 65, 24);
        s[5].setStudDetails(6, "jenil", 90, 45, 14);

        int max = 0;
        int m2 = -1; // Initialize m2 and m3 to -1 to indicate they have not been set yet
        int m3 = -1;

        for (int i = 0; i < s.length; i++) {
            if (s[i].totalMarks > s[max].totalMarks) {
                m3 = m2;
                m2 = max;
                max = i;
            } else if (m2 == -1 || s[i].totalMarks > s[m2].totalMarks) {
                m3 = m2;
                m2 = i;
            } else if (m3 == -1 || s[i].totalMarks > s[m3].totalMarks) {
                m3 = i;
            }
        }

        s[max].displayStudDetails();
        s[m2].displayStudDetails();
        s[m3].displayStudDetails();

        Account ac = new Account("Tirth",123456,1000,4);
        System.out.println("befour interest");
        ac.displayAccountDetails();
        ac.calculateInterest();
        System.out.println("After interest");
        ac.displayAccountDetails();

        ac.deposit(10000);
        ac.withdraw(100);

        Student student = new Student();
        student.setStudDetails(1,"tirth",60,65,44);
        System.out.println("Student Total is"+student.calculateTotal());
        System.out.println();
        student.displayStudDetails();



    }
}

class Student{
    int rollNum, mark1, mark2, mark3, totalMarks;
    String studName;

    void setStudDetails(int rollNum, String name, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studName = name;
        this.mark1 = mark1;
        this.mark2 =   mark2;
        this.mark3 = mark3;
        this.totalMarks = mark1+mark2+mark3;
    }
    int calculateTotal(){
        return mark1+mark2+mark3;
    }

    void displayStudDetails(){
        System.out.println("Student Roll no. is: " + rollNum);
        System.out.println("Student Name is: " + studName);
        System.out.println("Student mark1 is: " + mark1);
        System.out.println("Student mark2 is: " + mark2);
        System.out.println("Student mark3 is: " + mark3);
        System.out.println("Student Total marks is:"+totalMarks);
    }
}

class Account{
    int accountNumber;
             double balance ,interestrate;
    String custName;

    Account(String custName,int accountNumber,double balance ,double interestrate) {
        this.custName = custName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestrate = interestrate;
    }

    void  withdraw(int amount){
        if (balance > amount) {
            balance -= amount;
            System.out.println("your current Balance is :"+balance);
        }else {
            System.out.println("Insufficient Balance");
        }
    }

    void deposit(int amount){
        balance += amount;
        System.out.println("your current Balance is :"+balance);
    }
    void calculateInterest() {
        double interest = balance * (interestrate / 100);
        System.out.println("Interest is : " + interest);
        balance += interest;
    }

    void displayAccountDetails(){
        System.out.println("Your Account Number no. is: "+accountNumber );
        System.out.println("Your Account Customer Name is: "+custName );
        System.out.println("Your Account Balance is: " +balance);
        System.out.println("Your Account Interest Rate is: "+interestrate );
    }



}
