package Decorator;

public abstract class AddonDecorator extends Beverage{
    protected Beverage bev;

    protected AddonDecorator(Beverage bev) {
        this.bev = bev;
    }

}