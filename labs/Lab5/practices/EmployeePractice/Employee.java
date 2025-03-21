package Lab5.practices.EmployeePractice;

import java.text.NumberFormat;

public class Employee {
    private final int id;
    private final String ssn;
    private String name;
    private double salary;

    public Employee(int id, String name, String ssn, double salary) {
        this.id = id;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void setName(String name) { this.name = name; }
    public void raiseSalary(double increase) { this.salary += increase; }

    public int getId() { return this.id; }
    public String getName() { return this.name; }
    public String getSsn() { return this.ssn; }
    public double getSalary() { return this.salary; }

    public String toString() {
        return  "Employee ID:     " + getId() + "\n" +
                "Employee Name:   " + getName() + "\n" +
                "Employee SSN:    " + getSsn() + "\n" +
                "Employee Salary: " + NumberFormat.getCurrencyInstance().format(getSalary());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Lab4.main.EmployeePractice.Employee other)) return false;
        return this.id == other.getId();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
