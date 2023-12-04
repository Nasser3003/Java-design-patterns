package org.abdo.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }
  private int index = 0;
  public Iterator createIterator() {
    return new IteratorList(this);
  }

  public class IteratorList implements Iterator {
    private int index = 0;
    private ProductCollection collection;

    public IteratorList(ProductCollection collection) {
      this.collection = collection;
    }

    @Override
    public Product current() {
      return collection.products.get(index);
    }

    @Override
    public boolean hasNext() {
      return index < collection.products.size();
    }

    @Override
    public void next() {
      index++;
    }
  }
}
