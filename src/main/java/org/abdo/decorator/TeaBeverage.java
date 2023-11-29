package org.abdo.decorator;

public class TeaDrink extends Drink {
    @Override
    public float cost() {
        return 3;
    }

    @Override
    public String description() {
        return "Tea Drink";
    }
}
