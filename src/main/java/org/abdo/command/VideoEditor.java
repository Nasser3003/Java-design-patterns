package org.abdo.command;

public class VideoEditor {
    private double contrast = 0.5;
    private String text;

    protected String getText() {
        return text;
    }

    protected void setText(String text) {
        this.text = text;
    }

    protected double getContrast() {
        return contrast;
    }

    protected void setContrast(double contrast) {
        this.contrast = contrast;
    }

    @Override
    public String toString() {
        return "VideoEditor{" +
                "contrast=" + contrast +
                ", text='" + text + '\'' +
                '}';
    }
}
