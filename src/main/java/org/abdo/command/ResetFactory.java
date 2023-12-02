package org.abdo.command;

public class ResetFactory implements Command {
    private VideoEditor videoEditor;
    @Override
    public void execute() {
        videoEditor.setContrast(0);
        videoEditor.setText(null);
    }
}
