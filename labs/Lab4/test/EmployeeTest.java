package Lab4.test;

import Lab4.main.EmployeePractice.Employee;
import Lab4.main.EmployeePractice.Manager;
import Lab4.main.EmployeePractice.Admin;
import Lab4.main.EmployeePractice.Engineer;
import Lab4.main.EmployeePractice.Director;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        Engineer engineer = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Admin admin = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
        Director director = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        printEmployee(manager);
        printEmployee(engineer);
        printEmployee(admin);
        printEmployee(director);
    }
    public static void printEmployee(Employee emp) {
        System.out.println();
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee SSN: " + emp.getSsn());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
