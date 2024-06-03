package newass;

import java.util.Arrays;

public class Ques2 {
    public static void main(String[] args) {
        SalarySlip[] salarySlips = new SalarySlip[6];



        salarySlips[0] = new SalarySlip(1001, "John", new double[]{10000, 30000, 10000, 40000, 50000, 60000});
        salarySlips[1] = new SalarySlip(1002, "Jane", new double[]{30000, 60000, 30000, 10000, 40000, 60000});
        salarySlips[2] = new SalarySlip(1003, "Bob", new double[]{18000, 50000, 20000, 30000, 60000, 60000});
        salarySlips[3] = new SalarySlip(1004, "Alice", new double[]{60000, 40000, 50000, 20000, 80000, 60000});
        salarySlips[4] = new SalarySlip(1005, "Mike", new double[]{15000, 90000, 70000, 10000, 10000, 60000});
        salarySlips[5] = new SalarySlip(1006, "Sarah", new double[]{20000, 80000, 90000, 30000, 50000, 60000});

        double v = SalarySlip.calculateAverageSalary(salarySlips);
        System.out.println("The average salary is: " + v);

        System.out.println("The top two salaries of each month are: ");
        SalarySlip.calculateTopTwoSalaries(salarySlips);
    }
}

class SalarySlip {
    private int empId;
    private String name;
    private double[] salary;

    public SalarySlip(int empId, String name, double[] salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public static double calculateAverageSalary(SalarySlip[] salarySlips) {
        double sum = 0;
        for (SalarySlip salarySlip : salarySlips) {
            sum += salarySlip.salary[0];
        }
        return sum / salarySlips.length;
    }

    public static void calculateTopTwoSalaries(SalarySlip[] salarySlips) {
        for (int month = 0; month < 6; month++) {
            double[] monthlySalaries = new double[6];
            int[] employeeIds = new int[6];

            for (int i = 0; i < salarySlips.length; i++) {
                monthlySalaries[i] = salarySlips[i].salary[month];
                employeeIds[i] = salarySlips[i].empId;
            }

            double[] topSalaries = new double[2];
            int[] topEmployeeIds = new int[2];

            for (int i = 0; i < monthlySalaries.length; i++) {
                if (monthlySalaries[i] > topSalaries[0]) {
                    topSalaries[1] = topSalaries[0];
                    topEmployeeIds[1] = topEmployeeIds[0];
                    topSalaries[0] = monthlySalaries[i];
                    topEmployeeIds[0] = employeeIds[i];
                } else if (monthlySalaries[i] > topSalaries[1]) {
                    topSalaries[1] = monthlySalaries[i];
                    topEmployeeIds[1] = employeeIds[i];
                }
            }

            System.out.println((month + 1) + " -> " + Arrays.toString(topEmployeeIds));
        }
    }
}
