package org.abdo.memento;

import java.util.Stack;

public class DocumentHistory {

    private Stack<DocumentState> states = new Stack<>();
    
    public void push(DocumentState state) {
        states.push(state);
    }
    public DocumentState pop() {
        return states.pop();
    }
}
