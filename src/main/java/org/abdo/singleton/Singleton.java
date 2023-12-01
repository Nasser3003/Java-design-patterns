package org.abdo.singleton;

public class Singleton {
    static private Singleton singleton;
    private Singleton() {}

    static public Singleton getSingleton() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    public void meowSound() {
        System.out.println("Meow FROM SINGLETON");
    }

    //    class can do anything

}
