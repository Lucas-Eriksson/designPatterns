package Null_object;

public class Main {

  public static void main(String[] args) {
    Address address1 = new Address("123 Main St", "City", "State");
    Person person1 = new Person("John Doe", address1);

    Address address2 = null;
    Person person2 = new Person("Jane Smith", address2);

    printPersonDetails(person1);
    printPersonDetails(person2);
  }

  public static void printPersonDetails(Person person) {
    System.out.println("Name: " + person.getName());
    person
      .getAddress()
      .ifPresentOrElse(
        address -> {
          System.out.println("Address: ");
          System.out.println("Street: " + address.getStreet());
          System.out.println("City: " + address.getCity());
          System.out.println("State: " + address.getCountry());
        },
        () -> System.out.println("No address available.")
      );
    System.out.println();
  }
}
