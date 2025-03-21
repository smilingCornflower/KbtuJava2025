package Lab5.com.example.business;

import Lab5.practices.EmployeePractice.Employee;
import Lab5.practices.EmployeePractice.Director;
import Lab5.practices.EmployeePractice.Manager;


public class EmployeeStackPlan {
    private final int employeeShare = 10;
    private final int managerShare = 100;
    private final int directorShare = 1000;

    public int grantStock(Employee empObj) {
        if (empObj instanceof Director) {
            return directorShare;
        } else if (empObj instanceof Manager) {
            return managerShare;
        } else {
            return employeeShare;
        }
    }
}
