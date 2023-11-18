package org.abdo.command;

public class SetContrastCommand implements UndoableCommand {
    private final double contrast;
    private final VideoEditor videoEditor;
    private final CommandHistory history;
    private double prevContrast;

    public SetContrastCommand(double contrast, VideoEditor videoEditor, CommandHistory history) {
        this.videoEditor = videoEditor;
        this.history = history;
        this.contrast = contrast;
    }

    @Override
    public void execute() {
        prevContrast = videoEditor.getContrast();
        videoEditor.setContrast(contrast);
        history.push(this);
    }

    @Override
    public void undoExecute() {
        videoEditor.setContrast(prevContrast);
    }
}
