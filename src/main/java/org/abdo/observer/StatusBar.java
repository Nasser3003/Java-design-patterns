package org.abdo.observer;

public class StatusBar implements Observer {
    private final Stock observable;

    public StatusBar(Stock observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update() {
        int price = observable.getPrice();
        System.out.println("Price changed caught by StatusBar to : " + price);
    }
}
