//package org.abdo;
//
//
//import org.abdo.command.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        var editor = new VideoEditor();
//        var history = new CommandHistory();
//        var undoCommand = new UndoCommand(history);
//
//        var setContrastCommand1 = new SetContrastCommand(1, editor, history);
//        var setTextCommand1 = new SetTextCommand("TEST 1", editor, history);
//        setTextCommand1.execute();
//        setContrastCommand1.execute();
//
//        var setContrastCommand2 = new SetContrastCommand(2, editor, history);
//        var setTextCommand2 = new SetTextCommand("TEST 2", editor, history);
//        setTextCommand2.execute();
//        setContrastCommand2.execute();
//
//        System.out.println(editor);
//
//        undoCommand.execute();
//        System.out.println(editor);
//        undoCommand.execute();
//        undoCommand.execute();
//        undoCommand.execute();
//        undoCommand.redoExecute();
//        undoCommand.redoExecute();
//        undoCommand.redoExecute();
//        undoCommand.redoExecute();
//
//        System.out.println(editor);
//
//
//
//
//
//    }
//}