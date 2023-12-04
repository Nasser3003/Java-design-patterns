package org.abdo.adapter;

public interface IAdapter {
    void connect(String url, String username, String  password);
    void disconnect(String url, String username, String  password);
}
