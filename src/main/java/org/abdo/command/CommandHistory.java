package org.abdo.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class
CommandHistory {
    private final Deque<UndoableCommand> history = new ArrayDeque<>();
    private final Deque<UndoableCommand> reverseHistory = new ArrayDeque<>();

    public void push(UndoableCommand undoableCommand) {
        history.push(undoableCommand);
    }
    public UndoableCommand pop() {
        UndoableCommand popped = history.pop();
        reverseHistory.push(popped);
        return popped;
    }
    public UndoableCommand redo() {
        return reverseHistory.pop();
    }
    public int historySize() {
        return history.size();
    }
    public int redoHistorySize() {
        return reverseHistory.size();
    }

}
