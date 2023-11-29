package org.abdo.decorator;

public class RealMilk extends Drink {

    private Drink drink;
    private float cost = 1.1F;
    private String desc = ", Added Real Milk";

    public RealMilk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return drink.cost() + cost;
    }
    @Override
    public String description() {
        return drink.description() + desc;
    }
}
