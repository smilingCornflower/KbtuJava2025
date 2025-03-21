package Lab4.test;
import Lab4.main.EmployeePractice.Employee;
import Lab4.main.EmployeePractice.Manager;

public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "John Doe", "123-45-6789", 75000, "IT Department");
        System.out.println("Created manager: " + manager.getName() + ", department: " + manager.getDeptName());

        Employee emp1 = new Employee(2, "Alice", "987-65-4321", 50000);
        Employee emp2 = new Employee(3, "Bob", "567-89-0123", 52000);

        System.out.println("Adding Alice: " + manager.addEmployee(emp1));
        System.out.println("Adding Bob: " + manager.addEmployee(emp2));
        System.out.println("Adding Alice again: " + manager.addEmployee(emp1));

        System.out.println("Alice index: " + manager.findEmployee(emp1));
        System.out.println("Bob index: " + manager.findEmployee(emp2));

        System.out.println("Staff list after adding:");
        manager.printStaffDetails();

        System.out.println("Removing Alice: " + manager.removeEmployee(emp1));
        System.out.println("Removing unknown employee: " + manager.removeEmployee(new Employee(4, "Charlie", "321-54-6789", 48000)));

        System.out.println("Staff list after removing Alice:");
        manager.printStaffDetails();
    }
}
