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
//
//        var txtCMD1 = new SetTextCommand("Hi 1", editor, history);
//        txtCMD1.execute();
//        var txtCMD2 = new SetTextCommand("Hi 2", editor, history);
//        txtCMD2.execute();
//        var txtCMD3 = new SetTextCommand("Hi 3", editor, history);
//        txtCMD3.execute();
//        var txtCMD4 = new SetTextCommand("Hi 4", editor, history);
//        txtCMD4.execute();
//
//        System.out.println("-----------------------------------------");
//        System.out.println(editor);
//        System.out.println("-----------------------------------------");
//
//        undoCommand.execute();
//        System.out.println("-----------------------------------------");
//        System.out.println(editor);
//        System.out.println("-----------------------------------------");        undoCommand.execute();
//        System.out.println("-----------------------------------------");
//        System.out.println(editor);
//        System.out.println("-----------------------------------------");
//
//    }
//}







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
//        setContrastCommand1.execute();
//        var setContrastCommand2 = new SetContrastCommand(2, editor, history);
//        setContrastCommand2.execute();
//        var setContrastCommand3 = new SetContrastCommand(3, editor, history);
//        setContrastCommand3.execute();
//        var setContrastCommand4 = new SetContrastCommand(4, editor, history);
//        setContrastCommand4.execute();
//
//        System.out.println("-----------------------------------------");
//        System.out.println(editor);
//        System.out.println("-----------------------------------------");
//
//        undoCommand.execute();
//        undoCommand.execute();
//
//        System.out.println("-----------------------------------------");
//        System.out.println(editor);
//        System.out.println("-----------------------------------------");
//
//        undoCommand.redoExecute();
//
//        System.out.println("-----------------------------------------");
//        System.out.println(editor);
//        System.out.println("-----------------------------------------");
//
//    }
//}