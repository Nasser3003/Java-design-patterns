package org.abdo.adapter;

public class NewDataAdapter implements IAdapter {
    private Adaptee adaptee;

    public NewDataAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void connect(String url, String username, String  password) {
        adaptee.connect(username, password, url);
    }

    @Override
    public void disconnect(String url, String username, String  password) {
        adaptee.disconnect(username, password, url);
    }
}
