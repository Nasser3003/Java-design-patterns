package org.abdo.template;

public abstract class Close {

    protected void executeBeforeClose() {}

    public void close() {
        executeBeforeClose();
        System.out.println("Window is closed");
        executeAfterClose();
    }

    protected void executeAfterClose() {}
}
