package Lab4.main.EmployeePractice;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
