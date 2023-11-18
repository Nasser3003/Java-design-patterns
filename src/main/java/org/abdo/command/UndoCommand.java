package org.abdo.command;

public class UndoCommand implements Command {
    private final CommandHistory commandHistory;

    public UndoCommand(CommandHistory commandHistory) {
        this.commandHistory = commandHistory;
    }

    @Override
    public void execute() {
        if (commandHistory.size() > 0)
            commandHistory.pop().undoExecute();
    }
}
