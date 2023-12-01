package org.abdo;


import org.abdo.abstractFactory.LinuxFactory;
import org.abdo.abstractFactory.MacFactory;
import org.abdo.abstractFactory.WindowsFactory;

public class Main {
    public static void main(String[] args) {

        var linuxFactory = new LinuxFactory();
        var windowsFactory = new WindowsFactory();
        var macFactory = new MacFactory();

        linuxFactory.createButton().button();
        linuxFactory.createCheckbox().checkBox();

        windowsFactory.createButton().button();
        windowsFactory.createCheckbox().checkBox();

        macFactory.createButton().button();
        macFactory.createCheckbox().checkBox();

    }
}