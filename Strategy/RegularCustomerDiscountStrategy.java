package Strategy;

//Concrete strategy class
public class RegularCustomerDiscountStrategy implements DiscountStrategy{

    @Override
    public double applyDiscount(double amount){
        //Apply regular customer discount logic
        return amount * 0.1; //10%
    }
}
