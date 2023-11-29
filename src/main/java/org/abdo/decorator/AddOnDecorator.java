package org.abdo.decorator;

public abstract class Decorator extends Beverage {
    private Beverage beverage;
    @Override
    public abstract float cost() {
        beverage.cost() 
    };
}
