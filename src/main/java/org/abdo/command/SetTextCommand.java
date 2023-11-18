package org.abdo.command;

public class SetTextCommand implements UndoableCommand {

    private final String text;
    private final VideoEditor videoEditor;
    private CommandHistory history;
    private String prevText;

    public SetTextCommand(String text, VideoEditor videoEditor, CommandHistory history) {
        this.text = text;
        this.videoEditor = videoEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        prevText = videoEditor.getText();
        videoEditor.setText(text);
        history.push(this);
    }

    @Override
    public void undoExecute() {
        videoEditor.setText(prevText);
    }
}
