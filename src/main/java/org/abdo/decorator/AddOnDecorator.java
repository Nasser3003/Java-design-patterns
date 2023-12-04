package org.abdo.decorator;

public abstract class AddOnDecorator extends Beverage {
    private Beverage beverage;
    @Override
    public abstract float cost();
}
