package org.abdo.command;

public class SetTextCommand extends AbstractUndoableCommand {
    private final String prevText;
    private final String text;

    public SetTextCommand(String text, VideoEditor videoEditor, CommandHistory history) {
        super(videoEditor, history);

        this.prevText = videoEditor.getText();
        this.text = text;
    }

    @Override
    protected void doExecute() {
        videoEditor.setText(text);
    }

    @Override
    public void unExecute() {
        videoEditor.setText(prevText);
    }

}
