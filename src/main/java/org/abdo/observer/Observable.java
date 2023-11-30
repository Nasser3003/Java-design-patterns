package org.abdo.observer;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Observable {
    private Collection<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update();
        }
    }
}
