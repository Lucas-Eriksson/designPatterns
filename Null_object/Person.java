package Null_object;

import java.util.Optional;

public class Person {

  private String name;
  private Optional<Address> address;

  public Person(String name, Address address) {
    this.name = name;
    this.address = Optional.ofNullable(address);
  }

  public String getName() {
    return name;
  }

  public Optional<Address> getAddress() {
    return address;
  }
}
