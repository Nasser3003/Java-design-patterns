package org.abdo.command;

public class ResetFactory implements Command {
    private VideoEditor videoEditor;

    public ResetFactory(VideoEditor videoEditor) {
        this.videoEditor = videoEditor;
    }

    @Override
    public void execute() {
        videoEditor.setContrast(0);
        videoEditor.setText(null);
    }
}
