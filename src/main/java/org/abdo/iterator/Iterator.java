package org.abdo.iterator;

public interface Iterator {
    Product current();
    boolean hasNext();
    void next();
}
