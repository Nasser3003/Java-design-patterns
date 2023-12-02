package org.abdo;


import org.abdo.command.*;

public class Main {
    public static void main(String[] args) {

        var editor = new VideoEditor();
        var history = new CommandHistory();
        var undoCommand = new UndoCommand(history);

        var setContrastCommand1 = new SetContrastCommand(1, editor, history);
        setContrastCommand1.execute();
        var setContrastCommand2 = new SetContrastCommand(2, editor, history);
        setContrastCommand2.execute();
        var setContrastCommand3 = new SetContrastCommand(3, editor, history);
        setContrastCommand3.execute();
        var setContrastCommand4 = new SetContrastCommand(4, editor, history);
        setContrastCommand4.execute();

        System.out.println("-----------------------------------------");
        System.out.println(editor);
        System.out.println("-----------------------------------------");

        undoCommand.execute();
        undoCommand.execute();

        System.out.println("-----------------------------------------");
        System.out.println(editor);
        System.out.println("-----------------------------------------");

        undoCommand.redoExecute();

        System.out.println("-----------------------------------------");
        System.out.println(editor);
        System.out.println("-----------------------------------------");

    }
}