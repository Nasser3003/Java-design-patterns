package org.abdo.adapter;

public class Client {
    private String url;
    private String username;
    private String password;
    private IAdapter adapter;

    public Client(String url, String username, String password, IAdapter adapter) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.adapter = adapter;
    }

    public void connect() {
        adapter.connect(url, username, password);
    }
    public void disconnect() {
        adapter.disconnect(url, username, password);
    }

}
