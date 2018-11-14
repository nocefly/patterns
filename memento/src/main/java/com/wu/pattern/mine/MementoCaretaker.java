package com.wu.pattern.mine;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Title: MementoCaretaker
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
public class MementoCaretaker {
    private int MAX_SIZE = 3;
    private LinkedList<Memento> undo = new LinkedList<>();
    private LinkedList<Memento> redo = new LinkedList<>();
    private int cursor = 0;

    public Memento undo(){
        if(undo.size()<=0)
            return null;
        Memento memento = undo.pop();
        redo.push(memento);
        return memento;
    }

    public Memento redo(){
        if(redo.size()<=0)
            return null;
        Memento memento = redo.pop();
        undo.push(memento);
        return memento;
    }

    public void setMemento(Memento memento){
        if(undo.size()>MAX_SIZE){
            undo.removeLast();
            undo.push(memento);
            return;
        }
        undo.push(memento);
        if(redo.size()!=0)
            redo.clear();
    }

}
