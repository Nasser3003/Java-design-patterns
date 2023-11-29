package org.abdo.decorator;

public class CoffeeDrink extends Drink {
    @Override
    public float cost() {
        return 2;
    }

    @Override
    public String description() {
        return "Coffee Drink";
    }
}
