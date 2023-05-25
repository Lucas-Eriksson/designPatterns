import java.util.*;

public class EcommerceApp {
    public static void main(String[] args) {
        User user = new User("johnDoe", "password123", "john@example.com");
        
        Product product1 = new Product("Phone", 499.99);
        Product product2 = new Product("Laptop", 999.99);
        List<Product> products = List.of(product1, product2);
        
        Order order = new Order(user, products);
        
        double total = order.calculateTotal();
        System.out.println("Total: $" + total);
    }
}
