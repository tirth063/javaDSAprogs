package Assignment_Patterns_3;

public class key_words {
    public static void main(String[] args) {
        // Create person and teacher objects
        Student_prect[] s = new Student_prect[10];
        Teacher[] t = new Teacher[10];
        s[0] = new Student_prect("John", 20, 1, 80, 90, 95);
        s[1] = new Student_prect("Jane", 21, 2, 70, 85, 92);
        s[2] = new Student_prect("Jim", 22, 3, 60, 75, 88);
        t[0] = new Teacher("John", 25, 60000, "Science");
        t[1] = new Teacher("Jane", 30, 50000, "Mathematics");
        t[2] = new Teacher("Jim", 35, 55000, "History");

        // Display the counts of person and teacher objects
        person.displayCount();
        Teacher.displayTeacherCount();
        Student_prect.displayStudentCount();

        // Display the details of the person and teacher objects
        System.out.println();
        s[0].displayDetails();
        System.out.println();
        t[0].displayDetails();
        System.out.println();
        s[0].displayMarks();
        System.out.println();
        t[0].displaySalary();
        System.out.println();
    }
}
class person {
    String name;
    int age;
    static int count = 0; // Static field to keep track of the number of person objects created

    person(String name, int age) {
        this.name = name;
        this.age = age;
        count++; // Increment count each time a new person object is created
    }

    static void displayCount() {
        System.out.println("Total number of person objects created: " + count);
    }
}


class Teacher extends person {
    int salary;
    String subject;
    static int teacherCount = 0; // Static field to keep track of the number of teacher objects created

    Teacher(String name, int age, int salary, String subject) {
        super(name, age);
        this.salary = salary;
        this.subject = subject;
        teacherCount++; // Increment teacherCount each time a new Teacher object is created
    }

    static void displayTeacherCount() {
        System.out.println("Total number of Teacher objects created: " + teacherCount);
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);

    }
}


class Student_prect extends person {
    int rollNo;
    int mark1;
    int mark2;
    int mark3;
    int percentage;
    int totalMarks;
    static int studentCount; // Static field to keep track of the number of student objects created

    static {
        studentCount = 0;
    }
    Student_prect(String name, int age, int rollNo, int mark1, int mark2, int mark3) {
        super(name, age);
        this.rollNo = rollNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        totalMarks = mark1 + mark2 + mark3;
        percentage = totalMarks / 3;
        studentCount++; // Increment studentCount each time a new Student_prect object is created
    }

    static void displayStudentCount() {
        System.out.println("Total number of Student_prect objects created: " + studentCount);
    }

    public void displayMarks() {
        System.out.println("Total marks: " + totalMarks);
        percentage = totalMarks / 3;
        System.out.println("Percentage: " + percentage);
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll number: " + rollNo);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
    }
}

