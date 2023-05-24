package Composite;

public class Main {
    public static void main(String[] args) {
        Employee developer1 = new Developer("John Doe", "Developer");
        Employee developer2 = new Developer("Jane Smith", "Developer");

        Manager manager1 = new Manager("Alice Brown", "Manager");
        manager1.addEmployee(developer1);
        manager1.addEmployee(developer2);

        Employee developer3 = new Developer("Bob Johnson", "Developer");

        Manager manager2 = new Manager("Carol Davis", "Senior Manager");
        manager2.addEmployee(developer3);
        manager2.addEmployee(manager1);

        manager2.showEmployeeDetails();
    }
}
