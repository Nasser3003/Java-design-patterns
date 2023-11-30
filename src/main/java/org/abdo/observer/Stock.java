package org.abdo.observer;

public class Stock extends Observable {
    private String symbol;
    private int price;
    public Stock(String symbol, int price) {
        this.symbol = symbol;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }
}
