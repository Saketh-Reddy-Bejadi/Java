import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employees {
  private String name;
  private String department;
  private int salary;
  public Employees() {}

  public void setName(String name) {
    this.name = name;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public Employees(String name, String department, int salary) {
    super();
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return String.format("| %-15s | %-15s | %d |", name, department, salary);
  }
}

public class Employee {
  public static void main(String[] args) {
    List<Employees> employees = Arrays.asList(
        new Employees("Emp1", "CS", 10000),
        new Employees("Emp2", "CS", 20000),
        new Employees("Emp3", "CS", 15000),
        new Employees("Emp4", "IT", 30000),
        new Employees("Emp5", "IT", 18000),
        new Employees("Emp6", "IT", 40000)
        );

    System.out.println("+-----------------+-----------------+-------+");
    System.out.println("| Name             | Department     | Salary|");
    System.out.println("+-----------------+-----------------+-------+");

    for (Employees emp : employees) {
      System.out.println(emp);
    }

    System.out.println("+-----------------+-----------------+-------+\n\n");
    System.out.println("Salary greater than 15000 are:");

    List<Employees> filteredEmployees = employees.stream()
        .filter(emp -> emp.getSalary() > 15000)
        .collect(Collectors.toList());

    System.out.println("+-----------------+-----------------+-------+");
    System.out.println("| Name             | Department     | Salary|");
    System.out.println("+-----------------+-----------------+-------+");

    for (Employees emp : filteredEmployees) {
      System.out.println(emp);
    }

    System.out.println("+-----------------+-----------------+-------+");
  }

}
