package org.abdo;


import org.abdo.command.*;

public class Main {
    public static void main(String[] args) {


        var videoEditor = new VideoEditor();
        var history = new CommandHistory();
        var undo = new UndoCommand(history);

        var setTextsCommand = new SetTextCommand("first", videoEditor, history);
        setTextsCommand.execute();

        var setContrastCommand = new SetContrastCommand(2.0, videoEditor, history);
        setContrastCommand.execute();

        var setTextsCommand1 = new SetTextCommand("third", videoEditor, history);
        setTextsCommand1.execute();

        var setContrastCommand1 = new SetContrastCommand(4.0, videoEditor, history);
        setContrastCommand1.execute();


        System.out.println(videoEditor);

        undo.execute();
        System.out.println("1st: " + videoEditor);

        undo.execute();
        System.out.println("2nd: " + videoEditor);

        undo.execute();
        System.out.println("3rd: " + videoEditor);

        undo.execute();
        System.out.println("4th: " + videoEditor);

    }
}