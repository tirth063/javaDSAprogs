package newass;

public class Ques1 {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1, "A", JobTitle.Peon, 10000),
                new Employee(2, "B", JobTitle.Prof, 20000),
                new Employee(3, "C", JobTitle.HOD, 30000),
                new Employee(4, "D", JobTitle.Principal, 40000),
                new Employee(5, "E", JobTitle.Peon, 50000),
                new Employee(6, "F", JobTitle.Prof, 60000),
                new Employee(7, "G", JobTitle.HOD, 70000),
                new Employee(8, "H", JobTitle.Principal, 80000),
                new Employee(9, "I", JobTitle.Peon, 90000),
                new Employee(10, "J", JobTitle.Prof, 100000),
                new Employee(11, "K", JobTitle.HOD, 110000),
                new Employee(12, "L", JobTitle.Principal, 120000)
        };
        Employee e = new Employee();

        e.allSalarypayment(employees);
        }
}

enum JobTitle {
    Peon, Prof, HOD, Principal
}
class Employee {
    //empId, name, JobTitle (Enum: Peon, Prof, HOD, Principal), salary
    int empId;
    String name;
    String JobTitle;
    double salary;

    public Employee() {

    }
    public Employee(int empId, String name, JobTitle JobTitle, double salary) {
        this.empId = empId;
        this.name = name;
        this.JobTitle = JobTitle.toString();
        this.salary = salary;
    }
    
    void allSalarypayment(Employee[] e) {
        double allPeonSalary = 0;
        double allProfSalary = 0;
        double allHODSalary = 0;
        double allPrincipalSalary = 0;
        double total = 0;

        for (Employee employee : e) {
            if (employee.JobTitle.equals("Peon")) {
                allPeonSalary += employee.salary;
            }
            if (employee.JobTitle.equals("Prof")) {
                allHODSalary += employee.salary;
            }
            if (employee.JobTitle.equals("HOD")) {
                allProfSalary += employee.salary;
            }
            if (employee.JobTitle.equals("Principal")) {
                allPrincipalSalary += employee.salary;
            }
        }
        System.out.println("Total salary of all Peon: " + allPeonSalary);
        System.out.println("Total salary of all Prof: " + allProfSalary);
        System.out.println("Total salary of all HOD: " + allHODSalary);
        System.out.println("Total salary of all Principal: " + allPrincipalSalary);
        System.out.println("Total salary of all: " + (allPeonSalary + allProfSalary + allHODSalary + total));
        }
        
        
    }

