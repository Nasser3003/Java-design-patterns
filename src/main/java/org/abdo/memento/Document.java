package org.abdo.memento;

import java.util.Objects;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public DocumentState createState() {
        return new DocumentState(content, fontName, fontSize);
    }
    public void restoreState(DocumentState state) {
        content = state.getContent();
        fontName = state.getFontName();
        fontSize = state.getFontSize();
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return fontSize == document.fontSize && Objects.equals(content, document.content) && Objects.equals(fontName, document.fontName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, fontName, fontSize);
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
