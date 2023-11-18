package org.abdo.command;

public interface UndoableCommand extends Command {
    void undoExecute();
}
