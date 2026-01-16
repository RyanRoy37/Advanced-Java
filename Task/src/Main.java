import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
 /*String a ="1808, हरयाणा - 121001 Address:S/O: Gopal, 1808, nehru Colony no. 3, Faridabad, Faridabad, Haryana-";
 String b="B VennalaD/O Mani11-77/2Poolavani GuntatirupatiTirupati (Urban)Chittoor Andhra Prad";
 System.out.println(a.length());
 System.out.println(b.length());*/
        List<Employee> employees = List.of(
                new Employee(1, "Alice Johnson", "Engineering", 120000, true,
                        List.of("Java", "Spring", "Docker")),

                new Employee(2, "Bob Smith", "Engineering", 95000, true,
                        List.of("Java", "Kubernetes")),

                new Employee(3, "Charlie Brown", "HR", 70000, true,
                        List.of("Recruitment", "Onboarding")),

                new Employee(4, "Diana Prince", "Finance", 110000, true,
                        List.of("Accounting", "Excel", "Compliance")),

                new Employee(5, "Ethan Hunt", "Security", 130000, false,
                        List.of("PenTesting", "Networking")),

                new Employee(6, "Fiona Gallagher", "Engineering", 105000, true,
                        List.of("Java", "Microservices", "AWS")),

                new Employee(7, "George Miller", "Marketing", 85000, true,
                        List.of("SEO", "Content Writing")),

                new Employee(8, "Hannah Lee", "Marketing", 90000, false,
                        List.of("Branding", "Social Media")),

                new Employee(9, "Ivan Petrov", "Engineering", 115000, true,
                        List.of("Scala", "Kafka", "Java")),

                new Employee(10, "Julia Roberts", "HR", 75000, true,
                        List.of("Employee Relations", "Payroll")),

                new Employee(11, "Kevin Durant", "Finance", 125000, true,
                        List.of("Investment", "Risk Analysis")),

                new Employee(12, "Laura Palmer", "Engineering", 98000, false,
                        List.of("JavaScript", "React")),

                new Employee(13, "Michael Scott", "Sales", 88000, true,
                        List.of("Negotiation", "Client Management")),

                new Employee(14, "Nina Williams", "Sales", 92000, true,
                        List.of("Lead Generation", "CRM")),

                new Employee(15, "Oscar Martinez", "Finance", 100000, false,
                        List.of("Taxation", "Auditing"))
        );

        Predicate<Employee> predicate = s -> s.getSalary() > 90000;
        System.out.println("Employees with salary greater than 90000" +
                employees.stream().filter(predicate).collect(Collectors.toList()));

        Function<Employee, String> function = s -> s.getName().toUpperCase();
        System.out.println("Employee names are: " + employees.stream().map(function).collect(Collectors.joining(",")));

        Comparator<Employee> comparator = Comparator.comparing(Employee::getSalary);
        System.out.println("The highest paid employee is " + employees.stream().max(comparator).get());

        System.out.println("The total salary is  " + employees.stream().mapToDouble(Employee::getSalary).sum());
        System.out.println("The average salary is: " + employees.stream().mapToDouble(Employee::getSalary).average());

        System.out.println("The employees working in Engineering are :" + employees.stream().filter(e -> "Engineering".equals(e.getDepartment())).map(Employee::getName).collect(Collectors.toList()));
    }
}