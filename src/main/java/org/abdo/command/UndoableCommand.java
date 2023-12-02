package org.abdo.command;

public interface UndoableCommand extends Command {
    void unExecute();
}
