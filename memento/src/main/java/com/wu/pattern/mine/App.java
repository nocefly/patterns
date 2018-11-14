package com.wu.pattern.mine;

/**
 * Hello world!
 *
 */
public class App 
{
    static MementoCaretaker mementoCaretaker = new MementoCaretaker();
    public static void main( String[] args )
    {
        Chessman chessman = new Chessman(1,1,"warrior");
        play(chessman);
        chessman.setX(2);
        play(chessman);
        undo(chessman);
        undo(chessman);
        undo(chessman);
        redo(chessman);
        chessman.setX(3);
        play(chessman);
        chessman.setX(4);
        play(chessman);
        chessman.setX(5);
        play(chessman);
        undo(chessman);
        undo(chessman);
        undo(chessman);
        undo(chessman);
        redo(chessman);
        redo(chessman);
        redo(chessman);
        redo(chessman);
        redo(chessman);
    }

    public static void play(Chessman chessman){
        mementoCaretaker.setMemento(chessman.save());
        System.out.println(String.format("Play ===== x:{%s},y:{%s},label:{%s}",chessman.getX(),chessman.getY(),chessman.getLabel()));
    }

    public static void undo(Chessman chessman){
        Memento memento = mementoCaretaker.undo();
        if(memento==null){
            System.out.println("Undo is not valid.");
            return;
        }
        chessman.restore(memento);
        System.out.println(String.format("Undo <==== x:{%s},y:{%s},label:{%s}",chessman.getX(),chessman.getY(),chessman.getLabel()));
    }

    public static void redo(Chessman chessman){
        Memento memento = mementoCaretaker.redo();
        if(memento==null){
            System.out.println("Redo is not valid.");
            return;
        }
        chessman.restore(memento);
        System.out.println(String.format("Redo <==== x:{%s},y:{%s},label:{%s}",chessman.getX(),chessman.getY(),chessman.getLabel()));
    }

}
