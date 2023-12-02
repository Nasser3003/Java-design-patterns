package org.abdo.command;

public abstract class AbstractUndoableCommand implements UndoableCommand {

    protected VideoEditor videoEditor;
    protected CommandHistory history;

    public AbstractUndoableCommand(VideoEditor videoEditor, CommandHistory history) {
        this.videoEditor = videoEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}
