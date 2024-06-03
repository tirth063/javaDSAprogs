package newass;

import java.util.Random;

public class Ques3 {
    public static void main(String[] args) {
        Random random = new Random();
        Salary1[][] salary1 = new Salary1[6][6];

        salary1[0][0] = new Salary1(1001, "John", (random.nextDouble(80001) + 10000));
        salary1[0][1] = new Salary1(1002, "Jane", (random.nextDouble(80001) + 10000));
        salary1[0][2] = new Salary1(1003, "Bob", (random.nextDouble(80001) + 10000));
        salary1[0][3] = new Salary1(1004, "Alice", (random.nextDouble(80001) + 10000));
        salary1[0][4] = new Salary1(1005, "Mike", (random.nextDouble(80001) + 10000));
        salary1[0][5] = new Salary1(1006, "Sarah", (random.nextDouble(80001) + 10000));

        salary1[1][0] = new Salary1(1001, "John", (random.nextDouble(80001) + 10000));
        salary1[1][1] = new Salary1(1002, "Jane", (random.nextDouble(80001) + 10000));
        salary1[1][2] = new Salary1(1003, "Bob", (random.nextDouble(80001) + 10000));
        salary1[1][3] = new Salary1(1004, "Alice", (random.nextDouble(80001) + 10000));
        salary1[1][4] = new Salary1(1005, "Mike", (random.nextDouble(80001) + 10000));
        salary1[1][5] = new Salary1(1006, "Sarah", (random.nextDouble(80001) + 10000));

        salary1[2][0] = new Salary1(1001, "John", (random.nextDouble(80001) + 10000));
        salary1[2][1] = new Salary1(1002, "Jane", (random.nextDouble(80001) + 10000));
        salary1[2][2] = new Salary1(1003, "Bob", (random.nextDouble(80001) + 10000));
        salary1[2][3] = new Salary1(1004, "Alice", (random.nextDouble(80001) + 10000));
        salary1[2][4] = new Salary1(1005, "Mike", (random.nextDouble(80001) + 10000));
        salary1[2][5] = new Salary1(1006, "Sarah", (random.nextDouble(80001) + 10000));

        salary1[3][0] = new Salary1(1001, "John", (random.nextDouble(80001) + 10000));
        salary1[3][1] = new Salary1(1002, "Jane", (random.nextDouble(80001) + 10000));
        salary1[3][2] = new Salary1(1003, "Bob", (random.nextDouble(80001) + 10000));
        salary1[3][3] = new Salary1(1004, "Alice", (random.nextDouble(80001) + 10000));
        salary1[3][4] = new Salary1(1005, "Mike", (random.nextDouble(80001) + 10000));
        salary1[3][5] = new Salary1(1006, "Sarah", (random.nextDouble(80001) + 10000));

        salary1[4][0] = new Salary1(1001, "John", (random.nextDouble(80001) + 10000));
        salary1[4][1] = new Salary1(1002, "Jane", (random.nextDouble(80001) + 10000));
        salary1[4][2] = new Salary1(1003, "Bob", (random.nextDouble(80001) + 10000));
        salary1[4][3] = new Salary1(1004, "Alice", (random.nextDouble(80001) + 10000));
        salary1[4][4] = new Salary1(1005, "Mike", (random.nextDouble(80001) + 10000));
        salary1[4][5] = new Salary1(1006, "Sarah", 38000);

        salary1[5][0] = new Salary1(1001, "John", (random.nextDouble(80001) + 10000));
        salary1[5][1] = new Salary1(1002, "Jane", (random.nextDouble(80001) + 10000));
        salary1[5][2] = new Salary1(1003, "Bob", (random.nextDouble(80001) + 10000));
        salary1[5][3] = new Salary1(1004, "Alice", (random.nextDouble(80001) + 10000));
        salary1[5][4] = new Salary1(1005, "Mike", (random.nextDouble(80001) + 10000));
        salary1[5][5] = new Salary1(1006, "Sarah", (random.nextDouble(80001) + 10000));

        System.out.println();
        for (Salary1[] salary1s : salary1) {
            for (int j = 0; j < salary1.length; j++) {
                System.out.print(salary1s[j].salary + "  " + salary1s[j].name + "  " );
            }
            System.out.println();
        }
        System.out.println();

        Salary1.CalculateSalaryByMonth(salary1);

    }
}

class Salary1 {
    //id,name,salary
    int id;
    String name;
    double salary;

    public Salary1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void CalculateSalaryByMonth(Salary1[][] salary1) {
        int totalNumberOfMonths = salary1.length;
        int totalNumberOfEmployees = salary1[0].length;
        for (int i = 0; i < totalNumberOfMonths; i++) {

            double maxSalary = salary1[i][0].salary;
            byte maxSalaryIndex = 0;
            double secondMaxSalary = salary1[i][0].salary;
            byte secondMaxSalaryIndex = 0;
            for (int j = 1; j < totalNumberOfEmployees; j++) {

                if(salary1[i][j].salary > maxSalary){
                    secondMaxSalary = maxSalary;
                    secondMaxSalaryIndex = maxSalaryIndex;
                    maxSalary = salary1[i][j].salary;
                    maxSalaryIndex = (byte) j;
                } else if (salary1[i][j].salary > secondMaxSalary) {
                    secondMaxSalary = salary1[i][j].salary;
                    secondMaxSalaryIndex = (byte) j;

                }

            }
            System.out.println("Month: " + (i + 1) + " -> " + salary1[i][maxSalaryIndex].id + ", " +  salary1[i][secondMaxSalaryIndex].id );
        }
    }
}