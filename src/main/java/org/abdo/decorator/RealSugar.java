package org.abdo.decorator;

public class RealSugar extends Drink {
    private Drink drink;
    private float cost = .5F;
    private String desc = ", Added Real Sugar";

    public RealSugar(Drink drink) {
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
