import java.util.*;
class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        // Adding Employee objects to the list
        employees.add(new Employee(201, "AAAA", 50000));
        employees.add(new Employee(202, "BBBB", 55000));
        employees.add(new Employee(203, "CCCC", 60000));
        
        // Displaying details of all employees
        System.out.println("*********************Employee Details:*********************");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
