package SOLID.DRY;

import java.util.Scanner;

public class CustomerRegistration {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String firstname = getInput("Enter your first name: ");
        String lastname = getInput("Enter your last name: ");
        int age = Integer.parseInt(getInput("Enter your age: "));
        String address = getInput("Enter your address: ");

        Customer customer = new Customer(firstname, lastname, age, address);
        customer.displayInformation();
    }

    private static String getInput(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }
}
