package org.abdo.observer;

import lombok.Getter;

@Getter
public class Stock extends Observable {
    private final String symbol;
    private int price;
    public Stock(String symbol, int price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }
}
