package org.abdo;


import org.abdo.singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getSingleton();

        singleton.meowSound();

    }
}