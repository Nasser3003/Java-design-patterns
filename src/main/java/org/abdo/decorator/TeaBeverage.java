package org.abdo.decorator;

public class TeaBeverage extends Beverage {
    @Override
    public float cost() {
        return 3;
    }

    @Override
    public String description() {
        return "Tea Drink";
    }
}
