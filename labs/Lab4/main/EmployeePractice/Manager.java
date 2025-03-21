package Lab4.main.EmployeePractice;

public class Manager extends Employee {
    private String deptName;
    private Employee[] staff;
    private int employeeCount;
    private static final int MAX_STAFF = 20;

    public Manager(int id, String name, String ssn, double salary, String deptName) {
        super(id, name, ssn, salary);
        this.deptName = deptName;
        this.staff = new Employee[MAX_STAFF];
        this.employeeCount = 0;
    }

    public String getDeptName() {
        return this.deptName;
    }

    public int findEmployee(Employee emp) {
        for (int i = 0; i < this.employeeCount; i++) {
            if (this.staff[i].equals(emp)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addEmployee(Employee emp) {
        if (this.employeeCount >= MAX_STAFF) {
            return false;
        }
        if (this.findEmployee(emp) >= 0) {
            return false;
        }
        this.staff[this.employeeCount] = emp;
        this.employeeCount++;
        return true;
    }

    public boolean removeEmployee(Employee emp) {
        boolean isRemoved = false;
        Employee[] tempStaff = new Employee[MAX_STAFF];
        int tempIndex = 0;

        for (int i = 0; i < this.employeeCount; i++) {
            if (this.staff[i].equals(emp)) {
                isRemoved = true;
            } else {
                tempStaff[tempIndex++] = this.staff[i];
            }
        }
        if (isRemoved) {
            this.staff = tempStaff;
            this.employeeCount--;
        }
        return isRemoved;
    }

    public void printStaffDetails() {
        System.out.println("Manager: " + this.getName());
        if (this.employeeCount == 0) {
            System.out.println("No staff members.");
        } else {
            System.out.println("Staff members:");
            for (int i = 0; i < this.employeeCount; i++) {
                System.out.println("- " + this.staff[i].getName());
            }
        }
    }
}
