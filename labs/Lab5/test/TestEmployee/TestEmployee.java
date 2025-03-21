package Lab5.test.TestEmployee;

import Lab5.practices.EmployeePractice.Manager;
import Lab5.practices.EmployeePractice.Employee;
import Lab5.com.example.business.EmployeeStackPlan;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(207, "Barbara Johnson", "054-12-2367", 109_501.36);
        Manager manager = new Manager(1, "John Doe", "123-45-6789", 75000, "IT Department");
        EmployeeStackPlan esp = new EmployeeStackPlan();

        printEmployee(employee, esp);
        printEmployee(manager, esp);

    }
    public static void printEmployee(Employee emp, EmployeeStackPlan esp) {
        System.out.println("Employee type: " + emp.getClass().getName());
        System.out.println(emp);
        System.out.println("Stock Options: " + esp.grantStock(emp) + '\n');
    }
}
