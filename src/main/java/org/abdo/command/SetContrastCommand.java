package org.abdo.command;

public class SetContrastCommand extends AbstractUndoableCommand {
    private final int prevContrast;
    private final int contrast;

    public SetContrastCommand(int contrast, VideoEditor videoEditor, CommandHistory history) {
        super(videoEditor, history);

        this.prevContrast = videoEditor.getContrast();
        this.contrast = contrast;
    }

    @Override
    protected void doExecute() {
        videoEditor.setContrast(contrast);
    }

    @Override
    public void unExecute() {
        videoEditor.setContrast(prevContrast);
    }

    // for troubleshooting
    @Override
    public String toString() {
        return "SetContrastCommand{" +
                "prevContrast=" + prevContrast +
                ", contrast=" + contrast +
                '}';
    }
}
