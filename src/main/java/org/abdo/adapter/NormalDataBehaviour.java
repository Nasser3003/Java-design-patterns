package org.abdo.adapter;

public class NormalDataBehaviour implements IAdapter {

    @Override
    public void connect(String url, String username, String password) {
        System.out.println("Connect " + url + " " + username + " " + password);
    }

    @Override
    public void disconnect(String url, String username, String password) {
        System.out.println("Disconnect " + url + " " + username + " " + password);
    }
}
