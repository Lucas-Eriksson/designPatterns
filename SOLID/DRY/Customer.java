package SOLID.DRY;

public class Customer {
    private String firstname;
    private String lastname;
    private int age;
    private String address;

    public Customer(String firstname, String lastname, int age, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
    }

    public void displayInformation() {
        System.out.println("Customer information:");
        System.out.println("First name: " + firstname);
        System.out.println("Last name: " + lastname);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    
}
