import java.util.List;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private boolean active;
    private List<String> skills;

    public Employee(int id, String name, String department, double salary, boolean active, List<String> skills) {
        this.id = id;
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.active=active;
        this.skills=skills;

    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public boolean isActive() {
        return active;
    }
    public List<String> getSkills() {
        return skills;
    }

}
