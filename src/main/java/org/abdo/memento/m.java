/*
package org.abdo;

import org.abdo.mementoPattern.Document;
import org.abdo.mementoPattern.DocumentHistory;
import org.abdo.mementoPattern.DocumentState;

public class Main {
    public static void main(String[] args) {

        Document text = new Document();
        DocumentHistory history = new DocumentHistory();

        text.setContent("CONTENT 1");
        text.setFontName("FONT 1");
        text.setFontSize(1);

        DocumentState state1 = text.createState();
        history.push(state1);

        text.setContent("CONTENT 2");
        text.setFontName("FONT 2");
        text.setFontSize(2);

        DocumentState state2 = text.createState();
        history.push(state2);

        text.setContent("CONTENT 3");
        text.setFontName("FONT 3");
        text.setFontSize(3);

        text.restoreState(history.pop());
        System.out.println(text);
    }
}
 */