package org.abdo.command;

public class UndoCommand implements Command {
    private CommandHistory history;

    public UndoCommand(CommandHistory history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.historySize() > 0)
            history.pop().unExecute();
    }
    public void redoExecute() {
        if (history.redoHistorySize() > 0)
            history.redo().execute();
    }
}
