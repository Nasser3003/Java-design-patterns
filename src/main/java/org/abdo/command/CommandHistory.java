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
        UndoableCommand reversepopped = reverseHistory.pop();
        history.push(reversepopped);
        return reversepopped;
    }
    public int historySize() {
        return history.size();
    }
    public int redoHistorySize() {
        return reverseHistory.size();
    }

    // for troubleshooting
    @Override
    public String toString() {
        return "CommandHistory{" +
                "history=" + convertDequeToString(history) +
                ", reverseHistory=" + convertDequeToString(reverseHistory) +
                '}';
    }

    // for troubleshooting
    public String convertDequeToString(Deque<UndoableCommand> o) {
        StringBuilder stringBuilder = new StringBuilder();

        for (UndoableCommand command : o) {
            stringBuilder.append(command.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
