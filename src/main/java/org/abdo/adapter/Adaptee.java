package org.abdo.adapter;

public class Adaptee {
    public void connect(String username, String password, String url) {
        System.out.println("Connect " + username + " " + password + " " + url );

    }

    public void disconnect(String username, String password, String url) {
        System.out.println("Disconnect " + username + " " + password + " " + url );
    }
}
