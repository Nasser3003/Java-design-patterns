package org.abdo.template;

public class WindowTwo extends Close {
    @Override
    protected void executeAfterClose() {
        System.out.println("Executing After CLosing some cooode");
    }

}
