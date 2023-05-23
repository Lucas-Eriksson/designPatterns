package Decorator;

public class main {

    public static void main(String[] args) {
        Beverage bev = new Latte();
        System.out.println(bev.getDescription() + "$ " + bev.getCost());

        
    }

}
