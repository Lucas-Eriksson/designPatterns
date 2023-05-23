package Decorator;

public class WhippedCream extends AddonDecorator{
    
    public WhippedCream(Beverage bev) {
        super(bev);
    }

    @Override
    public String getDescription() {
        return bev.getDescription() + ", Whipped cream";
    }

    @Override
    public double getCost() {
        return bev.getCost() + 0.35;
    }

}
