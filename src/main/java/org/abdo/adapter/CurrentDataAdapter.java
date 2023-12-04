package org.abdo.adapter;

public class NormalDataBehaviour implements IAdapter {
    @Override
    public void connect(int pin, String username, String password) {
        System.out.println("Connect " + pin + " " + username + " " + password );

    }

    @Override
    public void disconnect(int pin, String username, String password) {
        System.out.println("Disconnect " + pin + " " + username + " " + password );
    }
}
