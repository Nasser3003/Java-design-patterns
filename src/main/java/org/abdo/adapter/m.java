//package org.abdo;
//
//
//import org.abdo.adapter.Adaptee;
//import org.abdo.adapter.Client;
//import org.abdo.adapter.NewDataAdapter;
//
//public class Main {
//    public static void main(String[] args) {
//
//        var adaptee = new Adaptee();
//        var newDataAdapter = new NewDataAdapter(adaptee);
//        var client = new Client("google.com", "username", "password", newDataAdapter);
//        client.connect();
//        client.disconnect();
//
//    }
//}