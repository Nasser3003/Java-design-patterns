package org.abdo.decorator;

public class CoffeeBeverage extends Beverage {
    @Override
    public float cost() {
        return 2;
    }

    @Override
    public String description() {
        return "Coffee Drink";
    }
}
