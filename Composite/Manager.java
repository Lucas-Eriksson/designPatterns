package Composite;

import java.util.*;

//Composite class
public class Manager implements Employee {

  private String name;
  private String position;
  private List<Employee> subordinates;

  public Manager(String name, String position) {
    this.name = name;
    this.position = position;
    subordinates = new ArrayList<Employee>();
  }

  public void addEmployee(Employee employee) {
    subordinates.add(employee);
  }

  public void removeEmployee(Employee employee) {
    subordinates.remove(employee);
  }

  @Override
  public void showEmployeeDetails() {
    System.out.println("Manager " + name + ", Position: " + position);
    System.out.println("Subordinates: ");
    for (Employee e : subordinates) {
      e.showEmployeeDetails();
    }
  }
}
