package org.abdo.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandHistory {
    private final Deque<UndoableCommand> undoableCommands = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        undoableCommands.add(command);
    }
    public UndoableCommand pop() {
        return undoableCommands.removeLast();
    }
    public int size() {
        return undoableCommands.size();
    }

}
